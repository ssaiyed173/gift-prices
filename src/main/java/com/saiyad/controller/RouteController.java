package com.saiyad.controller;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.saiyad.model.BalanceSheet;
import com.saiyad.model.CreditPeriod;
import com.saiyad.model.Price;
import com.saiyad.model.Show;
import com.saiyad.repo.BalanceSheetRepository;
import com.saiyad.repo.CreditPeriodRepo;
import com.saiyad.repo.PriceRepository;
import com.saiyad.repo.ShowRepository;

@Controller
public class RouteController {

	@Autowired
	private ShowRepository showRepository;
	
	@Autowired
	private PriceRepository priceRepository;
	
	@Autowired
	private CreditPeriodRepo creditPeriodRepo;

	@Autowired
	private BalanceSheetRepository balanceSheetRepository;
	
	@GetMapping({"/","/index"})
	public ModelAndView home(){
		ModelAndView model = new ModelAndView("index");
		BalanceSheet balance = balanceSheetRepository.findById(1L).get();
		BalanceSheet pending = new BalanceSheet();
		Integer pendingGv = priceRepository.findPendingGiftVouchers();
		pending.setGv(Objects.isNull(pendingGv) ? 0 : pendingGv);
		Integer pendingSc = priceRepository.findPendingSuperCoins();
		pending.setSc(Objects.isNull(pendingSc) ? 0 : pendingSc);
		model.addObject("balance", balance);
		model.addObject("pending", pending);
		return model;
	}

	@GetMapping("/shows")
	public ModelAndView shows(){
		ModelAndView model = new ModelAndView("shows");
		List<Show> shows = showRepository.findAll();
		model.addObject("shows", shows);
		return model;
	}
	
	@GetMapping("/create-show")
	public String createShow(){
		return "create-show";
	}
	
	@GetMapping("/update-active")
	public ModelAndView updateStatus(@RequestParam("id") Long id){
		ModelAndView model = new ModelAndView("update-active");
		Show show = showRepository.findById(id).get();
		model.addObject("show",show);
		return model;
	}
	
	@GetMapping("/prices")
	public ModelAndView prices(){
		ModelAndView model = new ModelAndView("prices");
		List<Price> prices = priceRepository.findAll();
		model.addObject("prices", prices);
		return model;
	}
	
	@GetMapping("/add-price")
	public ModelAndView addPrice(){
		ModelAndView model = new ModelAndView("add-price");
		List<Show> shows = showRepository.findByActive("Yes");
		
		model.addObject("shows", shows);
		return model;
	}
	
	@GetMapping("update-credited")
	public ModelAndView updateCredited(@RequestParam("id") Long id){
		Price price = priceRepository.findById(id).get();
		List<Show> shows = showRepository.findByActive("Yes");

		ModelAndView model = new ModelAndView("update-credited");		
		model.addObject("shows", shows);
		model.addObject("price", price);
		return model;
	}

	@GetMapping("/credit-period")
	public ModelAndView creditPeriod(){
		CreditPeriod period = creditPeriodRepo.findById(1).get();
		ModelAndView model = new ModelAndView("credit-period");
		model.addObject("period", period);
		return model;
	}

	@GetMapping("/transaction")
	public ModelAndView transaction(){
		ModelAndView model = new ModelAndView("transaction");
		return model;
	}
}

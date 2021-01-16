package com.saiyad.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.saiyad.model.BalanceSheet;
import com.saiyad.model.CreditPeriod;
import com.saiyad.model.Price;
import com.saiyad.repo.BalanceSheetRepository;
import com.saiyad.repo.CreditPeriodRepo;
import com.saiyad.repo.PriceRepository;

@Controller
public class PriceController {


	@Autowired
	private PriceRepository priceRepository;
	
	@Autowired
	private CreditPeriodRepo creditPeriodRepo;
	
	@Autowired
	private BalanceSheetRepository balanceSheetRepository;

	private Calendar cal = Calendar.getInstance();
	
	@PostMapping("add-price")
	public ModelAndView addPrice(@ModelAttribute Price price){
		CreditPeriod period = creditPeriodRepo.findById(1).get();
		cal.setTime(price.getWinningDate());
		if(price.getType().equals("Super Coin")){
			cal.add(Calendar.DAY_OF_MONTH, period.getSc());
		}else if(price.getType().equals("Gift Voucher")){
			cal.add(Calendar.DAY_OF_MONTH, period.getGv());
		}
		Date creditDate = cal.getTime();
		price.setCreditDate(creditDate);
		priceRepository.save(price);
		if(price.isCredited()){
			BalanceSheet balance = balanceSheetRepository.findById(1L).get();
			if(price.getType().equals("Super Coin"))
				balance.setSc(balance.getSc() + price.getAmount());
			else if(price.getType().equals("Gift Voucher"))
				balance.setGv(balance.getGv() + price.getAmount());
			balanceSheetRepository.save(balance);
		}
		ModelAndView model = new ModelAndView("prices");
		List<Price> prices = priceRepository.findAll();
		model.addObject("prices", prices);
		return model;
	}
	
	@PostMapping("update-credited")
	public ModelAndView updateCredited(@ModelAttribute Price price){
		priceRepository.save(price);
		if(price.isCredited()){
			BalanceSheet balance = balanceSheetRepository.findById(1L).get();
			if(price.getType().equals("Super Coin"))
				balance.setSc(balance.getSc() + price.getAmount());
			else if(price.getType().equals("Gift Voucher"))
				balance.setGv(balance.getGv() + price.getAmount());
			balanceSheetRepository.save(balance);
		}
		
		ModelAndView model = new ModelAndView("prices");
		List<Price> prices = priceRepository.findAll();
		model.addObject("prices", prices);
		return model;
	}
}

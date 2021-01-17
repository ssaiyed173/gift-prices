package com.saiyad.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.saiyad.model.BalanceSheet;
import com.saiyad.model.Transaction;
import com.saiyad.repo.BalanceSheetRepository;
import com.saiyad.repo.PriceRepository;

@Controller
public class TransactionController {

	@Autowired
	private BalanceSheetRepository balanceSheetRepository;
	
	@Autowired
	private PriceRepository priceRepository;
	
	@PostMapping("/transaction-gv")
	public ModelAndView transactionGiftVoucher(@ModelAttribute Transaction transaction){
		ModelAndView model = new ModelAndView("index");
		BalanceSheet balance = balanceSheetRepository.findById(1L).get();
		
		if(transaction.getType().equals("CR")){
			balance.setGv(balance.getGv() + transaction.getAmount());
		}else if(transaction.getType().equals("WD")){
			if(balance.getGv() >= transaction.getAmount()){
				balance.setGv(balance.getGv() - transaction.getAmount());
			}
		}
		balanceSheetRepository.save(balance);
		balance = balanceSheetRepository.findById(1L).get();
		BalanceSheet pending = new BalanceSheet();
		Integer pendingGv = priceRepository.findPendingGiftVouchers();
		pending.setGv(Objects.isNull(pendingGv) ? 0 : pendingGv);
		Integer pendingSc = priceRepository.findPendingSuperCoins();
		pending.setSc(Objects.isNull(pendingSc) ? 0 : pendingSc);
		model.addObject("balance", balance);
		model.addObject("pending", pending);
		return model;
	}
	
	@PostMapping("/transaction-sc")
	public ModelAndView transactionSuperCoin(@ModelAttribute Transaction transaction){
		BalanceSheet balance = balanceSheetRepository.findById(1L).get();
		if(transaction.getType().equals("CR")){
			balance.setSc(balance.getSc() + (int)transaction.getAmount());
		}else if(transaction.getType().equals("WD")){
			if(balance.getSc() >= transaction.getAmount()){
				balance.setSc(balance.getSc() - (int)transaction.getAmount());
			}
		}
		balanceSheetRepository.save(balance);
		ModelAndView model = new ModelAndView("index");
		balance = balanceSheetRepository.findById(1L).get();
		BalanceSheet pending = new BalanceSheet();
		Integer pendingGv = priceRepository.findPendingGiftVouchers();
		pending.setGv(Objects.isNull(pendingGv) ? 0 : pendingGv);
		Integer pendingSc = priceRepository.findPendingSuperCoins();
		pending.setSc(Objects.isNull(pendingSc) ? 0 : pendingSc);
		model.addObject("balance", balance);
		model.addObject("pending", pending);
		return model;
	}
	
	@GetMapping("/error")
	public String error(){
		return "error";
	}
}

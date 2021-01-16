package com.saiyad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.saiyad.model.CreditPeriod;
import com.saiyad.repo.CreditPeriodRepo;

@Controller
public class CreditedPeriodController {

	@Autowired
	private CreditPeriodRepo creditPeriodRepo;

	@PostMapping("save-period")
	public ModelAndView savePeriod(@ModelAttribute CreditPeriod period){
		creditPeriodRepo.save(period);
		ModelAndView model = new ModelAndView("credit-period");
		model.addObject("period",period);
		return model;
	}
}

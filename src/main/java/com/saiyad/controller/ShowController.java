package com.saiyad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.saiyad.model.Show;
import com.saiyad.repo.ShowRepository;

@Controller
public class ShowController {

	@Autowired
	private ShowRepository showRepository;
	
	@PostMapping("/create-show")
	public ModelAndView createShow(@ModelAttribute Show show){
		showRepository.save(show);
		List<Show> shows = showRepository.findAll();
		ModelAndView model = new ModelAndView("shows");
		model.addObject("shows",shows);
		return model;
	}
	
	@PostMapping("/update-active")
	public ModelAndView updateActive(@ModelAttribute Show show){
		showRepository.save(show);
		List<Show> shows = showRepository.findAll();
		ModelAndView model = new ModelAndView("shows");
		model.addObject("shows",shows);
		return model;
	}
}

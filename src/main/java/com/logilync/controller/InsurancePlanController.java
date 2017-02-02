package com.logilync.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.logilync.domain.Insurance;
import com.logilync.repository.InsuranceRepo;


@Controller
public class InsurancePlanController {
	@Autowired
	InsuranceRepo insuranceRepo;
	
	
	@RequestMapping(value="/createInsurancePlan", method=RequestMethod.GET)
	public String showCreatePerson(){
		return "createInsurancePlan";
	}
	
	@RequestMapping(value="/saveInsurancePlan", method=RequestMethod.POST)
	public String saveInsurancePlan(Insurance insurance, Model model){
		insurance=insuranceRepo.save(insurance);
		model.addAttribute("insurance",insurance);
		return "insurance";
	}

}

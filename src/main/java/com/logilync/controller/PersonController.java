package com.logilync.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.logilync.domain.Person;
import com.logilync.repository.PersonRepo;

@Controller
public class PersonController {
	@Autowired
	PersonRepo personRepo;
	
	
	@RequestMapping(value="/createPerson", method=RequestMethod.GET)
	public String showCreatePerson(){
		return "createPerson";
	}
	
	@RequestMapping(value="/savePerson", method=RequestMethod.POST)
	public String saveCreatePerson(Person person, Model model){
		person=personRepo.save(person);
		model.addAttribute("person",person);
		return "person";
	}

}

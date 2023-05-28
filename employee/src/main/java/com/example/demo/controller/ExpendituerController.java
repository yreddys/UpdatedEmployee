package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Employee;
import com.example.demo.repository.ExpenditureRepository;

@Controller
public class ExpendituerController {
@Autowired
private ExpenditureRepository repo;


@GetMapping({"showemployees", "/","/list"})
public ModelAndView getAllEmployees() {
    ModelAndView mav = new ModelAndView("list-employees");
    mav.addObject("employees", repo.findAll());
    return mav;
}
@GetMapping("/addEmployeeForm")
public ModelAndView addEmployeeForm() {
	 ModelAndView mav = new ModelAndView("add-employee-form");
	 Employee newEmployee= new Employee();
	    mav.addObject("employees", newEmployee);
	    return mav;
	
}

@PostMapping("/saveEmployee")
public String saveEmployee(@ModelAttribute Employee employee) {
	
	repo.save(employee);
	return "redirect:/list";
}

@GetMapping("/deleteEmployee")
public String deleteEmployee(@RequestParam Long employeeId) {
	repo.deleteById(employeeId);
	return "redirect:/list";
}
}

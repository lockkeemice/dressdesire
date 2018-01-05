package com.project.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.service.CategorySevice;


@Controller
public class HomeController {

	
	
	@RequestMapping("/")
	public String showPage(){
		
		return "home";
	}
	@Autowired
	private CategorySevice categoryService;
	@RequestMapping("/home")
public String homePage(HttpSession session){
		session.setAttribute("categories",categoryService.getAllCategories());
	return "home";
}
	
	@RequestMapping("/aboutus")	
	public String aboutUs(){
		return "aboutus";
	}
	@RequestMapping("/login")
	public String login(@RequestParam(value="error",required=false) String error,
			@RequestParam(value="logout",required=false) String logout,
			Model model){
		if(error!=null)
			model.addAttribute("error"," Invalid Username and Password");
		if(logout!=null)
			model.addAttribute("logout","  Loggedout successfully");
		return "login";
	}
}

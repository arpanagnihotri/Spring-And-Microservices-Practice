package com.web.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
/*	public String home(HttpServletRequest req,HttpServletResponse res) {
		
		HttpSession session=req.getSession();
		String name=req.getParameter("name");
		System.out.println("hi "+name);
		session.setAttribute("name", name);
		
		return "home";
	}*/
	/*public ModelAndView home(@RequestParam("name")String name) {//No HttpSession required
		ModelAndView mv=new ModelAndView();
		mv.addObject("name",name);
		mv.setViewName("home");	
		return mv;
	}*/
	public ModelAndView home(Alien alien) {//No HttpSession required
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");	
		return mv;
	}
}

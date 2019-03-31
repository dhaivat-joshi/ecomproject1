package com.ecommerece.commn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerece.commn.admin.entity.product;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String add(ModelMap model)
	{
		product p = new product();
		p.setProd_id(1);
		
		model.put("object", p);
		return "index1.jsp";
	}

	@GetMapping("/adduser")
	public ModelAndView controller()
	{
		//System.out.println(argname);
		ModelAndView mv = new ModelAndView("status.jsp");
		mv.addObject("hello","time is success");
		return mv;
	}
	@GetMapping(value="test/{hello}")
	public ModelAndView show(@PathVariable("hello")String show)
	{
		ModelAndView mv = new ModelAndView("show.jsp");
		mv.addObject("welcome",show);
		return mv;
	}
	@RequestMapping(value="object1/{id}",method = RequestMethod.GET)
	public String con(@PathVariable("id")String id)
	{
		System.out.println(id);
		return "id";
	}
	@GetMapping("/user")
	public ModelAndView show1(@RequestParam("id")String get)
	{
		ModelAndView mv = new ModelAndView("show.jsp");
		mv.addObject("welcome",get);
		return mv;
		
	}
	@GetMapping(value="controller")
	public void Show(@RequestParam("k")String k)
	{
		System.out.println(k);
	}
}


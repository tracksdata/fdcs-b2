package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.model.Product;

@Controller
public class ProductController {

	@RequestMapping(value = { "/s1" })
	public void test1() {
		System.out.println("--- test1 method of ProductController");
	}

	@RequestMapping(value = { "s2" })
	public void test2() {
		System.out.println("--- test2 method of ProductController");
	}

	@RequestMapping("s3")
	public String test3() {
		System.out.println("-- test3 method");
		return "one";
	}

	@RequestMapping("s4")
	public String test4(Model myData) {
		System.out.println("-- test4 method");

		myData.addAttribute("name", "Praveen Reddy S");

		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Mac Book Pro");
		prod.setPrice(250000);

		myData.addAttribute("product", prod);

		return "display";
	}

	@RequestMapping("s5")
	public ModelAndView test5() {

		ModelAndView mav = new ModelAndView();

		Product prod = new Product();
		prod.setProdId("P002");
		prod.setProdName("Mac Air");
		prod.setPrice(190000);

		mav.setViewName("display");
		
		mav.addObject("product", prod);
		mav.addObject("name", "James");

		return mav;

	}

}

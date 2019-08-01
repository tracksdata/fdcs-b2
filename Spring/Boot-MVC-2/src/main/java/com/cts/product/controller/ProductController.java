package com.cts.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entities.Product;
import com.cts.product.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService ps;

	@RequestMapping("/")
	public String welcomePage() {
		return "index";
	}

	@RequestMapping("loadProductForm")
	public String loadProductForm() {
		return "productform";
	}

	@RequestMapping("saveProduct")
	public String saveProduct(@RequestParam("prodId") String prodId, @RequestParam("prodName") String prodName,
			@RequestParam("price") double price, Model model) {

		Product prod = new Product();
		prod.setProdId(prodId);
		prod.setProdName(prodName);
		prod.setPrice(price);

		model.addAttribute("product", prod);

		return "display";
	}

	@RequestMapping("saveProduct_v2")
	public ModelAndView saveProduct_V1(@ModelAttribute Product prod) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("display");
		mav.addObject("product", prod);

		ps.saveProduct(prod);

		mav.setViewName("redirect:listAll");

		return mav;
	}

	@RequestMapping("loadFindProductForm")
	public String findProductForm(@ModelAttribute Product prod, Model model) {

		List<Product> prods = ps.findAll();

		List<String> ids = new ArrayList<>();

		for (Product p : prods) {
			BeanUtils.copyProperties(ids, p);
			ids.add(p.getProdId());

		}

		prod.setIds(ids);

		model.addAttribute("prods", prod);
		model.addAttribute("product", null);

		return "findproduct";
	}

	@RequestMapping("findProductForm")
	public String loadFindPage() {
		return "find";
	}

	@RequestMapping("removeProduct")
	public String removeProduct(@RequestParam("prodId") String prodId) {

		ps.deleteProductById(prodId);

		return "redirect:listAll";
	}

	@RequestMapping("findProduct")
	public String loadProduct(@RequestParam("prodId") String prodId, @RequestParam("option") String option,
			Model model) {
		String pageUrl = "findproduct";

		if (option.equals("update")) {
			pageUrl = "update";
		}
		if (option.equals("display")) {
			pageUrl = "product";
		}

		Product prod = ps.findByproductId(prodId);

		if (prod == null) {
			model.addAttribute("msg", "Product Id " + prodId + " Does not exists in DB");
			pageUrl = "find";
			return pageUrl;
		}

		model.addAttribute("product", prod);

		List<Product> prods = ps.findAll();

		List<String> ids = new ArrayList<>();

		for (Product p : prods) {
			BeanUtils.copyProperties(ids, p);
			ids.add(p.getProdId());

		}

		model.addAttribute("prods", prod);

		prod.setIds(ids);

		return pageUrl;

	}

	@RequestMapping("listAll")
	public String listAll(Model model) {

		List<Product> prods = ps.findAll();
		model.addAttribute("products", prods);

		return "products";
	}

}

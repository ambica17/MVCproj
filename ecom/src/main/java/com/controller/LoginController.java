package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.service.ProductService;
import com.service.ProductServiceImpl;
import com.service.UserService;
import com.google.gson.Gson;
import com.model.product;
@Controller
public class LoginController {
	
	@Autowired
	ProductService pservice;
	 
	@Autowired
	UserService uservice;
	public LoginController()
	{
		
	}
	
String s=null;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/home")
	public ModelAndView gethome()
	{
		return new ModelAndView("home");
	}
	@RequestMapping("/addprod")
	 public ModelAndView getForm(@ModelAttribute("p") product p) {
 return new ModelAndView("addproduct");
}

	@RequestMapping("/Product")
	//@RequestMapping("/Product,/addProduct")
	public String product()
	{
		//s=name;
	
		return "product";
	}
	List<product> plist=null;
	@RequestMapping("/p")
	public @ResponseBody String getValues()
	{	
		
		plist=pservice.getAll();
		Gson gson=new Gson();
		String result= gson.toJson(plist);
		return result;
	}
	@ModelAttribute("prd")//This refers to command name which we gave 
	public product create()
	{
	System.out.println("inside modelattribute");
	return new product();//creating a model object
	}
	@RequestMapping(value={"/addProduct"},method=RequestMethod.POST)
	public ModelAndView adding(@ModelAttribute("p") product p)
	{
		pservice.create(p);
	//calls service method
		
	return new ModelAndView("redirect:product");
	}
	@RequestMapping("form")
	 public ModelAndView getForm1( @ModelAttribute("p") product p,BindingResult result) {
	  return new ModelAndView("form");
	 }
	 @RequestMapping("register")
	 public ModelAndView registerUser(@ModelAttribute("p") product p,BindingResult result) {
		 pservice.create(p);
	  return new ModelAndView("redirect:list");
	 }
	 @RequestMapping("list")
	 public ModelAndView getList() {
	  plist = pservice.getAll();
	  return new ModelAndView("plist", "employeeList", plist);
	 }
	 @RequestMapping("edit")
	 public ModelAndView editUser(@RequestParam int id, @ModelAttribute("p") product p,BindingResult result) {
	  product pObject = pservice.getRowById(id);
	  return new ModelAndView("form", "employeeObject", pObject);
	 }
	 
	 @RequestMapping("update")
	 public ModelAndView updateUser(@ModelAttribute product p) {
	  pservice.updateRow(p);
	  return new ModelAndView("redirect:product");
	 }
	 @RequestMapping("/delete")
	 public ModelAndView deleteUser(@RequestParam int id) {
	 pservice.deleteRow(id);
	  return new ModelAndView("redirect:product");
	 }
	 
		


}

package com.wonderstree.secure.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wonderstree.secure.model.Vendor;

@Controller
@RequestMapping("vendor")
public class VendorController {

/*	@Autowired
	private HttpSession httpSession;*/
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String returnLoginPage(HttpSession httpSession){
		return "vendorLogin";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String validateSigninDetails(@ModelAttribute("vendorSignin")Vendor vendor,BindingResult bindingResult,HttpSession httpSession){
		if(vendor.getEmail().matches("")==false && vendor.getPassword().matches("")==false){
			System.out.println("***sajal***");
			httpSession.setAttribute("vendorEmail", vendor.getEmail());
			httpSession.setAttribute("vendorPassword", vendor.getPassword());
			return "vendorHome";
		}
		return "vendorLogin";
	}
	
	@RequestMapping(value="home", method=RequestMethod.GET)
	public String returnHomePage(HttpSession httpSession){
		return "vendorHome";
	}

	@RequestMapping(value="profile", method=RequestMethod.GET)
	public String returnProfilePage(HttpSession httpSession){
		return "vendorProfile";
	}
	
	@RequestMapping(value="logout",method=RequestMethod.GET)
	public String logout(HttpSession httpSession){
		httpSession.removeAttribute("vendorEmail");
		httpSession.removeAttribute("vendorPassword");
		httpSession.invalidate();
		httpSession.setMaxInactiveInterval(-1);
		return "vendorLogout";
	}
}

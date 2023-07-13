package com.alpaca.spring.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alpaca.spring.test.jsp.domain.Realtor;
import com.alpaca.spring.test.jsp.service.RealtorService;

@Controller
@RequestMapping("/jsp/realtor")
public class RealtorController {
	
	@Autowired
	private RealtorService realtorService;
	
	@GetMapping("/input")
	public String inputRealtor()
	{
		return "jsp/realtor";
	}
	
	
	@PostMapping("/add")
	public String createRealtor(
			@RequestParam("office") String office,
			@RequestParam("phoneNum") String phoneNumber,
			@RequestParam("address") String address, 
			@RequestParam("grade")String grade,
			Model model)
	{
		Realtor realtor = new Realtor();
		realtor.setOffice(office);
		realtor.setPhoneNumber(phoneNumber);
		realtor.setAddress(address);
		realtor.setGrade(grade);
		
		int count = realtorService.addRealtor(realtor);
		
		model.addAttribute("result", realtor);
		
		return "jsp/realtorinfo";
	}
	

}

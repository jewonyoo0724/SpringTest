package com.alpaca.spring.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alpaca.spring.test.jsp.domain.Seller;
import com.alpaca.spring.test.jsp.service.SellerService;

@Controller
@RequestMapping("/jsp/test01/seller")
public class SellerController {
	
	@Autowired
	private SellerService sellerService;
	
	@PostMapping("/add")
	@ResponseBody
	public String createSeller(
			@RequestParam("nickname") String nickname, 
			@RequestParam("image") String image, 
			@RequestParam("temp")double temp)
	{
		int count = sellerService.addSeller(nickname, image, temp);
		return count + " rows affected";
	}
	
	@GetMapping("/input")
	public String sellerInput()
	{
		return "jsp/sellerinput";
	}
	
	@GetMapping("/last")
	public String lastSeller(Model model, @RequestParam(required=false, value="id") Integer id)
	{
		Seller seller = null;
		
		if (id == null)
		{
			seller = sellerService.getLastSeller();
			model.addAttribute("result", seller);
		}
		else
		{
			seller = sellerService.getLastSellerbyId(id);
			model.addAttribute("result", seller);
		}
		
		return "jsp/sellerinfo";
	}
}

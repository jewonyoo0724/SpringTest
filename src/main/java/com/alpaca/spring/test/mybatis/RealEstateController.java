package com.alpaca.spring.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alpaca.spring.test.mybatis.domain.RealEstate;
import com.alpaca.spring.test.mybatis.service.RealEstateService;

@Controller
@RequestMapping("/mybatis/realestate")
public class RealEstateController {
	
	@Autowired
	private RealEstateService realEstateService;

	@RequestMapping("/1")
	@ResponseBody
	public RealEstate realEstateId(@RequestParam("id") int id)
	{
		RealEstate realEstate = realEstateService.getRealEstateId(id);
		
		return realEstate;
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public List<RealEstate> realEstateRent(@RequestParam("rent") int rent)
	{
		List<RealEstate> realEstate = realEstateService.getRealEstateRent(rent);
		
		return realEstate;
	}
	
	@RequestMapping("/3")
	@ResponseBody
	public List<RealEstate> realEstateAreaPrice(@RequestParam("area") int area, @RequestParam("price") int price)
	{
		List<RealEstate> realEstate = realEstateService.getRealEstateAreaPrice(area, price);
		return realEstate;
	}
	
	@RequestMapping("/insert1")
	@ResponseBody
	public String insertRealEstateAsObject()
	{
		RealEstate realEstate = new RealEstate();
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지용 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		int count = realEstateService.addRealEstateAsObject(realEstate);
		return count + " rows affected";
		
	}
	
	@RequestMapping("/insert2")
	@ResponseBody
	public String insertRealEstateAsField(@RequestParam("realtorId") int realtorId)
	{
		int count = realEstateService.addRealEstateAsField(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
		return count + " rows affected";
	}
	
}

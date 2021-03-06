package com.sist.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.restaurant.RestaurantDAO;
import com.sist.restaurant.RestaurantService;
import com.sist.util.PagingManager;
import com.sist.vo.RestaurantVO;

@Controller
public class RestaurantController {
	@Autowired
	private RestaurantDAO restaurantDAO;
	@Autowired
	private RestaurantService rSVC;

	@RequestMapping("restaurant/restaurant_list")
	public String restaurantList(PagingManager page, Model model) {
		page.setRowSize(9);
		List<RestaurantVO> list = rSVC.selectRestaurantList(page);
		model.addAttribute("pmgr", page);
		model.addAttribute("list", list);
		return "restaurant/restaurant_list";
	}
	
	@RequestMapping("restaurant/restaurant/detail")
	public String restaurantDetail(int id,Model model){
		RestaurantVO vo=restaurantDAO.restaurantDetail(id);
		String sigun=restaurantDAO.restaurantsigun(id);
		vo.setSigun(sigun);
		model.addAttribute("vo", vo);
		return "restaurant/restaurant_detail";
	}
}

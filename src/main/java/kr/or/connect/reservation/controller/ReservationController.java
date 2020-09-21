package kr.or.connect.reservation.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.connect.reservation.dto.Reservation;
import kr.or.connect.reservation.service.impl.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	ReservationService reservationService;
	
	@GetMapping(path = "/comment")
	public String comment(@RequestParam(name = "start", required = false, defaultValue = "0") int start, ModelMap model) {

		List<Reservation> comment = reservationService.getComment(start);

		model.addAttribute("comment", comment);
		return "comment";
	}

	@GetMapping(path = "/list")
	public String list(@RequestParam(name = "start", required = false, defaultValue = "0") int start, ModelMap model) {

		List<Reservation> list1 = reservationService.getProduct(start);
		List<Reservation> list2 = reservationService.getPromotion(start);
		
		int CountP = reservationService.countProduct();
		

		int count = reservationService.countProduct();
		int pageCount = count / ReservationService.LIMIT;
		if (count % ReservationService.LIMIT > 0)
			pageCount++;

		List<Integer> pageStartList = new ArrayList<>();
		for (int i = 0; i < pageCount; i++) {
			pageStartList.add(i * ReservationService.LIMIT);
		}

		model.addAttribute("list1", list1);
		model.addAttribute("list2", list2);

		model.addAttribute("CountP", CountP);
		model.addAttribute("count", count);
		model.addAttribute("pageStartList", pageStartList);

		return "list";
	}

	@GetMapping(path = "/category_id1")
	public String category_id1(@RequestParam(name = "start", required = false, defaultValue = "0") int start, ModelMap model) {

		List<Reservation> category_id1 = reservationService.category_Product1(start);

		model.addAttribute("category_id1", category_id1);
		return "category_id1";
	}
	
	@GetMapping(path = "/category_id2")
	public String category_id2(@RequestParam(name = "start", required = false, defaultValue = "0") int start, ModelMap model) {
		
		List<Reservation> category_id2 = reservationService.category_Product2(start);
		
		model.addAttribute("category_id2", category_id2);
		return "category_id2";
	}
	@GetMapping(path = "/category_id3")
	public String category_id3(@RequestParam(name = "start", required = false, defaultValue = "0") int start, ModelMap model) {
		
		List<Reservation> category_id3 = reservationService.category_Product3(start);
		
		model.addAttribute("category_id3", category_id3);
		return "category_id3";
	}
	@GetMapping(path = "/category_id4")
	public String category_id4(@RequestParam(name = "start", required = false, defaultValue = "0") int start, ModelMap model) {
		
		List<Reservation> category_id4 = reservationService.category_Product4(start);
		
		model.addAttribute("category_id4", category_id4);
		return "category_id4";
	}
	
	@GetMapping(path = "/category_id5")
	public String category_id5(@RequestParam(name = "start", required = false, defaultValue = "0") int start, ModelMap model) {
		
		List<Reservation> category_id5 = reservationService.category_Product5(start);
		
		model.addAttribute("category_id5", category_id5);
		return "category_id5";
	}
	
	@GetMapping(path = "/info")
	public String info(@RequestParam(name = "start", required = false, defaultValue = "0") int start, ModelMap model) {
		
		List<Reservation> info = reservationService.getDisplayInfo(start);
		
		model.addAttribute("info", info);
		return "info";
	}


}

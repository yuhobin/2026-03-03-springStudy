package com.sist.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sist.service.FoodService;
import com.sist.vo.FoodVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FoodController {
	private final FoodService fService;
	
	// 목록 출력
	@GetMapping("main/main.do")

	public String main_main(String page, Model model) {
		if(page==null)
			page="1";
		int curpage=Integer.parseInt(page);
		int start=(curpage*12)-12;
		List<FoodVO> list=fService.foodListData(start);
		int totalpage=fService.foodTotalPage();
		
		final int BLOCK=10;
		int startPage=((curpage-1)/BLOCK*BLOCK)+1;
		int endPage=((curpage-1)/BLOCK*BLOCK)+BLOCK;
		
		if(endPage>totalpage)
			endPage=totalpage;
		

		model.addAttribute("list",list);
		model.addAttribute("curpage",curpage);
		model.addAttribute("totalpage",totalpage);
		model.addAttribute("startPage",startPage);
		model.addAttribute("endPage",endPage);

		// => request / response => Cookie
		model.addAttribute("main_jsp","../main/home.jsp");
		return "main/main";
	}
}

package com.sist.dao;

import java.util.List;

import com.sist.mapper.*;
import com.sist.vo.*;

public class FoodDAO {
	private FoodMapper mapper;

	public void setMapper(FoodMapper mapper) {
		this.mapper = mapper;
	}
	
	public List<FoodVO> foodListData(int start) {
		return mapper.foodListData(start);
	}
}

package com.sist.main;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("sawon")
public class Sawon {
	private int sabun;
	private String name, dept, job;
}

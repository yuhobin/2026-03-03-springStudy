package com.sist.main;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("student")
public class Student {
	private int hakbun;
	private String name, subject;
}

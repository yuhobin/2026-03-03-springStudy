package com.sist.main2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*
 * 	일반 Contatiner
 * 		ApplicationContext
 * 	웹 contatiner
 * 		WebApplicationContext
 * 	어노테이션 Container
 * 		AnnotationConfigApplicationContext
 * 
 * 	*** 스프링은 웹 용이 아니다 : 애플리케이션 용 => 게임(클래스가 복잡하게 많은 경우)
 * 	*** 코틀린 / 자바
 * 		=> 동일 
 * 			@
 * 			public fun aaa():String => 자바는 그대로 사용이 가능
 * 									=> JVM
 * 			var / val
 * 			|변수	  |상수 
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext(SawonConfig.class);
		
		Sawon s=(Sawon)app.getBean("sa");
		System.out.println(s.getSabun());
		System.out.println(s.getName());
		System.out.println(s.getDept());
		System.out.println(s.getLoc());
	}

}

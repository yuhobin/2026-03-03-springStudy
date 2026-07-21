package com.sist.main;

import lombok.AllArgsConstructor;
import lombok.Data;
/*
 * 	public class A {
 * 		private int aa;		A a=new A()
 *
 * 	}
 * 
 * 	public class A {
 * 		private int aa;		A a=new A()
 * 		public A(){}
 * 	}
 * 
 * 	pulic class A {
 * 		private int aa;		A a=new A() => 오류
 * 		private A(int aa) {
 * 			this.aa=aa;
 * 		}
 * }
 */
@Data
@AllArgsConstructor
public class Member {
	private int mno;
	private String name;
	private String address;
	private String phone;
	public void init() {
		System.out.println("회원목록");
	}
	public void destroy() {
		System.out.println("=====================");
	}
	public void print() {
		System.out.println("회원번호:"+mno);
		System.out.println("이름:"+name);
		System.out.println("주소:"+address);
		System.out.println("전화:"+phone);
	}
}

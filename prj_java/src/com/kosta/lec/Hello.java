package com.kosta.lec;
public class Hello {
	//객체(object) = 인스턴스(instance) 메모리에 올라간 객체
	//변수(variable)
	//메서드(method) 자바에선 함수가 메서드다
	//함수(function):생성자함수
	
	public static void main(String[] args) {
		int num =3 ; 
		boolean status = true;
		System.out.println(!status);
		System.out.println(num%2);
		byte b1 = 10; 
		byte b2= 20;
		byte c1= (byte)(b1+b2);
		int abx = b1<0 ? 10 : -10;
		System.out.println(abx);
		
		int num1 = 10;

		int num2 = 20;

//		if (num1 != num2) {
//
//			System.out.println("다르다");
//
//		} else {
//
//			System.out.println("같다");
//
//		}
		String st= num1!=num2 ? "다르다" : "같ㅑ다";
		System.out.println(st);
		int nu1 = 456;
		int nu2=nu1%100;
		System.out.println(nu1-nu2);
		switch(nu1) 
		{
		case 1:
			break;
			}
	}

}

package com.kosta.lec;

import java.util.Scanner;

public class Algorithm2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sub = new String[20];
		double[] grade = new double[20];
		double[] score = new double[20];
		int count = 20;
		int minus =0;
		double sum1 = 0;
		double sum2 = 0;
		for(int i= 0 ; i<count;i++)
		{
			String[] temp = sc.nextLine().split(" ");
			sub[i] = temp[0];
			grade[i] = Double.parseDouble(temp[1]);
			score[i] = change(temp[2]);
			if(score[i]!=-1)
			{
				sum1+= grade[i]*score[i];
				sum2+=grade[i];
				minus++;
			}
		}
		System.out.printf("%.6f",sum1/sum2);
		
		
	}
	static double change(String st)
	{
		if(st.equals("A+")) return 4.5f;
		else if(st.equals("A0")) return 4.0f;
		else if(st.equals("B+")) return 3.5f;
		else if(st.equals("B0")) return 3.0f;
		else if(st.equals("C+")) return 2.5f;
		else if(st.equals("C0")) return 2.0f;
		else if(st.equals("D+")) return 1.5f;
		else if(st.equals("D0")) return 1.0f;
		else if(st.equals("F")) return 0f;
		else return -1f;
	}

}

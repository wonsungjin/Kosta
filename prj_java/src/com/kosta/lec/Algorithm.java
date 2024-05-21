package com.kosta.lec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Algorithm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Case = sc.nextInt();
		Space[] sp = new Space[Case];
		ArrayList<Space> list = new ArrayList<Space>();
		//Arrays.sort();
		int minX = 100000;
		for(int i = 0; i<Case-1; i++) 
		{
			sp[i].x = sc.nextInt();
			sp[i].y = sc.nextInt();
			if(minX<sp[i].x) 
			{
				
				minX=sp[i].x;
				list.add(0, sp[i]);
			}
		}
		for(int i = 0 ; i<Case-1; i++)
		{
			System.out.print(sp[i].x+" ");
		}
		
		
		
	}

}
class Space
{
	public int x = 0;
	public int y = 0;
}

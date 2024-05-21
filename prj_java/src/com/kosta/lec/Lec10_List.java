package com.kosta.lec;
import java.util.ArrayList;
import java.util.HashMap;

class Lec10_List{

	public static void main(String[] args)
	{
		ArrayList<Integer> empno = new ArrayList<>();
		ArrayList<String> ename = new ArrayList<String>();
		ArrayList <Integer>sal = new ArrayList<>();
		HashMap<String,ArrayList> emp = new HashMap<String,ArrayList>();
		empno.add(0733);
		ename.add("smith");
		sal.add(600);
		emp.put("empno",empno);
		emp.put("ename",ename);
		emp.put("sal",sal);	
		String[] st =  new String[]{"empno","ename","sal"};
		for(int i =0; i<emp.size();i++)
		{
			for(int j= 0 ; j<emp.get(st[i]).size(); j++)
			System.out.println(emp.get(st[i]).get(j));
		}
	}
}
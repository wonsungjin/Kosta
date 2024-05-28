package com.kosta.sample.json;
import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;

public class APISGSON {

	public static void main(String[] args) {
		Gson gson = new Gson();
		HashMap map = new HashMap<String,String>();
		map.put("empno", "7733");
		map.put("ename", "smith");
		
		System.out.println(map.get("ename"));
		System.out.println(map);
		
		String ms = gson.toJson(map);//json형식변환
		System.out.println(ms);
		
		HashMap res = gson.fromJson(ms, HashMap.class);//다시 맵변환
		System.out.println(res);
		//--------------
		ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
		list.add(map);
		String ms2 = gson.toJson(list);
		System.out.println(ms2);
		ArrayList res2 = gson.fromJson(ms2, ArrayList.class);
		System.out.println(res2);
	}

}

package com.kosta.sample.json;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class JsonTest {

	public static void main(String[] args) {
		String jsonStr = "{}";
		HashMap<String,String> map = new HashMap<>();
		map.put("empno", "7733");
		map.put("ename", "smith");
		map.put("sal", "600");
		System.out.println(map);
		JSONObject obj = new JSONObject();
		JSONParser parser = new JSONParser();
		
		HashMap<String,String> map2 = new HashMap();
		try {
			map2 = (HashMap)parser.parse(jsonStr);
			String a =  map2.get("ename");
			String b =  map2.get("empno");
			String c =  map2.get("sal");
			System.out.print(a+","+b+","+c);
			//String st= obj.toJSONString(map2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}

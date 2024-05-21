package com.kosta.sample.json;
import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest {
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException
	{
		String str = "{\r\n"
				+ "\r\n"
				+ "  \"name\": \"KOSTA\",\r\n"
				+ "\r\n"
				+ "  \"id\": \"u0001\",\r\n"
				+ "\r\n"
				+ "  \"displayName\": {\r\n"
				+ "\r\n"
				+ "  	\"desc\": \"this is kosta\",\r\n"
				+ "\r\n"
				+ "  	\"code\": \"g01\"\r\n"
				+ "\r\n"
				+ "  },\r\n"
				+ "\r\n"
				+ "  \"types\": [\"type1\",\"type2\"],\r\n"
				+ "\r\n"
				+ "  \"primaryType\": \"ptype\"\r\n"
				+ "\r\n"
				+ "}";
		ObjectMapper map = new ObjectMapper();
		HashMap hash = new HashMap();
		hash = map.readValue(str, HashMap.class);
		ArrayList<String> list = (ArrayList<String>) hash.get("types");
		System.out.println(list.get(0));//타입 1번째 봅기 
		HashMap hashValue = (HashMap)hash.get("displayName");
		System.out.println(hashValue.get("code"));//dispalyname에 desc뽑기
		
		
		///내부 VO클래스에 넣기
		StrVO st = map.readValue(str,StrVO.class);
		System.out.println(st.getTypes().get(0));
		System.out.println(st.getDisplayName().getCode());
	}


}
class StrVO
{
	private String name;
	private String id;
	private DisVO displayName;
	private ArrayList<String> types;
	private String primaryType;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public DisVO getDisplayName() {
		return displayName;
	}
	public void setDisplayName(DisVO displayName) {
		this.displayName = displayName;
	}
	public ArrayList<String> getTypes() {
		return types;
	}
	public void setTypes(ArrayList<String> types) {
		this.types = types;
	}
	public String getPrimaryType() {
		return primaryType;
	}
	public void setPrimaryType(String primaryType) {
		this.primaryType = primaryType;
	}
	public StrVO() {};
	public StrVO(String name, String id, DisVO displayName, ArrayList<String> types, String primaryType) {
		super();
		this.name = name;
		this.id = id;
		this.displayName = displayName;
		this.types = types;
		this.primaryType = primaryType;
	}
	
}
class DisVO
{
	private String desc;
	private String code;
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}

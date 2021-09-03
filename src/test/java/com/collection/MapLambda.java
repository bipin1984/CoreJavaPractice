package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ListItem
{
	private int key;
	private String value;
	
	ListItem(Integer Id, String name)
	{
		
		key = Id;
		value = name;
		
	}
	
	public Integer getkey()
	{
		return key;
	}
	public String getValue()
	{
		return value;
	}
	
}



public class MapLambda {

	public static void main(String[] args) {
		
		List<ListItem> list = new ArrayList<ListItem>();
		list.add(new ListItem(1,"Bipin"));
		list.add(new ListItem(2,"Pinki"));
		list.add(new ListItem(3,"Suman"));
		list.add(new ListItem(4,"Babu"));
		list.add(new ListItem(5,"Umesh"));
		list.add(new ListItem(6,"Gita"));
		System.out.println(list);
		
		Map<Integer,String> map = new HashMap<>();
		
		list.forEach(n->{map.put(n.getkey(),n.getValue());});
		System.out.println("Map :" + map);
		map.forEach((k,v)->System.out.println("Key :"+k +" "+"Value :"+v));

	}

}

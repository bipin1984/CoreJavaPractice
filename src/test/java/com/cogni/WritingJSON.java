package com.cogni;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class WritingJSON {

	public static void main(String[] args) throws FileNotFoundException {
		
		JSONObject jo = new JSONObject();
		
		jo.put("firstName","Bipin");
		jo.put("lastName","Behera");
		jo.put("Age",43);
		
		Map ht = new Hashtable(5);
		
		ht.put("At", "Dadha");
		ht.put("Po", "Barang");
		ht.put("Dist", "Cuttack");
		ht.put("State", "Odisha");
		ht.put("Pin", 754005);
		
		jo.put("Address", ht);
		
		JSONArray ja = new JSONArray();
		//Hashtable ht = new Hashtable(2);
		ht = new Hashtable(2);
		ht.put("type", "home");
		ht.put("number", "234-453-3426");
		
		ja.put(ht);
		ht = new Hashtable(2);
		ht.put("type", "mobile");
		ht.put("number", "9591560032");
		ja.put(ht);
		jo.put("Contacts", ja);
		
		PrintWriter pw = new PrintWriter("TestJSON123.json");
		pw.write(jo.toString());
		pw.flush();
		pw.close();
		
		
		
		
		
		
		
		
		
		
	}

}

package com.gulbahar.practices;
import java.util.*;
import java.util.Map.Entry;
public class Relp205 {

	public static void main(String[] args) {
		
	  List<Map<String, Object>> dataList = new LinkedList<>();
	  Map<String, Object> appleMap = new LinkedHashMap<>();
	  appleMap.put("Items", "Apple");
	  appleMap.put("Price", 20.00);
	  appleMap.put("Quantity", 10.0);
	  dataList.add(appleMap);
	  
	   Map<String, Object> orangeMap = new LinkedHashMap<>();
	  orangeMap.put("Items", "Orange");
	  orangeMap.put("Price", 21.99);
	  orangeMap.put("Quantity", 10.0);
	  dataList.add(orangeMap);
	
	  double subTotal1= 0;
	  double subTotal2=0;
	  double totalPurchase = 0;
	  
	  for(Map<String,Object> map :dataList) {
	  Set<Entry<String, Object>> entry = map.entrySet();
	  for(Entry<String, Object> e: entry) {
		  String key = e.getKey();
		  
		 if(map.get(key).equals("Apple")) {
			 Double price = (Double) map.get("Price");
			 double quantity = (double)map.get("Quantity");
			 subTotal1 = price*quantity;
			 
		 }else if (map.get(key).equals("Orange")){
			 double p = (double) map.get("Price");
			 double q = (double) map.get("Quantity");
			 subTotal2= p*q;
		 }
		 totalPurchase = subTotal1 + subTotal2;
		 System.out.println(key+" : "+e.getValue());
		 
	  }
	  if (map.equals(appleMap)) {
		  System.out.println("SubTotal: "+subTotal1);
	  }else {
		  System.out.println("SubTotal: "+subTotal2);
		 }
		 
		 }
	  System.out.println("Your purchase total: "+totalPurchase);
	  
	}
	}


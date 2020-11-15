package com.gulbahar.practices;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.util.Set;

public class MapSize {
  public static void main(String []args) {
    Map<String, String> adress = new HashMap<>();
    adress.put("Street","Patrick ST");
    adress.put("Suite","265");
    adress.put("City", "Vienna");
    adress.put("Zip", "22180");
    adress.put("Country", "United States");
    
    System.out.println(adress.size());
    
    adress.clear();
    
    System.out.println(adress.size());

  
}
}



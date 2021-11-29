package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class Collecton_programms {

	public static void main(String[] args) {
		
Map<String,Integer> a=new HashMap<String,Integer>();
Map<String,Integer> b=new HashMap<String,Integer>();

a.put("apple", 50);
a.put("IBM", 20);
a.put("Wipro", 20);

b.put("apple", 20);
b.put("IBM", 5);
b.put("Wipro", 30);
System.out.println("Before selling or buying");
System.out.println(a);
System.out.println(b);


Selling("apple",10,a);
buying("apple",10,b);
System.out.println("After selling or buying");
System.out.println(a);
System.out.println(b);

}


  public static void Selling(String productName, int quantity,Map map) {
  
	 Integer num=(Integer) map.get(productName);
	  
   switch(productName) {
  
  case "apple" :
  
                if(num>=quantity) { 
	  
	                map.put("apple", num-quantity);
  
                } else {
	                 System.out.println("Sorry"+productName+"is not available");
                }
  
                  break;
                  
  case "IBM" :
	  
      if(num>=quantity) { 

          map.put("IBM", num-quantity);

      } else {
           System.out.println("Sorry"+productName+"is not available");
      }

        break;
        
        
  case "Wipro" :
	  
      if(num>=quantity) { 

          map.put("Wipro", num-quantity);

      } else {
           System.out.println("Sorry"+productName+"is not available");
      }

        break;
  
 
  
  default:
	     
	     System.out.println("Please enter valid product name");
	  
	      break;
	     
  }
  
  }
  
  public static void buying(String productName, int quantity,Map map) {
	  
	  Integer num=(Integer) map.get(productName);
	  
	   switch(productName) {
	  
	  case "apple" :
	  
	                map.put("apple", num+quantity);
	                    break;
	                  
	  case "IBM" :
		          

                    map.put("IBM", num+quantity);
                       break;
	      
	        
	        
	  case "Wipro" :
		  
	      
		           map.put("Wipro", num+quantity);
	               break;
	  
	 
	  
	  default:
		     
		     System.out.println("Please enter valid product name");
		  
		      break;
		     
	  }
	  
  
  }
 

}



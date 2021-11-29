package com.selenium.session;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Test implements Interface1, Interface2 {

	public static void main(String[] args) {
		String str = "Abc123";
		Test t = new Test();
		System.out.println(primeNumber(8));
	}

	@Override
	public void sumOfDigits(String str) {

		char[] ch = str.toCharArray();
		int sum = 0;

		for (int i = 0; i < ch.length; i++) {
			int j = ch[i];
			if (j >= 48 && j <= 57) {
				int num_sum = Character.getNumericValue(ch[i]);
				// System.out.print(num_sum);
				sum = sum + num_sum;
			}

		}

		System.out.println(sum);

	}

	public static Multimap<String, String> multiMap() {

		Multimap<String, String> multimap = ArrayListMultimap.create();
		multimap.put("fruit", "Apple");
		multimap.put("Fruit", "orange");

		return multimap;

	}
	
     public static void setsnceToWordsAndrevrese (String stmet) {
		
		String[] words=stmet.trim().split(" ");
		for(int i=words.length-1;i>=0;i--) {
			//System.out.println(words[i]);
			char[] reverse=words[i].toCharArray();
			String revers2="";
			for(int j=reverse.length-1;j>=0;j--) {
				revers2=revers2+Character.toString(reverse[j]);
			}
			System.out.print(revers2+" ");
		}
		}
		
      public static boolean primeNumber(int num) {
    	  
    	  Math.sqrt(num);
    	//  System.out.println( Math.sqrt(num));
    	  if (num <= 1) {  
              return false;  
          }
    	  for(int i =2;i<Math.sqrt(num);i++) {
    		  if(num%i==0) {
    			  return false;
    			  
    		  }
    		  
    	  }
		return true;  
    	  
      }

      public void palindrome(int pal_num) {
    	  
    	  int pal=121;
    	  
    	  int r,n,sum;
    	  
    	  for(int i=0;i<pal_num;i++) {
    		  
    	  }
    	  
    	  
    	  
    	  
      }

}

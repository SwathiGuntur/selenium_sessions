package com.selenium.session;

public class Palindrome {
	
	
	//121/10,

	public static void main(String[] args) {
		
		int i=121;
		int j=0,temp=0,k=i;
		j=i;
	
		
		  while(i>0) { 
			  j=i%10;
			  i=i/10; 
		    temp=temp*10+j; 
		    } 
		  if(k==temp) {
		  System.out.println("polindrome number"+temp); 
		  }
		  else
		  System.out.println("not a polindrome number"+temp);
		 
		
    
	}

}

package com.java.practice;


public class String_programms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//halfStringReverse("Sandeep");
		//reverseOfAplha_AlphaNumeric("14sandeep1989");
		String s="abc_123_abc_123_abc";
		String[] array=s.split("_");
		System.out.println(array[0]);
	}

	public static void sumOfDigits(int[] intarray) {
		int sum = 0;
		for (int i = 0; i < intarray.length; i++) {

			sum = sum + intarray[i];
		}

		System.out.println(sum);
	}

	public static void sumOfDigitsInString(String alphaNumeric) {

		char[] string_Chars = alphaNumeric.toCharArray();
		for (Character ch : string_Chars) {

			int sumOfdigitsInString = 0;

			if (ch >= 48 && ch <= 56) {

				sumOfdigitsInString = sumOfdigitsInString + Character.getNumericValue(ch);
			}
			System.out.println(sumOfdigitsInString);
		}

	}

	public static void string_Reverse(String valueToReverse) {

		for (int i = valueToReverse.length() - 1; i >= 0; i--) {

			System.out.print(valueToReverse.charAt(i));

		}

	}

	public static void integer_reverse(int intValueToRerverse) {

		String value = Integer.toString(intValueToRerverse);

		for (int i = value.length() - 1; i >= 0; i--) {

			System.out.print(value.charAt(i));

		}
	}

	public static void halfStringReverse(String halfStringReverse) {

		String firstHalf = halfStringReverse.substring(0, halfStringReverse.length() / 2);

		String secondHalf = halfStringReverse.substring(halfStringReverse.length() / 2, halfStringReverse.length());
		System.out.println("firstHalf of string is " + "-->" + firstHalf);
		String frisrtHalf_R = "";
		for (int i = firstHalf.length() - 1; i >= 0; i--) {

			frisrtHalf_R = frisrtHalf_R + firstHalf.charAt(i);

		}
		System.out.println(frisrtHalf_R.concat(secondHalf));
	}

	public static void reverseOfAplha_AlphaNumeric(String aplhaNumericvalue) {
		
		//String aplhaNumericvalue="14sandeep1989";
		char[] values_alpha_numeric=aplhaNumericvalue.toCharArray();
		String numerics="";
		String aplha="";
		String alpha_reverse="";
				
		for (Character ch : values_alpha_numeric) {

			if (ch >= 47 && ch <= 58) {

				numerics = numerics + Integer.toString(Character.getNumericValue(ch));

			} else {
				aplha = aplha + Character.toString(ch);

			}

		}
		
		for(int i=aplha.length()-1;i>=0;i--) {
			
			alpha_reverse=alpha_reverse+aplha.charAt(i);
			
		}

   String final_string=numerics.substring(0,2)+alpha_reverse+numerics.substring(2,numerics.length());
   System.out.println(final_string);

	}
}

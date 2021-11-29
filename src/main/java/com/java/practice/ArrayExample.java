package com.java.practice;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		int[] array = { 1, 4, 0, 23, 0, 0, 21, 0, 6, 78, 0 }; // Arrays.sort(array);
		// System.out.println(array);

		int j = 0;

		System.out.println("Input Array: ");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "  ");

		}
		System.out.println();
		System.out.println("Output Array: ");
		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] == 0) {

				j = array[i];
				if (array[i + 1] == 0) {
					continue;
				} else {
					array[i] = array[i + 1];
					array[i + 1] = j;
				}

			}
			System.out.print(array[i] + "  ");
			
		}

	}
}

/*
 * int[] array = { 1, 4, 0, 23, 0, 0, 21, 0, 6, 78, 0 }; int index = 0; int
 * n=array.length; for (int i = 0; i <n ; i++) {
 * 
 * if (array[i] != 0) { array[index] = array[i]; System.out.println(array[i]);
 * index=index+1;
 * 
 * System.out.println("indise for"+index);
 * 
 * } while(index<array.length){
 * 
 * array[index]=0; System.out.println(array[i]); index=index+1;
 * 
 * }
 * 
 * }
 * 
 * 
 * System.out.println("outdise for"+index);
 * 
 * }
 * 
 * }
 */
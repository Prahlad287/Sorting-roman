package com.practice;

import java.util.Scanner;

public class ShapePrint {

	public static void main(String[] args) {
		int row=5;
		//Print P 
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <row; j++) {
				if (j==0||i==0||i==2||j==row-1&&i<3) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		//Print R
		System.out.println("Print R");
				for (int i = 1; i <=row; i++) {
					for (int j = 1; j <=row; j++) {
						if (j==2*i-1||j==3||j==5) {
							System.out.print("5");
						}
						if (j==0||i==0||i==2||j==row-1&&i<3) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
						if (i>=3&&j==2) {
							System.out.print("*");
						}
					}System.out.println();
				}

		        Scanner scan = new Scanner(System.in);
		        String s = scan.next();
		        int k = scan.nextInt();
		        scan.close();
		      
		        System.out.println(getSmallestAndLargest(s, k));

	}
	 public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        
	      smallest = s.substring(0, k);
	      System.out.println(smallest);
	        largest = s.substring(0, k);
	        System.out.println(largest);

	        for (int i = 1; i <= s.length() - k; i++) {
	            String substring = s.substring(i, i + k);
	           
	            if (substring.compareTo(smallest) < 0) {
	            	 System.out.println(substring);
	            	 System.out.println(smallest);
	                smallest = substring;
	            }

	            if (substring.compareTo(largest) > 0) {
	                largest = substring;
	            }
	        }
	        
	        return smallest + "\n" + largest;
	    }


	
	

}

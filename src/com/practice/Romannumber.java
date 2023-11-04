package com.practice;

import java.util.Scanner;

public class Romannumber {
	static void romannumber(int num) {
		if (num<=0 || num>3999) {
			System.out.println("Invalid number");
		}else {
		int values[]= {1,4,5,9,10,50,90,100,400,500,900,1000};
		String symble[]= {"I","IV","V","IX","X","L","XC","C","CD","D","CM","M"};
		        StringBuilder roman = new StringBuilder();
		       	for (int i =values.length-1; i>=0; i--) {
					while (num>=values[i]) {
						roman.append(symble[i]);
						num -=values[i];
					}
				}	        
				System.out.println(roman);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter number for check roman number");
		int num=sc.nextInt();
		romannumber(num);
		
	}
}

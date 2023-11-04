package com.practice;

import java.util.Scanner;

public class Sortingarray {
	static void sortarr(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int num[] = new int[size];
		System.out.println("Enter arrays");
		for (int i = 0; i < size; i++) {
			num[i]=sc.nextInt();
		}

		sortarr(num);
	}
}

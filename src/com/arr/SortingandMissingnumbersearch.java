package com.arr;

public class SortingandMissingnumbersearch {

	public static void main(String[] args) {
		int arr[]= {2,4,5,1,1,2,8,5,1,2,50};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j]>arr[i]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i+", ");
		}System.out.println();
		int lastrepetnumber=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]&&arr[i]!=lastrepetnumber) {
					System.out.println("Repet number is : "+arr[j]);
					lastrepetnumber=arr[i];
					i++;
				}else {
					break;
				}
			}
		}
		System.out.println("Missing number:");
        for (int i = 0; i < arr.length - 1; i++) {
            int diffrent=arr[i+1]-arr[i];
            if (diffrent>1) {
				for (int j = 1; j < diffrent; j++) {
					System.out.println(arr[i]+j);
				}
			}
        }
      
        
	}

}

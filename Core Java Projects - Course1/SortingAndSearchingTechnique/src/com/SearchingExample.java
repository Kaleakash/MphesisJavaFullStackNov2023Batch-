package com;

class Searching {
	public static int linearSearch(int num[], int search) {
			for(int i=0;i<num.length;i++) {
				if(num[i]==search) {
					return i;
				}
			}
			return -1;
	}
}
public class SearchingExample {
	public static void main(String[] args) {
		int num[]= {4,1,7,8,6,5,9};
		int search = 40;
		int indexPosition = Searching.linearSearch(num, search);
		if(indexPosition<0) {
			System.out.println("Element not present");
		}else {
			System.out.println("Element present at position "+indexPosition);
		}
	}
}

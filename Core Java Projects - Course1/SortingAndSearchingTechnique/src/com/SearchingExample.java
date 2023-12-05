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
	
	public static void binarySearch(int num[], int start,int end, int search) {
		int mid = (start+end)/2;
		while(start<=end) {
			if(num[mid]<search) {
				start = mid+1;
			}else if(num[mid]==search) {
				System.out.println("Element is found "+mid);
				break;
			}else {
				end = mid-1;
			}
			mid = (start +end )/2;
		}
		if(start > end) {
			System.out.println("Element is not found");
		}
	}
}
public class SearchingExample {
	public static void main(String[] args) {
		int num[]= {4,1,7,8,6,5,9};
		int search = 7;
		Sorting.bubbleSortAsc(num, num.length-1);
		for(int n:num) {
			System.out.print(n+" ");
		}
		System.out.println();
		Searching.binarySearch(num, 0, num.length-1, search);
//		int indexPosition = Searching.linearSearch(num, search);
//		if(indexPosition<0) {
//			System.out.println("Element not present");
//		}else {
//			System.out.println("Element present at position "+indexPosition);
//		}
	}
}

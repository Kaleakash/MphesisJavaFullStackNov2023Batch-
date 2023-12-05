package com;
class Sorting{
	public static void selectionSortAsc(int num[], int size) {
		for(int i=0;i<size-1;i++) {
			int min=i;
				for(int j=i+1;j<size;j++) {
					if(num[j]<num[min]) {
						min=j;
					}
				}	
		int temp = num[i];
		num[i]=num[min];
		num[min]=temp;
		}
	}
	public static void selectionSortDesc(int num[], int size) {
		for(int i=0;i<size-1;i++) {
			int max=i;
				for(int j=i+1;j<size;j++) {
					if(num[j]>num[max]) {
						max=j;
					}
				}	
		int temp = num[i];
		num[i]=num[max];
		num[max]=temp;
		}
	}
}
public class SortingExamples {
	public static void main(String[] args) {
	int num[]= {5,1,3,8,6};
	System.out.println("Before sort");
	for(int i=0;i<num.length;i++) {
		System.out.print(num[i]+" ");
	}
	Sorting.selectionSortAsc(num, num.length);
	System.out.println();
	System.out.println("After sort Asc");
	for(int i=0;i<num.length;i++) {
		System.out.print(num[i]+" ");
	}
	Sorting.selectionSortDesc(num, num.length);
	System.out.println();
	System.out.println("After sort Desc");
	for(int i=0;i<num.length;i++) {
		System.out.print(num[i]+" ");
	}
	}

}

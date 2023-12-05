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
	
	public static void bubbleSortAsc(int num[], int size) {
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-1;j++) {
				if(num[j]>num[j+1]) {
					int temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
	}
	
	public static void bubbleSortDesc(int num[], int size) {
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-1;j++) {
				if(num[j]<num[j+1]) {
					int temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
	}
	
	public static void insertionSortAsc(int num[], int size) {
		for(int i=1;i<size;i++) {
			int key = num[i];
			int j=i-1;
			while(j>=0 && key < num[j]) {
				num[j+1]=num[j];
				j--;
			}
			num[j+1]=key;
		}
	}
	public static void insertionSortDesc(int num[], int size) {
		for(int i=1;i<size;i++) {
			int key = num[i];
			int j=i-1;
			while(j>=0 && key > num[j]) {
				num[j+1]=num[j];
				j--;
			}
			num[j+1]=key;
		}
	}
	
}
public class SortingExamples {
	public static void main(String[] args) {
	int num[]= {5,1,3,8,6,2,4,9,7,10};
	System.out.println("Before sort");
	for(int i=0;i<num.length;i++) {
		System.out.print(num[i]+" ");
	}
	//Sorting.selectionSortAsc(num, num.length);
	//Sorting.bubbleSortAsc(num, num.length);
	Sorting.insertionSortAsc(num, num.length);
	System.out.println();
	System.out.println("After sort Asc");
	for(int i=0;i<num.length;i++) {
		System.out.print(num[i]+" ");
	}
	//Sorting.selectionSortDesc(num, num.length);
	//Sorting.bubbleSortDesc(num, num.length);
	Sorting.insertionSortDesc(num, num.length);
	System.out.println();
	System.out.println("After sort Desc");
	for(int i=0;i<num.length;i++) {
		System.out.print(num[i]+" ");
	}
	}

}

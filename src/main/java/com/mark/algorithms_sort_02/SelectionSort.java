package com.mark.algorithms_sort_02;
/**
 * 
 * @author msi
 * 排序算法:时间复杂度 O^2
 * 思想：每一次从待排序的数据元素中选出最小（大）的一个元素，存放在序列的起始位置，直至全部待排序的
 * s数据元素排完成
 */

public class SelectionSort {

	private SelectionSort(){

	}

	private static void sort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++){//寻找[i,n)区间的最小值
			int minIndex = i;//记录[i,n)中最小数值的下标
			for(int j=i+1;j<n;j++){
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
				swap(arr,i,minIndex);
			}
		}
	}

	private static void swap(int[] arr, int i, int minIndex) {
		int temp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = temp;
	}

	public static void main(String[] args) {
		int arr[] = {10,9,8,7,6,5,4,3,2,1};
		SelectionSort.sort(arr);
		for(int a:arr){
			System.out.println(a);
		}
	}


}

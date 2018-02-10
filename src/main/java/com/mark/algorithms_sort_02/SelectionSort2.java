package com.mark.algorithms_sort_02;

/**
 * 选择排序2.0(使用comparable接口 匹配不同比较的数据类型)
 * @author msi
 *
 */
public class SelectionSort2 {

	private SelectionSort2(){}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static void sort(Comparable[] arr) {
		int n = arr.length;
		for(int i = 0; i<n; i++){
			int minIndex = i;
			for(int j = i+1; j<n; j++){
				if(arr[j].compareTo(arr[minIndex])<0){
					minIndex = j;
				}
			}
			swap(arr,i,minIndex);
		}
		showData(arr);
	}
	
	@SuppressWarnings("rawtypes")
	private static void showData(Comparable[] arr) {
		for(Comparable o:arr){
			System.out.println(o+" ");
		}
		System.out.println();
		System.out.println("---------------------------");
	}

	private static void swap(Comparable[] arr, int i, int minIndex) {
		Comparable temp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = temp;
		
	}

	public static void main(String[] args) {
		//测试Integer
		Integer[] a= {10,9,8,7,6,5,4,3,2,1};
		SelectionSort2.sort(a);

		//测试Double
		Double[] b = {4.4,2.2,3.6,1.1};
		SelectionSort2.sort(b);
		
		//测试Sting
		String[] s = {"A","B","D","C"};
		SelectionSort2.sort(s);
		
		//测试自定义的Student类
		//注意自定义的Student类要实现Comparable接口
		Student[] d = new Student[4];
		d[0] = new Student("D",90);
		d[1] = new Student("C",100);
		d[2] = new Student("B",95);
		d[3] = new Student("A",95);
		SelectionSort2.sort(d);
	}

	
}


package com.wxy.exercise;

public class Sort {

	public static void bubbleSort(int[] array){
		for(int i = 0;i < array.length ; i++){
			int tmp = 0;
			for(int j = i ; j < array.length-1 ; j++){
				if(array[i] > array[j+1])
				{
					tmp = array[i];
					array[i] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] sortArray = new int[100];
		for(int i=0 ; i < sortArray.length ; i++){
			int newNum = (int)(Math.random()*100);
			sortArray[i] = newNum;
		}
		bubbleSort(sortArray);
		for(int num:sortArray){
			System.out.println(num);
		}
	}
	
	/**
	 * 返回一组制定数值范围、范围制定size的数组，数字不重复
	 * @param size 数组的大小
	 * @param minValue 数字的最小值(包含)
	 * @param maxValue 数字的最大值(包含)
	 * @return
	 */
	public static int[] getRandomArray(int size,int minValue,int maxValue){
		return null;
	}
	
}

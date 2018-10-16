package com.wxy.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wxy.exercise.Sort;

public class TestSort {
	Sort sort;
	int[] sortArray;
	@Before
	public void setUp() throws Exception {
		sort = new Sort();
		sortArray = new int[100];
		for(int i=0 ; i < sortArray.length ; i++){
			sortArray[i] = (int)(Math.random()*100);
		}
	}

	@Test
	public void test() {
		Sort.bubbleSort(sortArray);
		boolean sortResult = true;
		for(int i=0;i<sortArray.length-1;i++){
			if(sortArray[i]>sortArray[i+1]){
				sortResult = false;
				break;
			}
		}
		assertTrue(sortResult);
	}

}

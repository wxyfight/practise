package com.wxy.leetcode_simple;

/**
 * two-sum
 * @author wangxy
 *
 */
public class Test1 {
	public static void main(String[] args) {
		Solution so = new Solution();
		int[] result = so.twoSum(new int[]{2, 7, 11, 15}, 17);
		System.out.println(result[0]+" "+result[1]);
	}
	//https://leetcode-cn.com/problems/two-sum/description/
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
    	int[] result = new int[]{0,0};
    	if(nums.length<2) return result;
    	for(int i=0;i<nums.length-1;i++){
    		for(int j=i+1;j<nums.length;j++){
    			if((nums[i]+nums[j])==target){
    				result[0] = i;
    				result[1] = j;
    				return result;
    			}
    		}
    	}
        return result;
    }
}
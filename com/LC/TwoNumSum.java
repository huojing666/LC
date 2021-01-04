package com.LeetCode;


import java.util.HashMap;
import java.util.Map;

/*
* 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
* */
public class 两数之和 {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;
        int [] resArr = twoSum(arr,target);
        for (int i = 0; i < resArr.length; i++) {
            System.out.println(resArr[i]);
        }
    }

    private static int[] twoSum(int[] arr, int target) {

        //暴力枚举
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 1; j <arr.length ; j++) {
//                if (arr[i] + arr[j] == target){
//                    return new int [] {i,j};
//                }
//            }
//        }
//        return new int[]{-1,-1};

        //哈希表
        Map<Integer,Integer> hashTable = new HashMap<Integer,Integer>();
        for (int i = 0; i <arr.length ; i++) {
            if (hashTable.containsKey(target-arr[i])){
                return new int[] {hashTable.get(target - arr[i]),i};
            }
            hashTable.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }

}

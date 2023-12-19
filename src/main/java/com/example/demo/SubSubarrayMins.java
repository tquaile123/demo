package com.example.demo;

public class SubSubarrayMins {
    public int sumSubarrayMins(int[] arr) {
        if(arr == null || arr.length == 0) return 0;
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            int min = arr[i];
            for(int j = i; j < arr.length; j++){
                min = Math.min(arr[j], min);
                sum += min;
            }
        }
        return (int)(sum % (Math.pow(10, 9) + 7));
    }
}

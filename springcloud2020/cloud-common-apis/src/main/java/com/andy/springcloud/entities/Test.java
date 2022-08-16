package com.andy.springcloud.entities;

public class Test {

    private void fun(int[] arr, int order) {
        int[] newArr = {};
        while (order >= 1) {
            newArr = new int[arr.length-1*order];
            for (int i =0; i < arr.length; i++) {
    //            for (int k = 0; k < newArr.length; k++) {
                   if (i < newArr.length) {
                       newArr[i] = arr[i+1] - arr[i];
                   }

    //            }

            }
            if (order > 1) {
                arr = newArr;
            }

            order--;

        }
        for (int m : newArr) {
            System.out.println(m);
        }



    }

    public static void main(String[] args) {

        int[]  arr = {5, 6, 3, 9, -1};
//        new Test().fun(arr, 1);
        new Test().fun(arr, 2);

    }
}

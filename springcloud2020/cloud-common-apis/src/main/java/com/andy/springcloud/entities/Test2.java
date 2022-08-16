package com.andy.springcloud.entities;

public class Test2 {

    private void fun(int[] sequence, int order) {
        int[] newArr = {};
        for (int n = 0; n < order; n++) {
            newArr = new int[sequence.length-1];
            for (int i =0; i < sequence.length; i++) {
                if (i < newArr.length) {
                    newArr[i] = sequence[i+1] - sequence[i];
                }
            }
            sequence = newArr;
        }

        for (int m : newArr) {
            System.out.println(m);
        }

    }

    public static void main(String[] args) {

//        int[]  arr = {5, 6, 3, 9, -1};
        //1, -3, 6, -10// -4, 9, -16
        int[] arr = {113, 24, -52, 98, 102, -42, -23, 9, 192};
//        new Test2().fun(arr, 1);
//        new Test2().fun(arr, 2);
        new Test2().fun(arr, 8);

    }
}

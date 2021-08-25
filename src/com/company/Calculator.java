package com.company;

public class Calculator {

    final double pi = 3.14;

    public static int sum (int[] arr){
        int sum = 0;
        for (int n : arr){
            sum += n;
        }
        return sum;
    }

    public static int sub (int[] arr){
        int sum = 0;
        for (int n : arr){
            sum -= n;
        }
        return sum;
    }

    public static int mult (int[] arr){
        int sum = 0;
        for (int n : arr){
            sum *= n;
        }
        return sum;
    }

    public static int div (int[] arr){
        int sum = 0;
        for (int n : arr){
            sum /= n;
        }
        return sum;
    }
}

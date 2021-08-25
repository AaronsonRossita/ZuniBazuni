package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean trueOrFalse = true;

        int a = 5;
        int b = 7;
        int c = 8;
        byte a2 = 127;
        short a3 = 32767;
        long a4 = 12L;
        float a5 = 12F;
        double a6 = 2.5;

        char b1 = 'a';
        String b2 = "Hello world!";
        String b3 = "Hello";

        int[] arr = {1,2,3,4};

        House red = new House(3,"flat",true);
        House blue = new House(3,"flat",true);

//        if (b2 == b3){
//            System.out.println("the strings are the same");
//        }else{
//            System.out.println("the strings are different");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the first word");
//        b2 = scanner.next();
//        System.out.println("Please enter the second word");
//        b3 = scanner.next();
//
//        if (b2 == b3){
//            System.out.println("the strings are the same");
//        }else{
//            System.out.println("the strings are different");
//        }

//        if (b2.equals(b3)){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }

//        if ( a == b ){
//            System.out.println("yeah");
//        }
//
//        if ( a != b ){
//            System.out.println("nah");
//        }
//
//        if ( a == b && a != c){ //and
//            System.out.println("true");
//        }
//
//        if ( a == b || a != c){ //or
//            System.out.println("true");
//        }
//
//        if( !trueOrFalse ){
//            System.out.println("something");
//        }

//        while (a > b){
//            System.out.println("true");
//            a++;
//        }
//
//        do{
//            System.out.println("a is smaller than b");
//            a++;
//        }while(a > b);
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }

//        for (int arrElement : arr){
//            System.out.println(arrElement);
//        }

//        switch ()

        System.out.println(red.equals(blue));

    }
}


package com.company;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean trueOrFalse = true;

        byte a2 = 127;
        short a3 = 32767;
        int a = 5;
        int b = 7;
        int c = 8;
        Integer a1 = 5; // null
        Integer b1 = b;
        int n = (int) 1.9;
        long a4 = 12L;
        float a5 = 12F;
        double a6 = 2.5;

        char c1 = 'a';
        String b2 = "Hello world!";
        String b3 = "Hello";
        String b4 = "Hello";

//        System.out.println("hello world");


//        int[] arr = {1,2,3,4};
//
//
//
//        if (b2 == b3){
//            System.out.println("the strings are the same");
//        }else{
//            System.out.println("the strings are different");
//        }
//
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
//
//        if (b2.equals(b3)){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
//
//
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
//
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
//
//        for (int arrElement : arr){
//            System.out.println(arrElement);
//        }
//
//        House red = new House(3,"flat",true);
//        House blue = new House(3,"flat",true);
//        House green = new House(red);
//
//        red.setHasLawn(false);
//        green.setRoofType("none");
//
//        System.out.println(red);
//        System.out.println(green);
//        System.out.println("Please enter a number");
//        int number = scanner.nextInt();
//
//
//        switch (number){
//            case 1:
//                System.out.println(hundred(number));;
//                break;
//            case 2:
//                System.out.println("two");
//                break;
//            case 3:
//                System.out.println("three");
//                break;
//            case 4:
//                System.out.println("four");
//                break;
//            default:
//                System.out.println("please enter a number between 1 and 4");
//        }
//
//    }
//
//
//    public static int hundred (int n){
//        return n + 99;
//
//           index       0,  1,  2,  3
//        char[] arr = {'a','b','c','d'};
//
//        arr[0] = 'e';
//        System.out.println(arr);
//        arr[4] = 'c';

        LinkedList link1 = new LinkedList();
        link1.add(4);
        link1.add("blah");
        link1.add("another one");
        link1.add(true);
        link1.add(new House(3));
        link1.add(new Calculator());

        System.out.println(link1);

//        LinkedList<Integer> link2 = new LinkedList<>();
//        link2.add(3);
//        link2.add(5);
//        link2.add(6);
//        System.out.println(link2);

        Iterator it = link1.iterator();
        int r = 0;
        while (it.hasNext()){
            System.out.println(r++);
            if (it.next().getClass() == Boolean.class){
                System.out.println("found it");
            }
        }

//        ArrayList arrLink1 = new ArrayList();
//        arrLink1.add("String word");
//        arrLink1.add(4);
//        System.out.println(arrLink1);
//
//        ArrayList<String> arrLink2 = new ArrayList<>();
//        arrLink2.add("Hi");
//        arrLink2.add("Hello");
//        System.out.println(arrLink2);

    }
}


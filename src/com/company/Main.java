package com.company;


import food.Vegetable;

import java.lang.reflect.Array;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

//    static int[][] arr ={
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//    };

    public static void main(String[] args) throws Exception {

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//                System.out.println();
//            }
//        }


//        boolean trueOrFalse = true;
//
//        byte a2 = 127;
//        short a3 = 32767;
//        int a = 5;
//        int b = 7;
//        int c = 8;
//        Integer a1 = 5; // null
//        Integer b1 = b;
//        int n = (int) 1.9;
//        long a4 = 12L;
//        float a5 = 12F;
//        double a6 = 2.5;
//
//        char c1 = 'a';
//        String b2 = "Hello world!";
//        String b3 = "Hello";
//        String b4 = "Hello";



//        System.out.println("hello world");
//
//
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
//

//        LinkedList link1 = new LinkedList();
//        Iterator it = link1.iterator();
//
//        link1.add(4);
//        link1.add("blah");
//        link1.add("another one");
//        link1.add(true);
//        link1.add(new House(3));
//        link1.add(new Calculator());
//
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        System.out.println(link1);
//
//        LinkedList<Integer> link2 = new LinkedList<>();
//        link2.add(3);
//        link2.add(5);
//        link2.add(6);
//        System.out.println(link2);
//
//        ArrayList arrLink1 = new ArrayList();
//        arrLink1.add("String word");
//        arrLink1.add(4);
//        System.out.println(arrLink1);
//
//        ArrayList<String> arrLink2 = new ArrayList<>();
//        arrLink2.add("Hi");
//        arrLink2.add("Hello");
//        System.out.println(arrLink2);
//
// todo: create a function that does this and that



//        int[] arr = new int[5];

//        try{
//            System.out.println("I'm here");
//            arr[8] = 7;
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("out of bound");
//        }catch (Exception e){
//            System.out.println("other");
//        }


//        example1();


//        example2(6);
//        example4();
//        example5(4,0);
//        example8();
//        example5(4,0);
//        example9();
//        example10(6);

        String name = "Rossita";
//        System.out.println(name.charAt(3));
//        System.out.println(name.length());
//        char[] arr = {'a','b','c'};
//        String s = new String(arr);
//        System.out.println(name.concat("sit"));
//        System.out.println(Character.toUpperCase('a'));

//        System.out.println(name.indexOf("sit"));
//        name.replace("ta","s");
//        System.out.println(name);
//
//        StringBuffer buffer = new StringBuffer("Rossita");
//        buffer.insert(4,'d');
//        System.out.println(buffer);

    }

    static void example1(){

        int[] arr = new int[3];
//        arr[4] = 4;

        try{
            arr[4] = 4;
        }catch (Exception e){
            System.out.println("i'm here");
        }

    }

    static void example2(int a) throws Exception{

        if (a > 5)
            throw new Exception("a is bigger than 5");

    }

    static void example3() throws Exception{

        example2(7);

    }

    static void example4() throws Exception{

        try{
            example2(7);
        }catch (Exception e){
            throw e;
        }

    }

    static void example5(int a, int b){

//        System.out.println(a / b);
        if (b == 0)
            throw new/*!!!*/ ArithmeticException("division by zero duh");
    }

    static void example6(){}

    static void example7(){
        try {
            example5(4,0);
        } catch (ArithmeticException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    static void example8(){

        int[] arr = new int[3];

        try{
            arr[4] = 7;
        }catch (Exception e){
            System.out.println("we caught you");
        }finally {
            System.out.println("i'm executed no matter what");
        }

    }

    static void example9(){

        int[] arr = new int[3];

        try{
            arr[4] = 7;
        }catch (Exception e){
            System.out.println("caught you");
        }finally {
            try{
                arr[3] = 8;
            }catch (Exception e){
                System.out.println("caught you again");
            }
        }

    }

    static void example10(int x) throws OurException{

        if(x > 5){
            throw new OurException(x + " is larger than 5");
        }else{
            System.out.println(x + " is smaller than 5");
        }


    }

}


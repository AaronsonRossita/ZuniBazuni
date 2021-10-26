package generic;

import java.util.ArrayList;

public class GenericRunner {

    public static void main(String[] args) {

//        ArrayList<MyClass> arr = new ArrayList<>();
//
//        int element = arr.indexOf(1);
//        System.out.println(element);
//        System.out.println(arr.get(1).getClass());
//
//        Integer[] arr1 = {1,2,3,4};
//        String[] arr2 = {"b"};
//
//        MyClass<Integer> obj1 = new MyClass(1);
//        MyClass<String> obj2 = new MyClass("a");
//
//        MyClass<Integer, String> newObj = new MyClass<>(3,"three");
//        newObj.getType();

        NumericClass<Double> num = new NumericClass<>(4.2);
//        System.out.println(num.square());

        NumericClass<Integer> iNum = new NumericClass<>(5);
        NumericClass<Double> dNum = new NumericClass<>(5.0);



        System.out.println(iNum.absValue(dNum));


    }



}

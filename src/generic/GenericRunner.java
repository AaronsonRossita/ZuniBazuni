package generic;

import java.util.ArrayList;

public class GenericRunner {

    public static void main(String[] args) {

//        ArrayList<MyClass> arr = new ArrayList<>();
//
//        int element = arr.indexOf(1);
//        System.out.println(element);
//        System.out.println(arr.get(1).getClass());

        Integer[] arr1 = {1,2,3,4};
        String[] arr2 = {"b"};

        MyClass<Integer> obj1 = new MyClass(1);
        MyClass<String> obj2 = new MyClass("a");

        System.out.println(obj1);
        int a = obj1.getOb();


    }



}

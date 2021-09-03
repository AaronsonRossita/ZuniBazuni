package package2;

import package1.Class1;
import package1.Class2;

public class Runner2 {

    public static void main(String[] args) {

        Class1 class1 = new Class1();
        Class2 class2 = new Class2();
        Class3 class3 = new Class3();

        System.out.println(class1.b);
        System.out.println(class2.b);

        System.out.println(class3.b);

        class3.two();

    }
}

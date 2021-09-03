package package1;

public class Runner1 {

    public static void main(String[] args) {

        Class1 class1 = new Class1();
        Class2 class2 = new Class2();

        System.out.println(class1.a);
        System.out.println(class1.b);
//        System.out.println(class1.c);
        System.out.println(class1.d);

        System.out.println(class2.a);
        System.out.println(class2.b);
//        System.out.println(class2.c);
        System.out.println(class2.d);

        class1.one();
        class1.two();
        class1.four();

        class2.one();
        class2.two();
        class2.four();




    }
}

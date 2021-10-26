package generic;

import java.util.HashMap;

public class MyClass<T, V> {

    T ob1;
    V ob2;
//    T[] arr;
    HashMap<T, V> hashy;

    public MyClass(T ob, V ob2) {
        this.ob1 = ob;
        this.ob2 = ob2;
//        this.arr = arr;
    }

    public T getOb1() {
        return ob1;
    }

    public void setOb1(T ob1) {
        this.ob1 = ob1;
    }

    public void getType(){
        System.out.println(ob1.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }

    @Override
    public String toString() {
        return ob1.toString() ;
    }
}

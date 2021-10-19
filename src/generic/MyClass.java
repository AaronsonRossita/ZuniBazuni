package generic;

public class MyClass<T> {

    T ob;
//    T[] arr;

    public MyClass(T ob) {
        this.ob = ob;
//        this.arr = arr;
    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }


    @Override
    public String toString() {
        return ob.toString() ;
    }
}

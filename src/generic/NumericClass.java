package generic;

public class NumericClass<T extends Number> {

    T num;

    public NumericClass(T ob) {
        this.num = ob;
    }

    public T getOb() {
        return num;
    }

    public void setOb(T ob) {
        this.num = ob;
    }

    public double square(){
        return num.intValue() * num.doubleValue();
    }

    public boolean absValue(NumericClass<?> ob){
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;
    }
}

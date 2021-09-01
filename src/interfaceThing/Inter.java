package interfaceThing;

interface FirstInterface{

    int a = 8;

    void print();

    int sum(int a, int b);
}

interface SecondInterface{

}

public class Inter implements FirstInterface, SecondInterface {

    public static void main(String[] args) {

    }

    @Override
    public void print() {
        System.out.println(FirstInterface.a);
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}

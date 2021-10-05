package factory;

public interface Shape {

    void draw();
    void getPerimeter();
    default void whatClass(){
        System.out.println("I'm a Shape Interface");
    };
}

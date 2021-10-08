package design_patterns.singleton;

public class SingletonClass {

    private static SingletonClass obj = null;

    private String name;

    private SingletonClass(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static SingletonClass getInstance(String name){
        if (obj == null){
            obj = new SingletonClass();
            obj.setName(name);
        }
        return obj;
    }

}

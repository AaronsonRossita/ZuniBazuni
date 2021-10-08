package design_patterns.prototype;

public class PrototypeRunner {

    public static void main(String[] args) {

        CloneFactory cloneFactory = new CloneFactory();

        Sheep original = new Sheep("Dolly");
        System.out.println(original.name);
        Sheep clone = (Sheep) cloneFactory.getClone(original);
        System.out.println(clone.name);
        System.out.println("-------");
        clone.name = "Sally";
        System.out.println("This is the clone's new name = " + clone.name);
        System.out.println("This is the original's name = " + original.name);

    }

}

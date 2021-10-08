package design_patterns.prototype;

public class Sheep implements Animal {

    public String name;

    public Sheep(String name) {
        this.name = name;
        System.out.println("Sheep is made");
    }


    @Override
    public Animal cloneAnimal() {
        System.out.println("Sheep is being made");
        Sheep clonedSheep = null;
        try {
            clonedSheep = (Sheep) super.clone();
            System.out.println("Sheep is cloned");
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed");
            e.printStackTrace();
        }
        return clonedSheep;
    }
}

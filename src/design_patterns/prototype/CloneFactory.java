package design_patterns.prototype;

public class CloneFactory {

    public Animal getClone(Animal sample){
        return sample.cloneAnimal();
    }

}

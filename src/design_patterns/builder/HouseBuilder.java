package design_patterns.builder;

public interface HouseBuilder {

    void buildBasement();
    void buildWindows();
    void buildDoors();
    void buildRoof();

    House buildHouse();

}

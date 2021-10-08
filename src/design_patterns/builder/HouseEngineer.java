package design_patterns.builder;

public class HouseEngineer {

    private HouseBuilder houseBuilder;

    public HouseEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse(){
        houseBuilder.buildBasement();
        houseBuilder.buildWindows();
        houseBuilder.buildDoors();
        houseBuilder.buildRoof();
    }

    public House getHouse(){
        constructHouse();
        return this.houseBuilder.buildHouse();
    }
}

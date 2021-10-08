package design_patterns.builder;

public class BachelorPad implements HouseBuilder {

    private House house;

    public BachelorPad() {
        house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement(false);
    }

    @Override
    public void buildWindows() {
        house.setWindows(2);
    }

    @Override
    public void buildDoors() {
        house.setDoors(1);
    }

    @Override
    public void buildRoof() {
        house.setRoof("none");
    }

    @Override
    public House buildHouse() {
        return house;
    }

}


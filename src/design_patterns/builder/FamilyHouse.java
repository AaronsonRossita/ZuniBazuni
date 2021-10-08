package design_patterns.builder;

public class FamilyHouse implements HouseBuilder {

    private House house;

    public FamilyHouse() {
        house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement(true);
    }

    @Override
    public void buildWindows() {
        house.setWindows(8);
    }

    @Override
    public void buildDoors() {
        house.setDoors(2);
    }

    @Override
    public void buildRoof() {
        house.setRoof("Classic");
    }

    @Override
    public House buildHouse() {
        return house;
    }

}

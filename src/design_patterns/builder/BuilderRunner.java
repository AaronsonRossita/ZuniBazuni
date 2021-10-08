package design_patterns.builder;

public class BuilderRunner {

    public static void main(String[] args) {

        FamilyHouse familyHouse = new FamilyHouse();
        BachelorPad bachelorPad = new BachelorPad();
        HouseEngineer houseEngineer = new HouseEngineer(bachelorPad);
        House house = houseEngineer.getHouse();
        System.out.println(house);

    }

}

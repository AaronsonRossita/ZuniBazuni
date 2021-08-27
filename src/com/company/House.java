package com.company;

public class House {

    private int windows;
    private String roofType;
    private boolean hasLawn;

    public House(){

    }

    public House(int windows) {
        this.windows = windows;
    }

    public House(int windows, String roofType, boolean hasLawn) {
        this.windows = windows;
        this.roofType = roofType;
        this.hasLawn = hasLawn;
    }

    public House(House house){
        this.windows = house.getWindows();
        this.roofType = house.getRoofType();
        this.hasLawn = house.hasLawn;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public boolean isHasLawn() {
        return hasLawn;
    }

    public void setHasLawn(boolean hasLawn) {
        this.hasLawn = hasLawn;
    }

    @Override
    public String toString() {
//        return super.toString();  the original toString method
        return "This house has " + windows + " windows, has a " + roofType
                + " roof and the lawn is " + hasLawn;
    }

    @Override
    public boolean equals(Object obj) {
        House house = (House) obj;
        if (this.windows == house.getWindows() && this.roofType == house.getRoofType()
            && this.hasLawn == house.hasLawn){
            return true;
        }else{
            return false;
        }
//        return super.equals(obj);
    }
}

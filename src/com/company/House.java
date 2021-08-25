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


}

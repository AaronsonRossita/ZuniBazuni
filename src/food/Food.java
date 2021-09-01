package food;

public class Food {

    private String type;
    private boolean availability;


    public Food(String type, boolean availability) {
        this.type = type;
        this.availability = availability;
    }



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public boolean equals(Object obj) {
        Food f = (Food) obj;
        if(type == f.type){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        String a = "";
        if (availability){
            a = "available";
        }else{
            a = "not available";
        }
        return "This food is of type: " + type
                + " and it is " + a + " at the store";
    }

}

package Object_And_Classes_Exercise.VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String type,String model,String color, int horsepower){
        this.type = capitalizeFirstLetter(type);
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getHorsepower() {
        return horsepower;
    }
    private String capitalizeFirstLetter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        return Character.toUpperCase(input.charAt(0)) + input.substring(1).toLowerCase();
    }
}

package web.model;

public class Car {
    private String model;
    private String color;
    private String countDoors;

    public Car() {
    }

    public Car(String model, String color, String countDoors) {
        this.model = model;
        this.color = color;
        this.countDoors = countDoors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(String countDoors) {
        this.countDoors = countDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", countDoors='" + countDoors + '\'' +
                '}';
    }
}
package models;

public class Car implements DTOInterface{

    int id;
    String make;
    String model;
    int year;
    String color;
    int vin;

    public Car() {
    }

    public Car(String make, String model, int year, String color, int vin) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.vin = vin;
    }

    public Car(int id, String make, String model, int year, String color, int vin) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public void setId(int id){
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }
}

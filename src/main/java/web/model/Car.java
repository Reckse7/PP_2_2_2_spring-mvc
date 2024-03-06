package web.model;

public class Car {
    private String model;
    private String color;
    private int seats;

    public Car() {
    }

    public Car(String model, String color, int seats) {
        this.model = model;
        this.color = color;
        this.seats = seats;
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

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}

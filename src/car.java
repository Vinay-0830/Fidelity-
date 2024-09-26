public class car {
    String model;
    String color;
    int year;

    car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}


public class Car {
 
    private String color;
    private String model;
    private int year;
    private String name;

    
    public Car(String color, String model, int year,String name) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.name = name;
  
    }

    public String getcolor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
     public String getname() {
        return name;
    }


    public static void main(String[] args) {
        Car myCar = new Car("SEAGREEN", "X5", 2022,"BMW");
        System.out.println("Car Information:");
        System.out.println("color: " + myCar.getcolor());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Name: " + myCar.getname());

       
    }
}
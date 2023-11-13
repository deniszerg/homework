package homework26.task02;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double engineVolume;
    private String color;
    private double mileage;

    // Конструктор по умолчанию
    public Car() {
      // По умолчанию устанавливаем значения полей
      this.brand = "Unknown";
      this.model = "Unknown";
      this.year = 0;
      this.engineVolume = 0.0;
      this.color = "Unknown";
      this.mileage = 0.0;
    }

    // Конструктор с параметрами
    public Car(String brand, String model, int year, double engineVolume, String color, double mileage) {
      this.brand = brand;
      this.model = model;
      this.year = year;
      this.engineVolume = engineVolume;
      this.color = color;
      this.mileage = mileage;
    }

    // Метод для вывода информации об автомобиле
    public void displayInfo() {
      System.out.println("Автомобиль " + brand + " " + model + " " + year + " года выпуска, "
              + "объем двигателя " + engineVolume + " л, цвет " + color + ", пробег " + mileage + " км.");
    }
}

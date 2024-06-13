package objectoriented;

public class Vehicle implements Engine{
    public int NumberOfSeats;
    public int NumberOfWheels;
    private String cinsiyet;

    public void start() {
        System.out.println("Arac calısıyor...");
    }
    public void stop() {
        System.out.print("Araç duruyor...");
    }
}

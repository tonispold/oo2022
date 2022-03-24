package Kodutöö;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle1 auto = new Vehicle1("Mercedes", 140000, "Latvia");
        System.out.println(auto.isMercedes());
        System.out.println(auto.nextCheck());
        System.out.println(auto.whatNation());
        System.out.println("");

        Vehicle2 auto2 = new Vehicle2("Audi", 98000, "Estonia");
        System.out.println(auto2.isMercedes());
        System.out.println(auto2.nextCheck());
        System.out.println(auto2.whatNation());
        System.out.println("");

        Vehicle3 auto3 = new Vehicle3("Ferrari", 27000, "Italy");
        System.out.println(auto3.isMercedes());
        System.out.println(auto3.nextCheck());
        System.out.println(auto3.whatNation());
    }
}

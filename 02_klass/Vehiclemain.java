public class Vehiclemain {
    public static void main(String[] args) {
        Vehicle one = new Vehicle("Mercedes-Benz", 133456, 5, false, 130000);
        System.out.println(one);
        one.vehicleName();
        one.nextCheck();
    }
}

public class Vehiclemain {
    public static void main(String[] args) {
        Vehicle one = new Vehicle("Mercedes-Benz", 133456, 5, false, 130000);
        System.out.println(one);
        one.vehicleName();
        one.nextCheck();
        System.out.println("");
        Vehicle two = new Vehicle("Audi", 95345, 7, true, 100000);
        two.vehicleName();
        two.nextCheck();
    }
}

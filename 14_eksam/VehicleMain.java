import java.util.Scanner;

public class VehicleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int mileage;
        String ownership;

        System.out.println("Tere tulemast auto ülevaatusesse!\n\n");
        outer:
        while(true) {
            while (true) {
                System.out.println("Kas teil on Mercedes?\n[Y/N]: ");
                name = scanner.next();
                if (name.equals("Y") || name.equals("y")) {
                    name = "Mercedes";
                    break;
                } else if (name.equals("N") || name.equals("n")) {
                    System.out.println("Sisesta oma auto mark: ");
                    name = scanner.next();
                    break;
                } else {
                    System.out.println("Palun sisestage Y või N");
                }
            }
            while (true) {
                System.out.println("Sisestage oma auto läbisõit\n[km]: ");
                try {
                    mileage = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Palun sisestage korrektne läbisõit!");
                }
            }
            while (true) {
                System.out.println("Kas teie auto on registreeritud Eestis?\n[Y/N]: ");
                ownership = scanner.next();
                if (ownership.equals("Y") || ownership.equals("y")) {
                    ownership = "Eestis";
                    break;
                } else if (ownership.equals("N") || ownership.equals("n")) {
                    System.out.println("Mis riigis on teie auto registreeritud?: ");
                    ownership = scanner.next();
                    break;
                } else {
                    System.out.println("Palun sisestage Y või N");
                }
            }

            CreateVehicle auto = new CreateVehicle(name, mileage, ownership);
            System.out.println("Kas on Mercedes? " + auto.isMercedes());
            System.out.println(auto.nextCheck());
            //System.out.println(auto.whatNation());
            System.out.println("Auto on registreeritud " + ownership);

            System.out.println("\n\nKas soovite uut autot ülevaadata? \n[Y/N]: ");
            while(true){
                String valik = scanner.next();
                if (valik.equals("Y") || valik.equals("y")) {
                    break;
                } else if (valik.equals("N") || valik.equals("n")) {
                    break outer;
                } else {
                    System.out.println("Palun sisestage Y või N");
                }
            }
        }
    }
}
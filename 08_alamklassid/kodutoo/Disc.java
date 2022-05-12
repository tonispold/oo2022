package kodutoo;

import java.util.Objects;
import java.util.Scanner;

public class Disc {
    public void Viska() {
        outer:
        while(true) {
            System.out.println("Mis ketast te visata tahate? (Putter, Midrange või Driver)");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if (Objects.equals(input, "Putter")) {
                System.out.println("Viskasite 50m kaugusele!");
            }
            if (Objects.equals(input, "Midrange")) {
                System.out.println("Viskasite 80m kaugusele!");
            }
            if (Objects.equals(input, "Driver")) {
                System.out.println("Viskasite 100m kaugusele!");
            }

            System.out.println("Kas soovite uuesti visata? (Y/N)");
            while (true) {
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

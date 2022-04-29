package kodutoo;

import java.util.Objects;
import java.util.Scanner;

public class Disc {
    public void Viska() {
        System.out.println("Mis ketast te visata tahate? (Putter, Midrange või Driver)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (Objects.equals(input, "Putter")) {
            System.out.println("Viskasite 50m kaugusele!");
        }
        if (Objects.equals(input, "Midrange")) {
            System.out.println("Viskasite 80m kaugusele!");
        }
        if (Objects.equals(input, "Midrange")) {
            System.out.println("Viskasite 100m kaugusele!");
        }
    }
}

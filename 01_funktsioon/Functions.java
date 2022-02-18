import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        System.out.println(fahrenheitToCelcius());
        System.out.println(calculateYear());
        System.out.println(grade());
    }
    public static float fahrenheitToCelcius() {
        System.out.println("Kraadid fahrenheidis: ");
        Scanner scanner = new Scanner(System.in);
        String kraadidF = scanner.nextLine();
        return ((Float.parseFloat(kraadidF)-32)*5)/9;
    }
    public static int calculateYear() {
        System.out.println("Teie vanus: ");
        Scanner scanner = new Scanner(System.in);
        String vanus = scanner.nextLine();
        int aasta = Date.from(Instant.now()).getYear();
        int synniaasta = aasta-Integer.parseInt(vanus);
        return synniaasta+1900;
    }
    public static String grade() {
        System.out.println("Palun sisestage saadud hinne: ");
        Scanner scanner = new Scanner(System.in);
        String hinne = scanner.nextLine();
        if (Integer.parseInt(hinne) == 5) {
            return "Sooritasite töö maksimum hindele!";
        } else if (Integer.parseInt(hinne) > 5) {
            return "Teie sisestatud hinne on maksimum hindest suurem";
        } else {
            return "Seekord te kahjuks maksimum hinnet ei saanud.";
        }

    }
}

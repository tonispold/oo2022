public class Funktsioonid {
    public static void main(String[] args) {
        System.out.println(taksoSõit( h:3.5);

        double sõiduMaksumus = taksoSõit( h:0.5);
        System.out.println(sõiduMaksumus);

        prindiForTsükkel(5);

        System.out.println(temperatuurHinnang(-2));
        String hinnang = temperatuurHinnang(-2);
        System.out.println(hinnang);
    }

    public static double taksoSõit(double h) {
        return 3+0.8*h;
    }

    public static void prindiForTsükkel(int kordadeArv) {
        for (int i = 0; i < kordadeArv; i++) {
            System.out.println(i*10);
        }
    }

    public static String temperatuurHinnang(float temperatuur) {
        if (temperatuur < 0) {
            return "On jääs";
        } else {
            return "Ei ole jääs"
        }
    }
}

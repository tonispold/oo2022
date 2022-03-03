public class Main {
    public static void main(String[] args) {
        System.out.println("");

        Info info = new Info("Emlilien", "Jaquelin", 26, "Prantslane", 346);
        Biathlon biathlete = new Biathlon(info, 842, "Esimesel");

        String competitor1 = biathlete.biathlonInfo();
        System.out.println(competitor1);

        Info info2 = new Info("Tarjei", "Boe", 31, "Norralane", 298);
        Biathlon biathlete2 = new Biathlon(info2, 1023, "Teisel");

        String competitor2 = biathlete2.biathlonInfo();
        System.out.println(competitor2);

        Info info3 = new Info("Kalev", "Ermits", 29, "Eestlane", 278);
        Biathlon biathlete3 = new Biathlon(info3, 523, "Kolmandal");

        String competitor3 = biathlete3.biathlonInfo();
        System.out.println(competitor3);

        System.out.println("");
        int seperateOneTwo = info.points - info2.points;
        System.out.println("Esimese ja teise kohal on punktide vahe: " + seperateOneTwo + " punkti!");
        int seperateTwoThree = info2.points - info3.points;
        System.out.println("Teise ja kolmanda kohal on punktide vahe: " + seperateTwoThree + " punkti!");
    }
}

public class Vehicle {
    String nimi;
    int labisoit;
    int vanus;
    boolean sedaan;
    int ulevaatus;

    public Vehicle(String nimi, int labisoit, int vanus, boolean sedaan, int ulevaatus) {
        this.nimi = nimi;
        this.labisoit = labisoit;
        this.vanus = vanus;
        this.sedaan = sedaan;
        this.ulevaatus = ulevaatus;
    }

    public void vehicleName() {
        System.out.println("Minu auto on " + nimi + " ning see on mul olnud juba " + vanus + " aastat");
    }

    public void nextCheck() {
        if (ulevaatus < labisoit) {
            int aegaule = labisoit - ulevaatus;
            System.out.println("Te peate minema ülevaatusele! Teil on juba " + aegaule + " km üle!");
        } else {
            int aega = ulevaatus - labisoit;
            System.out.println("Teie ülevaatuseni on veel aega: " + aega + " km");
        }
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "nimi='" + nimi + '\'' +
                ", labisoit=" + labisoit +
                ", vanus=" + vanus +
                ", sedaan=" + sedaan +
                ", ulevaatus=" + ulevaatus +
                '}';
    }
}

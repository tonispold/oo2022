package Kodutöö;

public class Vehicle1 implements VehicleObject {
    String name;
    int mileage;
    String ownership;
    int[] checks = {50000,100000,150000,200000};

    public Vehicle1(String name, int mileage, String ownership) {
        this.name = name;
        this.mileage = mileage;
        this.ownership = ownership;
    }

    @Override
    public boolean isMercedes() {
        return name.contentEquals("Mercedes");
    }

    @Override
    public String nextCheck() {
        if(mileage < checks[0]) {
            return "Järgmine ülevaatus on 50000 km täitumisel";
        }
        if(mileage < checks[1] & mileage > checks[0]) {
            return "Järgmine ülevaatus on 100000 km täitumisel";
        }
        if(mileage < checks[2] & mileage > checks[1]) {
            return "Järgmine ülevaatus on 150000 km täitumisel";
        }
        if(mileage < checks[3] & mileage > checks[2]) {
            return "Järgmine ülevaatus on 200000 km täitumisel";
        } else {
            return "Peaksite uue auto ostma!";
        }
    }

    @Override
    public String whatNation() {
        if(ownership == "Estonia") {
            return "Auto on registreeritud Eestis";
        } else {
            return "Auto on registreeritud välismaal";
        }
    }
}
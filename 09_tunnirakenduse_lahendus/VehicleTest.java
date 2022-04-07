import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {
    CreateVehicle auto1, auto2, auto3, auto4;
    @BeforeEach
    public void Kontroll_CreateVehicle(){
        auto1 = new CreateVehicle("Mercedes", 10000, "Estonia");
        auto2 = new CreateVehicle("Mercedes", 12000, "Latvia");
        auto3 = new CreateVehicle("pepe", 14000, "Estonia");
        auto4 = new CreateVehicle("pepe", 16000, "Mongoolia");
    }
    @Test
    public void kontroll_name(){
        assertEquals(true, auto1.isMercedes(), "funktsioon peaks return-ima true");
        assertEquals(true, auto2.isMercedes(), "funktsioon peaks return-ima true");
        assertEquals(false, auto3.isMercedes(), "funktsioon peaks return-ima false, kuna auto mudel on pepe");
        assertEquals(false, auto4.isMercedes(), "funktsioon peaks return-ima false, kuna auto mudel on pepe");
    }

    @Test
    public void kontroll_mileage(){
        assertEquals("Järgmine ülevaatus on 50000 km täitumisel", auto1.nextCheck(), "funktsioon peaks return-ima 50000 km teate");
        auto1.changeMileage(75000);
        assertEquals("Järgmine ülevaatus on 100000 km täitumisel", auto1.nextCheck(), "funktsioon peaks return-ima 100000 km teate");
        auto1.changeMileage(125000);
        assertEquals("Järgmine ülevaatus on 150000 km täitumisel", auto1.nextCheck(), "funktsioon peaks return-ima 150000 km teate");
        auto1.changeMileage(175000);
        assertEquals("Järgmine ülevaatus on 200000 km täitumisel", auto1.nextCheck(), "funktsioon peaks return-ima 200000 km teate");
        auto1.changeMileage(225000);
        assertEquals("Peaksite uue auto ostma!", auto1.nextCheck(), "funktsioon peaks return-ima, et peate uue auto ostma");
        auto1.changeMileage(-1000);
        assertEquals("Järgmine ülevaatus on 50000 km täitumisel", auto1.nextCheck(), "funktsioon peaks return-ima 50000 km teate");
    }

    @Test
    public void kontroll_ownership(){
        assertEquals("Auto on registreeritud Eestis", auto1.whatNation(), "funktsioon peaks return-ima, et auto on eestist");
        assertEquals("Auto on registreeritud Eestis", auto3.whatNation(), "funktsioon peaks return-ima, et auto on eestist");
        assertEquals("Auto on registreeritud välismaal", auto2.whatNation(), "funktsioon peaks return-ima, et auto ei ole eestist");
        assertEquals("Auto on registreeritud välismaal", auto4.whatNation(), "funktsioon peaks return-ima, et auto ei ole eestist");
    }

}

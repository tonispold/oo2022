package isikukood;

import kujundid.Kolmnurk;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AutomaatTest {
    // alt + enter --> classpath 4 / 5.8

    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_alguses_on_4() {
        IsikukoodEE ee = new IsikukoodEE("4513112313");
        assertEquals(false, ee.isMale());
    }

    @Test
    public void kontrolli_kas_on_synniaasta_1951_kui_isikukoodi_keskel_on_51() {
        IsikukoodLV lv = new IsikukoodLV("120351-51237");
        assertEquals(1951, lv.getBirthYear());
    }

    @Test
    public void kontrolli_kas_kujundi_ymbermoot_arvutatakse_korrektselt() {
        Kolmnurk kolmnurk = new Kolmnurk(5.0,6.0,7.0);
        assertEquals(18, kolmnurk.arvutaYmbermoot(), 0.1);
    }
}

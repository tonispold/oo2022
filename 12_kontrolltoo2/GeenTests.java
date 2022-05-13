import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GeenTests {

    // punane -> alt enter -> add junit4 to classpath
    @Test
    public void geeniTestPos() {
        Alleel a1=new Alleel("reesus","-");
        Alleel a2=new Alleel("reesus","+");
        Geen g1=new Geen(a1,a2);
        assertEquals(true, g1.createGene());
    }

    @Test
    public void geeniTestNeg() {
        Alleel a1=new Alleel("reesus","-");
        Alleel a2=new Alleel("reesus","-");
        Geen g1=new Geen(a1,a2);
        assertEquals(false, g1.createGene());
    }

    @Test
    public void geeniTestNimi() {
        Alleel a1=new Alleel("reesus","-");
        Alleel a2=new Alleel("beesus","+");
        Geen g1=new Geen(a1,a2);
        assertEquals(true, g1.error);
    }
}
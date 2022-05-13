import java.io.*;

public class Geen {
    Alleel a1;
    Alleel a2;
    boolean posneg;
    boolean error = false;
    int randomAlleel;
    Alleel selectedAlleel;
    Geen uusGeen;
    Geen lapseGeen;
    Alleel uueGeeniAlleel;
    Alleel lapseAlleel;

    public Geen(Alleel a1, Alleel a2) {
        if (a1.name.equals(a2.name)) {
            this.a1 = a1;
            this.a2 = a2;
        } else {
            this.error = true;
        }
    }

    public boolean createGene() {
        if (a1.posneg == true || a2.posneg == true) {
            posneg = true;
        } else {
            posneg = false;
        }
        return posneg;
    }

    public Alleel selectRandomAlleel(){
        randomAlleel=(int)(Math.random()*2);
        if(randomAlleel==0){
            System.out.println(a1.name+" "+a1.posneg);
            selectedAlleel=a1;
        }
        else if(randomAlleel==1){
            System.out.println(a2.name+" "+a2.posneg);
            selectedAlleel=a2;
        }
        return selectedAlleel;
    }

    public Geen createNewGene(Geen g1, Geen g2){
        uusGeen=new Geen(g1.selectRandomAlleel(),g2.selectRandomAlleel());
        return uusGeen;
    }

    public Geen lapseGeen(Alleel esimeseVanemaAlleel, Alleel teiseVanemaAlleel)throws IOException{
        lapseAlleel=esimeseVanemaAlleel;
        lapseGeen=new Geen(esimeseVanemaAlleel,teiseVanemaAlleel);
        PrintWriter pw1=new PrintWriter(
                new FileWriter("geenid.txt")
        );
        pw1.println(lapseAlleel.name+" "+lapseGeen.posneg);
        pw1.close();
        return lapseGeen;
    }
}

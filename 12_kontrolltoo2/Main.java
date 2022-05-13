import java.io.*;

public class Main{
    public static void main(String[] arg)throws IOException{
        Alleel a1=new Alleel("reesus","-");
        Alleel a2=new Alleel("reesus","+");
        Alleel a3=new Alleel("reesus","-");
        Alleel a4=new Alleel("reesus","-");
        Geen g1=new Geen(a1,a2);
        Geen g2=new Geen(a3,a4);
        Geen uusGeen=g1.createNewGene(g1,g2);
        g2.lapseGeen(a1,a4);
        if(!g1.error){
            System.out.println(g1.createGene());
        }
        else{
            System.out.println("Erinevad alleelid");
        }
        g1.selectRandomAlleel();
        System.out.println(uusGeen.posneg);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class KT {
    public static void main(String[] args) {
        // valisin  * Algarvud *
        System.out.println("Sisestage arv: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        if (num % 2 == 0) {
            System.out.println("Teie sisestatud arv jagub 2-ga");
        }
        if (num % 3 == 0) {
            System.out.println("Teie sisestatud arv jagub 3-ga");
        }
        if (num % 5 == 0) {
            System.out.println("Teie sisestatud arv jagub 5-ga");
        }
        if (num % 7 == 0) {
            System.out.println("Teie sisestatud arv jagub 7-ga");
        }
        if (num % 2 != 0 & num % 3 != 0 & num % 5 != 0 & num % 7 != 0){
            System.out.println("Teie sisestatud arv ei jagu 2, 3, 5 ega 7-ga");
        }
        System.out.println(num + " on algarv: " + kasOnAlgarv(num));
        ArrayList<Integer> algarvudeList = new ArrayList<Integer>();
        ArrayList<Integer> vaiksemList = new ArrayList<Integer>();

       for(int i = 2; i <= 7919; i++){
            if (kasOnAlgarv(i)) {
                algarvudeList.add(i);
            }
       }

       int tuhanderuut = algarvudeList.get(algarvudeList.size()-1) * algarvudeList.get(algarvudeList.size()-1);
       int count = tuhanderuut;
       while(vaiksemList.size() <= 10){
            if (kasOnAlgarv(count)) {
                vaiksemList.add(count);
            }
            count--;
       }
       System.out.println("Kümme esimest 1000. algarvu ruudust väiksemat algarvu on: " + vaiksemList);
    }

    private static boolean kasOnAlgarv(int algarv){

        for(int i = 2; i <= algarv / 2; i++) {
            if(algarv % i == 0) {
                return false;
            }
        }
        return true;
    }
}


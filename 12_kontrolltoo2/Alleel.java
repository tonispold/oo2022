public class Alleel {
    String name;
    boolean posneg;

    public Alleel(String name, String posneg){
        this.name=name;
        if(posneg.equals("+")){
            this.posneg=true;
        } else {
            this.posneg=false;
        }
    }
}

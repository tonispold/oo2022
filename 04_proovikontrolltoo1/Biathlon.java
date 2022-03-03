public class Biathlon {
    Info info;
    int pointsPerNationality;
    String place;

    public Biathlon(Info info, int pointsPerNationality, String place) {
        this.info = info;
        this.pointsPerNationality = pointsPerNationality;
        this.place = place;
    }

    public String biathlonInfo() {
        return  this.place + " kohal oleva atleedi info on: " + this.info + " ning tema riik on kokku kogunud: " + this.pointsPerNationality + " punkti.";
    }
}

package ppbo.uas.model;

public class Lingkaran extends Object2D {
    private double jarijari;

    public Lingkaran(String label, double jarijari){
        super(label);
        this.jarijari = jarijari;
    }
    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
    public double hitungLuas() {
        return Math.PI * jarijari * jarijari;
    }
    public double hitungKeliling() {
        return 2 * Math.PI * jarijari;
    }
   public String[][] getKeyValueDetails() {
        String[][] parentDetails = super.getKeyValueDetails();
        String[][] details = new String[parentDetails.length + 4][2];
        System.arraycopy(parentDetails, 0, details, 0, parentDetails.length);
        details[parentDetails.length] = new String[]{"tipe", "Lingkaran"};
        details[parentDetails.length + 1] = new String[]{"jari-jari", String.valueOf(jarijari)};
        details[parentDetails.length + 2] = new String[]{"luas", String.valueOf(hitungLuas())};
        details[parentDetails.length + 3] = new String[]{"keliling", String.valueOf(hitungKeliling())};
        return details;
    }
}
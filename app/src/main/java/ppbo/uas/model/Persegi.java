package ppbo.uas.model;

public class Persegi extends Object2D {
    private double sisi;

    public Persegi(String label, double sisi){
        super(label);
        this.sisi = sisi;
    }
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    public double hitungLuas() {
        return sisi * sisi;
    }
    public double hitungKeliling() {
        return 4 * sisi;
    }
   public String[][] getKeyValueDetails() {
        String[][] parentDetails = super.getKeyValueDetails();
        String[][] details = new String[parentDetails.length + 4][2];
        System.arraycopy(parentDetails, 0, details, 0, parentDetails.length);
        details[parentDetails.length] = new String[]{"tipe", "Persegi"};
        details[parentDetails.length + 1] = new String[]{"sisi", String.valueOf(sisi)};
        details[parentDetails.length + 2] = new String[]{"luas", String.valueOf(hitungLuas())};
        details[parentDetails.length + 3] = new String[]{"keliling", String.valueOf(hitungKeliling())};
        return details;
    }
}
package ppbo.uas.model;

public class Kubus extends Object3D{
    
    private double sisi;

    public Kubus(String label, double sisi) {
        super(label);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }

    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }

    public String[][] getKeyValueDetails() {
        String[][] parentDetails = super.getKeyValueDetails();
        String[][] details = new String[parentDetails.length + 2][2];
        System.arraycopy(parentDetails, 0, details, 0, parentDetails.length);
        details[parentDetails.length] = new String[]{"tipe", "Kubus"};
        details[parentDetails.length + 1] = new String[]{"sisi", String.valueOf(sisi)};
        return details;
    }
}

package ppbo.uas.model;

public class Kerucut extends Object3D {
    private double jariJari;
    private double tinggi;

    public Kerucut(String label, double jariJari, double tinggi) {
        super(label);
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }
    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
    }
    public double hitungLuasPermukaan() {
        double garisPelukis = Math.sqrt(Math.pow(jariJari, 2) + Math.pow(tinggi, 2));
        return Math.PI * jariJari * (jariJari + garisPelukis);
    }
    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public String[][] getKeyValueDetails() {
        String[][] parentDetails = super.getKeyValueDetails();
        String[][] details = new String[parentDetails.length + 2][2];
        System.arraycopy(parentDetails, 0, details, 0, parentDetails.length);
        details[parentDetails.length] = new String[]{"tipe", "Kerucut"};
        details[parentDetails.length + 1] = new String[]{"jariJari", String.valueOf(jariJari)};
        details[parentDetails.length + 2] = new String[]{"tinggi", String.valueOf(tinggi)};
        return details;
    }

}

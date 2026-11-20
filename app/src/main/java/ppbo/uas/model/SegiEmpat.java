package ppbo.uas.model;

public class SegiEmpat extends Object2D {
    private double panjang;
    private double lebar;

    public SegiEmpat(String label, double panjang, double lebar){
        super(label);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double hitungLuas() {
        return panjang * lebar;
    }
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
   public String[][] getKeyValueDetails() {
        String[][] parentDetails = super.getKeyValueDetails();
        String[][] details = new String[parentDetails.length + 4][2];
        System.arraycopy(parentDetails, 0, details, 0, parentDetails.length);
        details[parentDetails.length] = new String[]{"tipe", "SegiEmpat"};
        details[parentDetails.length + 1] = new String[]{"panjang", String.valueOf(panjang)};
        details[parentDetails.length + 2] = new String[]{"lebar", String.valueOf(lebar)};
        details[parentDetails.length + 3] = new String[]{"luas / keliling", hitungLuas() + " / " + hitungKeliling()};
        return details;
    }
}
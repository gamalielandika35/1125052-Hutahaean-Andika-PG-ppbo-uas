package ppbo.uas.model;

public class Balok extends Object3D {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(String label, double panjang, double lebar, double tinggi){
        super(label);
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
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


   public double getTinggi() {
    return tinggi;
   }


   public void setTinggi(double tinggi) {
    this.tinggi = tinggi;
   }

   public double hitungVolume(){
    return panjang * lebar * tinggi;
   }

   public double hitungLuasPermukaan(){
    return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
   }

   public String[][] getKeyValueDetails() {
        String[][] parentDetails = super.getKeyValueDetails();
        String[][] details = new String[parentDetails.length + 4][2];
        System.arraycopy(parentDetails, 0, details, 0, parentDetails.length);
        details[parentDetails.length] = new String[]{"tipe", "Balok"};
        details[parentDetails.length + 1] = new String[]{"panjang", String.valueOf(panjang)};
        details[parentDetails.length + 2] = new String[]{"lebar", String.valueOf(lebar)};
        details[parentDetails.length + 3] = new String[]{"tinggi", String.valueOf(tinggi)};
        return details;
    }
}
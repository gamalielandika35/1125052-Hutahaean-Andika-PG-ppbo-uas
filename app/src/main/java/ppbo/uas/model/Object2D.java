package ppbo.uas.model;

public abstract class Object2D extends GObject {
    public Object2D(String label) {
        super(label);
    }
    public String[][] getKeyValueDetails() {
        return new String[][]{{"label", labelGet()}};
    }

    public abstract double hitungLuas();

    public abstract double hitungKeliling();
}

package ppbo.uas.model;

public abstract class Object3D extends GObject {
    public Object3D(String label) {
        super(label);
    }
    public String[][] getKeyValueDetails() {
        return new String[][]{{"label", labelGet()}};
    }

    public abstract double hitungVolume();

    public abstract double hitungLuasPermukaan();
    
}

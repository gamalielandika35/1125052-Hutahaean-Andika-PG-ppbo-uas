package ppbo.uas.model;

public abstract class GObject implements KeyValueDetailLabel {
    private String label;

    public GObject(String label){
        this.label = label;
    }
    public String getLabel(){
        return this.label;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public String labelGet() {
        return this.label;
    }
    public String[][] getKeyValueDetails() {
        return new String[][]{{"label", labelGet()}};
    }
}
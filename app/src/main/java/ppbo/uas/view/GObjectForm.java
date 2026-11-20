package ppbo.uas.view;
import java.util.List;
import ppbo.uas.model.GObject;

public abstract class GObjectForm<T extends GObject> {
    private List<GObject> storage;

    public GObjectForm(List<GObject> storage) {
        this.storage = storage;
    }

    public T showInsertForm() {
        System.out.println("\n=== TAMBAH " + getClass().getSimpleName().replace("GObjectForm", "").toUpperCase() + " ===");
        String label = CLIUtil.readString("Masukkan label objek: ");
        while (label.isEmpty()) {
            System.out.println("Label tidak boleh kosong.");
            label = CLIUtil.readString("Masukkan label objek: ");
        }

        String[] fields = getFields();
        Double[] boxedValues = new Double[fields.length];
        for (Integer index = 0; index < fields.length; index++) {
            boxedValues[index] = CLIUtil.readPositiveDoubleWithRetry(fields[index]);
        }

        double[] values = new double[boxedValues.length];
        for (Integer index = 0; index < boxedValues.length; index++) {
            values[index] = boxedValues[index];
        }

        T model = constructModelFromValues(label, values);
        storage.add(model);
        System.out.println("Objek berhasil ditambahkan.");
        return model;
    }

    protected abstract String[] getFields();

    protected abstract T constructModelFromValues(String label, double[] values);

    protected abstract double[] extractValuesFromModel(T model);
}


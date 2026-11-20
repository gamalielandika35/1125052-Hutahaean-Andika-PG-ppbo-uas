package  ppbo.uas;
import java.util.ArrayList;
import java.util.List;
import ppbo.uas.model.*;
import ppbo.uas.view.*;

public class App {
    public static void main(String[] args) {
        List<GObject> allObjects = new ArrayList<>();

        GObjectForm<Persegi> persegiForm = new PersegiGObjectForm(allObjects);
        GObjectForm<SegiEmpat> segiEmpatForm = new SegiEmpatGObjectForm(allObjects);
        GObjectForm<Lingkaran> lingkaranForm = new LingkaranGObjectForm(allObjects);
        GObjectForm<Kubus> kubusForm = new KubusGObjectForm(allObjects);
        GObjectForm<Balok> balokForm = new BalokGObjectForm(allObjects);
        GObjectForm<Kerucut> kerucutForm = new KerucutGObjectForm(allObjects);

        Boolean running = true;
        while (running) {
            CLIUtil.printMenu();
            Integer choice = CLIUtil.readInteger("Pilih menu: ");

            switch (choice) {
                case 1:
                    PrintUtil.printGObjectDetail(allObjects);
                    break;
                case 2:
                    persegiForm.showInsertForm();
                    break;
                case 3:
                    segiEmpatForm.showInsertForm();
                    break;
                case 4:
                    lingkaranForm.showInsertForm();
                    break;
                case 5:
                    kubusForm.showInsertForm();
                    break;
                case 6:
                    balokForm.showInsertForm();
                    break;
                case 7:
                    kerucutForm.showInsertForm();
                    break;
                case 0:
                    running = false;
                    System.out.println("Program selesai. Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia. Silakan pilih 0-7.");
            }
        }
    }
}

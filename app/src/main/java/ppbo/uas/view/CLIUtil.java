package ppbo.uas.view;
import ppbo.uas.exception.InputValidationException;
import java.util.Scanner;
public class CLIUtil {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String readString(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextLine().trim();
    }

    public static Integer readInteger(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine().trim();
            try {
                return Integer.valueOf(input);
            } catch (NumberFormatException exception) {
                System.out.println("input taik ");
            }
        }
    }

    public static Double readPositiveDouble(String fieldName) throws InputValidationException {
        System.out.print("Masukkan " + fieldName + ": ");
        String input = SCANNER.nextLine().trim();

        try {
            Double value = Double.valueOf(input);
            if (!Double.isFinite(value) || value <= 0.0) {
                throw new InputValidationException(fieldName + " harus lebih besar dari 0.");
            }
            return value;
        } catch (NumberFormatException exception) {
            throw new InputValidationException(fieldName + " harus berupa angka yang valid.");
        }
    }

    public static Double readPositiveDoubleWithRetry(String fieldName) {
        while (true) {
            try {
                return readPositiveDouble(fieldName);
            } catch (InputValidationException exception) {
                System.out.println("Input tidak valid: " + exception.getMessage());
            }
        }
    }

    public static void printMenu() {
        System.out.println("\n=== PILIH MENU ===");
        System.out.println("1. tampilkan semua");
        System.out.println("2. tambah persegi");
        System.out.println("3. tambah segi empat");
        System.out.println("4. tambah lingkaran");
        System.out.println("5. tambah kubus");
        System.out.println("6. tambah balok");
        System.out.println("7. tambah kerucut");
        System.out.println("0. keluar");
    }
}

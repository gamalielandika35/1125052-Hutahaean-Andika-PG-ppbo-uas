package ppbo.uas.view;
import ppbo.uas.model.KeyValueDetailLabel;
   
public class PrintUtil {
    public static void printKeyValueDetails(KeyValueDetailLabel object) {
        String[][] details = object.getKeyValueDetails();
        for (String[] detail : details) {
            System.out.println(detail[0] + ": " + detail[1]);
        }
    }
}

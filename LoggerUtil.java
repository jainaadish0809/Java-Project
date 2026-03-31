import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LoggerUtil {

    public static void logError(String message) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("error_log.txt", true))) {
            bw.write("ERROR: " + message);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Logging failed!");
        }
    }
}
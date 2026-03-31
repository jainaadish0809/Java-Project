import java.io.*;

public class ContentManager {

    public static void writeToFile(String fileName, String content) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(content);
            bw.newLine();
            System.out.println("Content written successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file!");
            LoggerUtil.logError(e.getMessage());
        }
    }

    public static void readFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file!");
            LoggerUtil.logError(e.getMessage());
        }
    }
}

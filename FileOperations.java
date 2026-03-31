import java.io.File;
import java.io.IOException;

public class FileOperations {

    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("Error creating file!");
            LoggerUtil.logError(e.getMessage());
        }
    }

    public static void deleteFile(String fileName) {
        try {
            File file = new File(fileName);

            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File not found.");
            }

        } catch (Exception e) {
            System.out.println("Error deleting file!");
            LoggerUtil.logError(e.getMessage());
        }
    }

    public static void showDetails(String fileName) {
        try {
            File file = new File(fileName);

            if (file.exists()) {
                System.out.println("Name: " + file.getName());
                System.out.println("Path: " + file.getAbsolutePath());
                System.out.println("Size: " + file.length());
                System.out.println("Readable: " + file.canRead());
                System.out.println("Writable: " + file.canWrite());
                System.out.println("Last Modified: " + file.lastModified());
            } else {
                System.out.println("File not found!");
            }

        } catch (Exception e) {
            LoggerUtil.logError(e.getMessage());
        }
    }
}
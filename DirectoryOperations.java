import java.io.File;

public class DirectoryOperations {

    public static void listFiles(String path) {
        try {
            File folder = new File(path);

            if (!folder.exists()) {
                System.out.println("Directory not found!");
                return;
            }

            File[] files = folder.listFiles();

            if (files != null) {
                for (File f : files) {
                    System.out.println(f.getName());
                }
            }

        } catch (Exception e) {
            System.out.println("Error listing files!");
            LoggerUtil.logError(e.getMessage());
        }
    }

    public static void searchFile(String path, String fileName) {
        try {
            File folder = new File(path);
            File[] files = folder.listFiles();

            if (files != null) {
                for (File f : files) {
                    if (f.getName().equalsIgnoreCase(fileName)) {
                        System.out.println("File found: " + f.getAbsolutePath());
                        return;
                    }
                }
            }

            System.out.println("File not found in directory.");

        } catch (Exception e) {
            System.out.println("Search error!");
            LoggerUtil.logError(e.getMessage());
        }
    }
}
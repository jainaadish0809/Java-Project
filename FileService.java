import java.util.Scanner;

public class FileService {

    Scanner sc = new Scanner(System.in);

    public void start() {

        while (true) {
            System.out.println("\n==== File Management System ====");
            System.out.println("1. Create File");
            System.out.println("2. Delete File");
            System.out.println("3. Show File Details");
            System.out.println("4. Write to File");
            System.out.println("5. Read File");
            System.out.println("6. List Files in Directory");
            System.out.println("7. Search File");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter file name: ");
                    FileOperations.createFile(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter file name: ");
                    FileOperations.deleteFile(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter file name: ");
                    FileOperations.showDetails(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter file name: ");
                    String file = sc.nextLine();
                    System.out.print("Enter content: ");
                    String content = sc.nextLine();
                    ContentManager.writeToFile(file, content);
                    break;

                case 5:
                    System.out.print("Enter file name: ");
                    ContentManager.readFile(sc.nextLine());
                    break;

                case 6:
                    System.out.print("Enter directory path: ");
                    DirectoryOperations.listFiles(sc.nextLine());
                    break;

                case 7:
                    System.out.print("Enter directory path: ");
                    String path = sc.nextLine();
                    System.out.print("Enter file name: ");
                    String name = sc.nextLine();
                    DirectoryOperations.searchFile(path, name);
                    break;

                case 8:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
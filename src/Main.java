import java.util.Scanner;

// Entry point for the Library System
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        boolean active = true;
        Scanner input = new Scanner(System.in);

        while (active) {
            showMenu();
            int option = input.nextInt();
            input.nextLine(); // consume newline
            switch (option) {
                case 1:
                    // Add a physical book
                    System.out.print("Book Name: ");
                    String name = input.nextLine();
                    System.out.print("Writer: ");
                    String writer = input.nextLine();
                    System.out.print("ID: ");
                    int id = input.nextInt();
                    lib.addPhysicalBook(new Book(name, writer, id));
                    break;
                case 2:
                    // Add a digital book
                    System.out.print("Digital Book Name: ");
                    String dName = input.next();
                    System.out.print("Writer: ");
                    String dWriter = input.next();
                    System.out.print("ID: ");
                    int dId = input.nextInt();
                    System.out.print("Size (MB): ");
                    double size = input.nextDouble();
                    lib.addDigitalBook(new EBook(dName, dWriter, dId, size));
                    break;
                case 3:
                    // Borrow a book
                    System.out.print("Enter Book ID to borrow: ");
                    int borrowId = input.nextInt();
                    lib.borrowBook(borrowId);
                    break;
                case 4:
                    // Return a book
                    System.out.print("Enter Book ID to return: ");
                    int returnId = input.nextInt();
                    lib.returnBook(returnId);
                    break;
                case 5:
                    // Exit
                    active = false;
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        input.close();
    }

    // Display menu options
    public static void showMenu() {
        System.out.println("\n--- Library Menu ---");
        System.out.println("1. Add Physical Book");
        System.out.println("2. Add Digital Book");
        System.out.println("3. Borrow Book");
        System.out.println("4. Return Book");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }
}

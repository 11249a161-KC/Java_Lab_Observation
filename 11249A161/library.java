import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bookTitles = new String[10];

        System.out.println("=== Library System: Enter 10 Book Titles ===");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter title for book " + (i + 1) + ": ");
            bookTitles[i] = scanner.nextLine();
        }

        System.out.println("\n=== Books Starting with Letter 'A' ===");
        boolean found = false;
        
        for (String title : bookTitles) {
            if (title != null && !title.trim().isEmpty()) {
                String trimmedTitle = title.trim();

                if (trimmedTitle.startsWith("A") || trimmedTitle.startsWith("a")) {
                    System.out.println("- " + trimmedTitle);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No books found starting with the letter 'A'.");
        }

        scanner.close();
    }
}
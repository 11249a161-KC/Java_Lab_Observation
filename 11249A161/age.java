import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String input = scanner.nextLine();

        try {
            int age = Integer.parseInt(input);

            int centuryRatio = 100 / age;

            System.out.println("Age entered: " + age);
            System.out.println("100 divided by your age is: " + centuryRatio);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format! Please enter digits only (e.g., 25).");

        } catch (ArithmeticException e) {
            System.out.println("Error: Arithmetic error! Age cannot be 0 because division by zero is undefined.");

        } finally {
            scanner.close();
        }
    }
}

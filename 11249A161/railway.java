import java.util.Scanner;

public class railway {
    public static void main(String[] args) {
        String[] trainCodes = {"TRN-101", "TRN-202", "TRN-303", "TRN-404", "TRN-505"};
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Train Slots: 0 to " + (trainCodes.length - 1));
        System.out.print("Enter train index to lookup: ");

        try {
            int index = scanner.nextInt();

            String code = trainCodes[index];
            System.out.println("Train Code at index " + index + ": " + code);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError: Invalid Index!");
            System.out.println("Reason: Tried to access index outside the valid range [0 - " 
                               + (trainCodes.length - 1) + "].");

        } catch (Exception e) {
            System.out.println("\nError: Please enter a valid numerical index.");

        } finally {
            scanner.close();
            System.out.println("\nTrain Lookup Operation Completed.");
        }
    }
}

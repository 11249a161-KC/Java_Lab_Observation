import java.util.Scanner;
public class sumoftwonums {
    public static void main(String[] args) {
        
        int x,y,sum;
        Scanner myObjScanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        x = myObjScanner.nextInt();
        y = myObjScanner.nextInt();
        sum = x + y;
        System.out.println("The Sum of two numbers is: " + sum);

    }

}

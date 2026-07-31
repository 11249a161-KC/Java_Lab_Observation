
import java.util.Scanner;

public class fibronacci {
    public static void main(String[] args) {
        int x,num1 = 0, num2 = 1;
        System.out.println("Enter a number for fibronacci sequence");
        Scanner myObj = new Scanner(System.in);
        x = myObj.nextInt();

        int i = 1;
    
    System.out.println("Fibronacci sequence of " + x + " numbers: ");

            while(i <= x)
        {
            System.out.println(num1+"");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }
    }
}

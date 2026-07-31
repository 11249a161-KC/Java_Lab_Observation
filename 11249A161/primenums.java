import java.util.Scanner;
public class primenums {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter a number: ");
        Scanner myObj = new Scanner(System.in);
        x = myObj.nextInt();
        if( x<=0 )
        {
            System.out.println("Number must be greater than zero");
        }
        else if(isPrime(x))
        {
            System.out.println(x + " is a prime number");
        }
        else
        {
            System.out.println(x + " is not a prime number");
        }
        myObj.close();
    }
    
    public static boolean isPrime(int x)
    {
        if (x <= 1) {
            return false;
        }
        
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false; 
            }
        }
        
        return true; 
    }

}

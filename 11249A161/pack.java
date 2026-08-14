import mypackage.calcpack;

public class pack {
    public static void main(String[] args) {
        calcpack calc = new calcpack();

        int a = 20;
        int b = 6;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
        System.out.println("Remainder: " + calc.remainder(a, b));
    }
}

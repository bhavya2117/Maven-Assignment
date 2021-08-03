import java.util.Scanner;

public final class Application {
    private Application() {
    }

    /**
     * @param args Main Calculator class
     */
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("DM_DEFAULT_ENCODING")
    public static void main(final String[] args) {
        System.out.println("This is a basic Calculator");
        Calculator cal = new Calculator();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        cal.addition(num1, num2);
        cal.subtraction(num1, num2);
        cal.multiplication(num1, num2);
        cal.division(num1, num2);

    }
}

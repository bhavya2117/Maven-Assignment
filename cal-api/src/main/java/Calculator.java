public class Calculator {
    /**
     * @param integer1 First integer
     * @param integer2 Second integer
     */
    public void addition(final int integer1, final int integer2) {
        int integer3 = integer1 + integer2;
        System.out.println("Addition is " + integer3);
    }

    /**
     * @param integer1 First integer
     * @param integer2 Second integer
     */
    public void subtraction(final int integer1, final int integer2) {
        int integer3 = integer1 - integer2;
        System.out.println("Subtraction is " + integer3);
    }

    /**
     * @param integer1 First integer
     * @param integer2 Second integer
     */
    public void multiplication(final int integer1, final int integer2) {
        int integer3 = integer1 * integer2;
        System.out.println("Multiplication is " + integer3);
    }

    /**
     * @param integer1 First integer
     * @param integer2 Second integer
     */
    public void division(final int integer1, final int integer2) {
        int integer3 = integer1 / integer2;
        System.out.println("Division is " + integer3);
    }
}

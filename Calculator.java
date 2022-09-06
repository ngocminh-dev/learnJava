public class Calculator {

    public int add(int operand1, int operand2) {
        /* your code here */
        int result = operand1 + operand2;
        return result;
    }

    public int subtract(int operand1, int operand2) {
        /* your code here */
        int result = operand1 - operand2;
        return result;
    }

    public int multiple(int operand1, int operand2) {
        /* your code here */
        int result = operand1 * operand2;
        return result;
    }

    public float divide(int operand1, int operand2) {
        /* your code here */
        if (operand2 == 0)
            return Float.MAX_VALUE;
        float result = operand1 / operand2;
        return result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int addResult = calculator.add(4, 8);
        System.out.println("Add result: " + addResult);

        int subtractResult = calculator.subtract(12, 3);
        System.out.println("Subtract result: " + subtractResult);

        int multipleResult = calculator.multiple(5, 6);
        System.out.println("Multiple result: " + multipleResult);

        float divideResult = calculator.divide(16, 5);
        System.out.println("Divide result: " + divideResult);
    }
}
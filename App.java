import java.util.Scanner;

public class App {
    static int add(int operand1, int operand2) {
        /* your code here */
        int result = operand1 + operand2;
        return result;
    }

    static int subtract(int operand1, int operand2) {
        /* your code here */
        int result = operand1 - operand2;
        return result;
    }

    static int multiple(int operand1, int operand2) {
        /* your code here */
        int result = operand1 * operand2;
        return result;
    }

    static float divide(int operand1, int operand2) {
        /* your code here */
        if (operand2 == 0)
            return Float.MAX_VALUE;
        float result = operand1 / operand2;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Calculator App ^^");
        System.out.println("Choose your options:");
        System.out.println("0: EXIT");
        System.out.println("1: ADD");
        System.out.println("2: SUBTRACT");
        System.out.println("3: MULTIPLE");
        System.out.println("4: DEVIDE");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int next = scanner.nextInt();
            if (next == 0)
                break;
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            switch (next) {
                case 1:
                    System.out.println(add(a, b));
                    break;
                case 2:
                    System.out.println(subtract(a, b));
                    break;
                case 3:
                    System.out.println(multiple(a, b));
                    break;
                case 4:
                    System.out.println(divide(a, b));
                    break;
                default:
                    System.out.println("Don't support this operator!");
                    break;
            }
        }
        scanner.close();
    }
}
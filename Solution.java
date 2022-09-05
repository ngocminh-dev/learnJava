// Import your library
// Do not change the name of the Solution class
import java.util.Scanner;
public class Solution {
    // Type your main code here
    static void printHello() {
        System.out.println("HelloWorld");
        System.out.print("Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello "+name);
        scanner.close();
    }
    public static void main(String[] args) {
        printHello();
    }
}
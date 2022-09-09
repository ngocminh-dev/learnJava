import java.util.Scanner;

public class test {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String s =scanner.nextLine();
      if(s.equals("y")|| s.equals("Y")){
         System.out.println("ok");
      } else System.out.println("wrong");
      scanner.close();
   }
}

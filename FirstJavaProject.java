import java.util.Scanner;

public class FirstJavaProject {
    public static void main(String[] args) {
    
        String ten;
        int tuoi;
        double chieuCao,canNang;
    
        System.out.println("Hi");
        System.out.println("Mời bạn nhập tên: ");
        Scanner scanner = new Scanner(System.in);
        ten = scanner.nextLine();
        System.out.println("Mời bạn nhập tuổi: ");
        tuoi = scanner.nextInt();
        System.out.println("Mời bạn nhập chiều cao (cm): ");
        chieuCao = scanner.nextDouble();
        System.out.println("Mời bạn nhập cân nặng (kg): ");
        canNang = scanner.nextDouble();
        System.out.println("Thông tin của bạn là: ");
        System.out.println(ten + "\n" + tuoi+ "\n" +chieuCao+ "\n" +canNang );
        scanner.close();
   }
}

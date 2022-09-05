import java.util.Scanner;

class hanghoa {
    String maHang, tenHang, ngaySX, hanSD;
    int gia;

    public String getMa() {
        return maHang;
    }

    public String getTen() {
        return tenHang;
    }

    public String getNgaySX() {
        return ngaySX;
    }

    public String getHanSD() {
        return hanSD;
    }

    public int getGia() {
        return gia;
    }

    public hanghoa(String maHang, String tenHang, String ngaySX, String hanSD, int gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.ngaySX = ngaySX;
        this.hanSD = hanSD;
        this.gia = gia;
    }

    public void xuatHangHoa() {
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
        System.out.println("Ngày sản xuất: " + ngaySX);
        System.out.println("Hạn sử dụng: " + hanSD);
        System.out.println("Giá: " + gia);
    }
}

public class quanlicuahang {
    public static void main(String[] args) {
        int chon = 0;
        int j = 0;
        String mahang, tenhang, ngaysx, hansd;
        int gia;
        hanghoa hh[] = new hanghoa[1000];
        Scanner scanner = new Scanner(System.in);
        System.out.println("|--------------------------------------------------------------------|");
        System.out.println("|                          MENU CHƯƠNG TRÌNH                         |");
        System.out.println("| 1.Nhập thông tin hàng hoá                                          |");
        System.out.println("| 2.Xuất thông tin hàng hoá                                          |");
        System.out.println("| 3.Xuất hàng hoá có ngày hết hạn là 27/07/2021                      |");
        System.out.println("| 4.Đếm số lượng hàng hoá có số tiền lớn hơn nhập từ bàn phím        |");
        System.out.println("| 5.Sắp xếp hàng hoá tăng dần theo giá tiền                          |");
        System.out.println("| 6.KẾT THÚC CHƯƠNG TRÌNH                                            |");
        System.out.println("|--------------------------------------------------------------------|");
        while (chon != 6) {
            System.out.print("=> MỜI BẠN CHỌN CHỨC NĂNG SỐ:  ");
            chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    System.out.print("Nhập số lượng hàng hoá bạn muốn thêm:  ");
                    int n = scanner.nextInt();
                    int j1 = j;
                    j += n;
                    for (; j1 < j; j1++) {
                        System.out.println(j1 + 1 + ".");
                        System.out.print("Nhập mã hàng: ");
                        mahang = scanner.next();
                        System.out.print("Nhập tên hàng: ");
                        tenhang = scanner.next();
                        System.out.print("Giá: ");
                        gia = scanner.nextInt();
                        System.out.print("Ngày sản xuất: ");
                        ngaysx = scanner.next();
                        System.out.print("Hạn sử dụng: ");
                        hansd = scanner.next();
                        hh[j1] = new hanghoa(mahang, tenhang, ngaysx, hansd, gia);
                    }
                    break;

                case 2:
                    for (int i = 0; i < j; i++) {
                        System.out.print(i + 1 + ". ");
                        hh[i].xuatHangHoa();
                    }
                    break;
                case 3:
                    for (int i = 0; i < j; i++) {
                        if (hh[i].hanSD.equals("27/07/2021")) {
                            hh[i].xuatHangHoa();
                        }
                    }

                    break;
                case 4:
                    System.out.println("Nhập giá tiền muốn lọc: ");
                    int demsl = 0;
                    int giatien = scanner.nextInt();
                    for (int i = 0; i < j; i++) {
                        if (hh[i].gia > giatien) {
                            demsl++;
                        }
                    }
                    System.out.println("Số lượng hàng hoá có số tiền lớn hơn " + giatien + " là: " + demsl);

                    break;
                case 5:

                    break;

            }

        }
        scanner.close();

    }
}

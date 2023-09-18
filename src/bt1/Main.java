package bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Bước 1: Nhập giá trị đầu và cuối của khoảng từ người dùng
        System.out.print("Nhập giá trị đầu của khoảng: ");
        int dau = input.nextInt();
        System.out.print("Nhập giá trị cuối của khoảng: ");
        int cuoi = input.nextInt();
        // Khởi tạo biến tổng
        int total = 0;
        // Bước 2: Sử dụng vòng lặp for để tìm và tính tổng các số chẵn trong khoảng
        for (int number = dau; number <= cuoi; number++) {
            if (number % 2 == 0) {
                total += number;
            }
        }
        // Bước 3: Hiển thị tổng
        System.out.println("Tổng các số chẵn trong khoảng từ " + start + " đến " + end + " là: " + total);
    }
}

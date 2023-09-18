package bt5;

public class TimSoNhoNhatChiaHetCho357 {
    public static void main(String[] args) {
        int N = 1; // Giá trị bắt đầu kiểm tra

        while (true) {
            if (isDivisibleBy357(N)) {
                System.out.println("Số nguyên dương nhỏ nhất chia hết cho 5, 7, và 11 là: " + N);
                break;
            }
            N++;
        }
    }

    // Hàm kiểm tra xem một số có chia hết cho 5, 7 và 11 hay không
    public static boolean isDivisibleBy357(int n) {
        return (n % 5 == 0) && (n % 7 == 0) && (n % 11 == 0);
    }
}

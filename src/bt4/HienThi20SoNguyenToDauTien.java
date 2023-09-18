package bt4;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int numbers = 20; // Số lượng số nguyên tố cần hiển thị
        int count = 0;   // Biến đếm số lượng số nguyên tố đã hiển thị
        int N = 2;       // Giá trị đang kiểm tra

        System.out.println("Các " + numbers + " số nguyên tố đầu tiên là:");

        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }

    // Hàm kiểm tra xem một số có phải là số nguyên tố hay không
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

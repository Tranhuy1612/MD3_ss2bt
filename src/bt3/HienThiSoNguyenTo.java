package bt3;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        for (int number = 2; number < 100; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
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

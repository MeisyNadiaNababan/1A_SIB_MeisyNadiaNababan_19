import java.util.Scanner;

public class Fibonacci {

    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bulan ke-: ");
        int bulan = sc.nextInt();

        int jumlahMarmut = fibonacci(bulan);

        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + " adalah " + jumlahMarmut);
    }
}
import java.util.Scanner;

public class PenjumlahanRekursif {

    static int penjumlahanRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int hasilPenjumlahan = penjumlahanRekursif(n);

        System.out.println("Penjumlahan dari 1 sampai " + n + " = " + hasilPenjumlahan);
        System.out.print("1");
        for(int i = 2; i <= n; i++) {
            System.out.print(" + " + i);
        }
        System.out.println(" = " + hasilPenjumlahan);
        sc.close();
    }
}
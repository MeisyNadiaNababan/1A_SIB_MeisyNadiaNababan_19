import java.util.Scanner;
public class Tugas318{
    public static void main(String[] args){
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner sc = new Scanner(System.in);
        // Meminta pengguna untuk memasukkan nilai N
        System.out.print("Masukkan nilai N= ");
        // Membaca nilai N yang dimasukkan pengguna
        int N = sc.nextInt();

        // Loop luar berjalan dari 1 hingga N (inklusif)
        for (int i = 1; i <= N; i++) {
            // Loop dalam berjalan dari 1 hingga N (inklusif)
            for (int j = 1; j <= N; j++) {
                // Jika i atau j sama dengan 1 atau N, cetak N
                if (i == 1 || i == N || j == 1 || j == N) {
                    // Mencetak N
                    System.out.print(N + " ");
                } else {
                    // Jika tidak, cetak spasi
                    System.out.print("  ");
                }
            }
            // Mencetak baris baru setelah setiap baris selesai
            System.out.println();
        }
    }
}
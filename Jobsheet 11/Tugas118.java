import java.util.Scanner;
public class Tugas118 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner sc =  new Scanner (System.in);
        // Meminta pengguna untuk memasukkan nilai N
        System.out.print("Masukkan nilai N= " );
        // Membaca nilai N yang dimasukkan pengguna
        int N = sc.nextInt();
        
        // Loop luar berjalan dari 0 hingga N 
        for (int i = 0; i <= N; i++) {
            // Loop dalam pertama mencetak spasi sebanyak N-i kali
            for (int j = N; j >= i; j--) {
                // Cetak spasi
                System.out.print(" "); 
            }
            // Loop dalam kedua mencetak angka dari 1 hingga i
            for (int j = 1; j <= i; j++){
                System.out.print(j); // Cetak nilai j
            }
            // Mencetak baris baru setelah setiap baris selesai
            System.out.println();
        }
    }
}
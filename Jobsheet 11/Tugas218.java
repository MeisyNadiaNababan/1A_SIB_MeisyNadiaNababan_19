import java.util.Scanner;
public class Tugas218{
    public static void main (String[] args){
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner sc = new Scanner(System.in);
        // Meminta pengguna untuk memasukkan nilai N
        System.out.print("Masukkan nilai N= ");
        // Membaca nilai N yang dimasukkan pengguna
        int n = sc.nextInt();

        // Loop luar berjalan dari N hingga 1
        for (int i = n; i >= 1; i--){
            // Loop dalam mencetak '*' sebanyak i kali
            for (int j = 1; j <= i; j++){
                // Mencetak tanda bintang diikuti dengan spasi
                System.out.print("* ");
            }
            // Mencetak baris baru setelah setiap baris selesai
            System.out.println();
        }
    }
}
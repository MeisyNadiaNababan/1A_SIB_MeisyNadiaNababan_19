import java.util.Scanner;

public class HitungNilaiArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen: ");
        int banyakElemen = input.nextInt();
        int[] nilai = new int[banyakElemen];

        for (int i = 0; i < banyakElemen; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        int nilaiTertinggi = nilai[0];
        for (int i = 1; i < banyakElemen; i++) {
            if (nilai[i] > nilaiTertinggi) {
                nilaiTertinggi = nilai[i];
            }
        }
        int nilaiTerendah = nilai[0];
        for (int i = 1; i < banyakElemen; i++) {
            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }
        }
        int totalNilai = 0;
        for (int i = 0; i < banyakElemen; i++) {
            totalNilai += nilai[i];
        }
        double nilaiRataRata = totalNilai / banyakElemen;

        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Nilai rata-rata: " + nilaiRataRata);
    }
}
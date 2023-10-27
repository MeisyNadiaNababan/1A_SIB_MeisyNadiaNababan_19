import java.util.Scanner;

public class HitungNilaiArray {

    public static void main(String[] args) {
        int[] data = new int[5];
        int i, max, min, sum;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya elemen: ");
        int n = input.nextInt();

        for (i = 0; i < n; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        max = data[0];
        for (i = 1; i < n; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }

        min = data[0];
        for (i = 1; i < n; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }

        sum = 0;
        for (i = 0; i < n; i++) {
            sum += data[i];
        }
        double avg = sum / n;

        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Rata-rata: " + avg);
    }
}

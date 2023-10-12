import java.util.Scanner;

public class PerulanganGajiGuru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jabatan;
        int golongan;
        double gajiPokok, pajak;

        System.out.print("Masukkan jabatan (PNS atau honorer): ");
        jabatan = input.nextLine();
        System.out.print("Masukkan golongan (1-4): ");
        golongan = input.nextInt();

        if (jabatan.equals("PNS")) {
            if (golongan == 1) {
                gajiPokok = 3000000;
                pajak = 0;
            } else if (golongan == 2) {
                gajiPokok = 5000000;
                pajak = 0;
            } else if (golongan == 4) {
                gajiPokok = 10000000;
                pajak = 150000;
            } else {
                System.out.println("Golongan tidak valid.");
                return;
            }
        } else if (jabatan.equals("honorer")) {
            if (golongan == 1) {
                gajiPokok = 1936000;
                pajak = 50000;
            } else if (golongan == 2) {
                gajiPokok = 2376000;
                pajak = 50000;
            } else {
                System.out.println("Golongan tidak valid.");
                return;
            }
        } else {
            System.out.println("Jabatan tidak valid.");
            return;
        }

        int jamMengajar;
        System.out.print("Masukkan jumlah jam mengajar: ");
        jamMengajar = input.nextInt();
        
        double gajiJamMengajar = (gajiPokok - pajak) / 40;
        
        for (int i = jamMengajar; i > 0; i--) {
            double gajiTotal = gajiJamMengajar * i;
            System.out.println("Gaji Total untuk " + i + " jam mengajar: " + gajiTotal);
        }
        
        input.close();
    }
}

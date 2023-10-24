public class ArrayPenggajianGuru {

    public static void main(String[] args) {
        // Deklarasi variabel
        int jumlah_guru;
        String[] nama;
        String[] NIP;
        String[] golongan;
        int[] gaji;
        int[] pajak;

        // Input jumlah guru
        jumlah_guru = Integer.parseInt(input("Masukkan jumlah guru: "));

        // Inisialisasi array
        nama = new String[jumlah_guru];
        NIP = new String[jumlah_guru];
        golongan = new String[jumlah_guru];
        gaji = new int[jumlah_guru];
        pajak = new int[jumlah_guru];

        // Input data guru
        for (int i = 0; i < jumlah_guru; i++) {
            nama[i] = input("Masukkan nama guru ke-{}: ".format(i + 1));
            NIP[i] = input("Masukkan NIP guru ke-{}: ".format(i + 1));
            golongan[i] = input("Masukkan golongan guru ke-{}: ".format(i + 1));
        }

        // Hitung gaji guru
        for (int i = 0; i < jumlah_guru; i++) {
            gaji[i] = hitungGaji(golongan[i]);
        }

        // Hitung pajak guru
        for (int i = 0; i < jumlah_guru; i++) {
            pajak[i] = hitungPajak(gaji[i]);
        }

        // Tampilkan data gaji guru
        for (int i = 0; i < jumlah_guru; i++) {
            System.out.println("Nama: {} | NIP: {} | Golongan: {} | Gaji: Rp. {} | Pajak: Rp. {}".format(nama[i], NIP[i], golongan[i], gaji[i], pajak[i]));
        }
    }

    private static int hitungGaji(String golongan) {
        if (golongan.equals("A")) {
            return 5000000;
        } else if (golongan.equals("B")) {
            return 4000000;
        } else if (golongan.equals("C")) {
            return 3000000;
        } else {
            return 0;
        }
    }

    private static int hitungPajak(int gaji) {
        // Hitung pajak berdasarkan golongan
        if (golongan.equals("A")) {
            return 1000000;
        } else if (golongan.equals("B")) {
            return 750000;
        } else if (golongan.equals("C")) {
            return 500000;
        } else {
            return 0;
        }
    }

    private static String input(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
Java
private static int hitungPajak(int gaji) {
    // Hitung pajak berdasarkan golongan
    if (golongan.equals("A")) {
        return 1000000;
    } else if (golongan.equals("B")) {
        return 750000;
    } else if (golongan.equals("C")) {
        return 500000;
    } else {
        return 0;
    }
}
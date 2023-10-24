public class ArrayGaji {

    public static void main(String[] args) {
        // Deklarasi variabel
        int jumlah_guru;
        String[] nama;
        String[] NIP;
        String[] golongan;
        int[] gaji;
        int[] pajak;
        String[] jenis_karyawan;

        // Input jumlah guru
        jumlah_guru = Integer.parseInt(input("Masukkan jumlah guru: "));

        // Inisialisasi array
        nama = new String[jumlah_guru];
        NIP = new String[jumlah_guru];
        golongan = new String[jumlah_guru];
        gaji = new int[jumlah_guru];
        pajak = new int[jumlah_guru];
        jenis_karyawan = new String[jumlah_guru];

        // Input data guru
        for (int i = 0; i < jumlah_guru; i++) {
            System.out.println("Data guru ke-{}".format(i + 1));

            // Input jenis karyawan
            jenis_karyawan[i] = input("Masukkan jenis karyawan (PNS/Honorer): ");

            // Input data PNS
            if (jenis_karyawan[i].equals("PNS")) {
                nama[i] = input("Masukkan nama guru: ");
                NIP[i] = input("Masukkan NIP guru: ");
                golongan[i] = input("Masukkan golongan guru: ");
                gaji[i] = hitungGajiPns(golongan[i]);
                pajak[i] = hitungPajakPns(golongan[i]);
            }

            // Input data honorer
            else if (jenis_karyawan[i].equals("Honorer")) {
                nama[i] = input("Masukkan nama guru: ");
                NIP[i] = input("Masukkan NIP guru: ");
                golongan[i] = input("Masukkan golongan guru: ");
                gaji[i] = hitungGajiHonorer(golongan[i]);
                pajak[i] = hitungPajakHonorer(golongan[i]);
            }
        }

        // Tampilkan data gaji guru
        for (int i = 0; i < jumlah_guru; i++) {
            System.out.println("Nama: {} | NIP: {} | Jenis Karyawan: {} | Golongan: {} | Gaji: Rp. {} | Pajak: Rp. {}".format(nama[i], NIP[i], jenis_karyawan[i], golongan[i], gaji[i], pajak[i]));
        }
    }

    private static int hitungGajiPns(String golongan) {
        if (golongan.equals("1")) {
            return 4000000;
        } else if (golongan.equals("2")) {
            return 4000000;
        } else {
            return 0;
        }
    }

    private static int hitungPajakPns(String golongan) {
        if (golongan.equals("1")) {
            return 4000000 * 0.15;
        } else if (golongan.equals("2")) {
            return 4000000 * 0.5;
        } else {
            return 0;
        }
    }

    private static int hitungGajiHonorer(String golongan) {
        if (golongan.equals("1")) {
            return 1000000;
        } else if (golongan.equals("2")) {
            return 2500000;
        } else {
            return 0;
        }
    }

    private static int hitungPajakHonorer(String golongan) {
        if (golongan.equals("1")) {
            return 1000000 * 0.2;
        } else if (golongan.equals("2")) {
            return 2500000 * 0.15;
        } else {
            return 0;
        }
    }

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ProyekGaji {
    static void beriSalam() {
        System.out.println("Selamat Datang Di Sistem Penggajian Guru");
        System.out.println("                                        ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] namaGuru = { "Devin", "Meisy", "Rahmalia", "Belqis", "Aqila" };
        int[] nipGuru = { 20040417, 20040607, 20040416, 20040415, 20040414 };
        String[] jabatanGuru = new String[5];
        int[] golonganGuru = new int[5];
        int[] gajiPokokGuru = new int[5];
        double[] pajakGuru = new double[5];
        int[] jumlahTidakMasukGuru = new int[5];
        double[] gajiBersihGuru = new double[5]; // New array for gaji bersih

        System.out.print("Masukkan sebagai siapa : ");
        String answer = sc.nextLine();

        System.out.println("-----------------MENU-----------------");
        System.out.println("1. Cek Gaji Guru");
        System.out.println("2. Cek Data Guru");
        System.out.println("3. Cek Kehadiran Guru");
        System.out.println("4. Cetak Slip Gaji");
        System.out.println("5. Exit");
        System.out.println("--------------------------------------");
        System.out.print("Pilihan menu 1/2/3/4/5: ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    System.out.println("Guru ke-" + (i + 1) + " - " + namaGuru[i]);
                    System.out.print("Masukkan NIP Guru: ");
                    nipGuru[i] = sc.nextInt();
                    sc.nextLine();
        
                    System.out.print("Jabatan (PNS/HONORER): ");
                    jabatanGuru[i] = sc.nextLine();
                    System.out.print("Golongan (1/2): ");
                    golonganGuru[i] = sc.nextInt();
                    System.out.print("Gaji pokok: ");
                    gajiPokokGuru[i] = sc.nextInt();
        
                    // Calculate pajak based on jabatan and golongan
                    if (jabatanGuru[i].equalsIgnoreCase("PNS")) {
                        if (golonganGuru[i] == 1) {
                            pajakGuru[i] = 0.05;
                            System.out.println("Pajak (Golongan 1): " + (pajakGuru[i] * 100) + "%");
                        } else if (golonganGuru[i] == 2) {
                            pajakGuru[i] = 0.015;
                            System.out.println("Pajak (Golongan 2): " + (pajakGuru[i] * 100) + "%");
                        } else {
                            System.out.println("Golongan PNS yang anda masukkan salah.");
                            break;
                        }
                    } else if (jabatanGuru[i].equalsIgnoreCase("HONORER")) {
                        if (golonganGuru[i] == 1) {
                            pajakGuru[i] = 0.02;
                            System.out.println("Pajak (Golongan 1): " + (pajakGuru[i] * 100) + "%");
                        } else if (golonganGuru[i] == 2) {
                            pajakGuru[i] = 0.015;
                            System.out.println("Pajak (Golongan 2): " + (pajakGuru[i] * 100) + "%");
                        } else {
                            System.out.println("Golongan honorer yang anda masukkan salah.");
                            break;
                        }
                    } else {
                        System.out.println("Jabatan yang anda masukkan salah");
                        break;
                    }
        
                    System.out.print("Masukkan jumlah tidak hadir: ");
                    jumlahTidakMasukGuru[i] = sc.nextInt();
                    double potonganGaji = jumlahTidakMasukGuru[i] * 14400.0;
        
                    // Calculate gaji bersih
                    double gajiBersih = gajiPokokGuru[i] - (gajiPokokGuru[i] * pajakGuru[i]) - potonganGaji;
                    gajiBersihGuru[i] = gajiBersih;
        
                    System.out.println("Total potongan tidak hadir: " + potonganGaji);
                    System.out.println("Total gaji bersih: " + gajiBersih);
                    System.out.println();
                }
        
                System.out.println("---------- SLIP GAJI GURU ----------");
                for (int i = 0; i < 5; i++) {
                    System.out.println("Guru: " + namaGuru[i]);
                    System.out.println("NIP: " + nipGuru[i]);
                    System.out.println("Jabatan: " + jabatanGuru[i]);
                    System.out.println("Golongan: " + golonganGuru[i]);
                    System.out.println("Gaji Pokok: " + gajiPokokGuru[i]);
                    System.out.println("Pajak: " + (pajakGuru[i] * 100) + "%");
                    System.out.println("Potongan Tidak Hadir: " + jumlahTidakMasukGuru[i] * 14400.0);
                    System.out.println("Gaji Bersih: " + gajiBersihGuru[i]);
                }
                break;
            case 2:
                // Code for handling cek data guru
                List<String> namaTeacher = new ArrayList<>(); // Jobsheet 9
                namaTeacher.add("Devin");
                namaTeacher.add("Meisy");
                namaTeacher.add("Rahmalia");
                namaTeacher.add("Belqis");
                namaTeacher.add("Aqila");
                List<String> mataPelajaran = new ArrayList<>();
                mataPelajaran.add("Bahasa Inggris");
                mataPelajaran.add("Akuntansi");
                mataPelajaran.add("Seni Budaya");
                mataPelajaran.add("Matematika");
                mataPelajaran.add("Bahasa Indonesia");
                List<Integer> kodeGuru = new ArrayList<>();
                kodeGuru.add(20040417);
                kodeGuru.add(20040607);
                kodeGuru.add(20050528);
                kodeGuru.add(20040415);
                kodeGuru.add(20040414);
                for (int j = 0; j < namaTeacher.size(); j++) {
                    System.out.println(
                            "nama guru: " + namaTeacher.get(j) + ", mata pelajaran: " + mataPelajaran.get(j) + ", kode guru: " + kodeGuru.get(j));
                }
                break;
            case 3:
                // Code for handling kehadiran
                
                break;
            case 4:
                // Code for handling slip gaji
                for (int k = 0; k < 5; k++) {
                    System.out.println("Guru ke-" + (k + 1) + " - " + namaGuru[k]);
                    System.out.print("Masukkan NIP Guru: ");
                    nipGuru[k] = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Jabatan (PNS/HONORER): ");
                    jabatanGuru[k] = sc.nextLine();
                    System.out.print("Golongan (1/2): ");
                    golonganGuru[k] = sc.nextInt();
                    System.out.print("Gaji pokok: ");
                    gajiPokokGuru[k] = sc.nextInt();

                    // Calculate pajak based on jabatan and golongan
                    if (jabatanGuru[k].equalsIgnoreCase("PNS")) {
                        if (golonganGuru[k] == 1) {
                            pajakGuru[k] = 0.05;
                            System.out.println("Pajak (Golongan 1): " + (pajakGuru[k] * 100) + "%");
                        } else if (golonganGuru[k] == 2) {
                            pajakGuru[k] = 0.015;
                            System.out.println("Pajak (Golongan 2): " + (pajakGuru[k] * 100) + "%");
                        } else {
                            System.out.println("Golongan PNS yang anda masukkan salah.");
                            break;
                        }
                    } else if (jabatanGuru[k].equalsIgnoreCase("HONORER")) {
                        if (golonganGuru[k] == 1) {
                            pajakGuru[k] = 0.02;
                            System.out.println("Pajak (Golongan 1): " + (pajakGuru[k] * 100) + "%");
                        } else if (golonganGuru[k] == 2) {
                            pajakGuru[k] = 0.015;
                            System.out.println("Pajak (Golongan 2): " + (pajakGuru[k] * 100) + "%");
                        } else {
                            System.out.println("Golongan honorer yang anda masukkan salah.");
                            break;
                        }
                    } else {
                        System.out.println("Jabatan yang anda masukkan salah");
                        break;
                    }

                    System.out.print("Masukkan jumlah tidak hadir: ");
                    jumlahTidakMasukGuru[k] = sc.nextInt();
                    double potGaji = jumlahTidakMasukGuru[k] * 14400.0;

                    // Calculate gaji bersih
                    double gajiClean = gajiPokokGuru[k] - (gajiPokokGuru[k] * pajakGuru[k]) - potonganGaji;
                    gajiBersihGuru[k] = gajiBersih;

                    System.out.println("Total potongan tidak hadir: " + potonganGaji);
                    System.out.println("Total gaji bersih: " + gajiBersih);
                    System.out.println();
                }

                System.out.println("---------- SLIP GAJI GURU ----------");
                for (int p = 0; p < 5; p++) {
                    System.out.println("Guru: " + namaGuru[p]);
                    System.out.println("NIP: " + nipGuru[p]);
                    System.out.println("Jabatan: " + jabatanGuru[p]);
                    System.out.println("Golongan: " + golonganGuru[p]);
                    System.out.println("Gaji Pokok: " + gajiPokokGuru[p]);
                    System.out.println("Pajak: " + (pajakGuru[p] * 100) + "%");
                    System.out.println("Potongan Tidak Hadir: " + jumlahTidakMasukGuru[p] * 14400.0);
                    System.out.println("Gaji Bersih: " + gajiBersihGuru[p]);
                }
                break;
            case 5:
                // Exit the program
                System.out.println("Terima kasih telah menggunakan layanan ini.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}

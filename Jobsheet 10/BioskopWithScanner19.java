import java.util.Scanner;

public class BioskopWithScanner19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    
                    do {
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                        
                        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                            System.out.println("Nomor baris atau kolom tidak tersedia. Silakan coba lagi.");
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi tersebut sudah tidak tersedia lagi. Silakan pilih kursi lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil diinput.");
                            break;
                        }
                    } while (true);
                    break;
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] != null) {
                                System.out.println("Penonton di baris " + (i + 1) + ", kolom " + (j + 1) + ": " + penonton[i][j]);
                            } else {
                                System.out.println("Kursi di baris " + (i + 1) + ", kolom " + (j + 1) + ": ***");
                        }
                    }
                }
                break;
            
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silakan coba lagi.");
            }
        }
    }
}


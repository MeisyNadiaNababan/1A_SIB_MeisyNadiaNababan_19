import java.util.Scanner;

public class HargaBayar19{
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);

        int harga, jumlah;
        double dis
        , total,bayar, jmlDis, jmlHal;
        String merkBuku;

        System.out.println("Maukkan merk buku ");
        merkBuku=input.nextLine();
        System.out.println("Masukkan jumlah halaman buku ");
        jmlHal=input.nextDouble();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan besaran diskon ");
        dis=input.nextDouble();
        System.out.println("Masukkan jumlah jumlah barang yang dibeli ");
        jumlah=input.nextInt();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);

    }
}
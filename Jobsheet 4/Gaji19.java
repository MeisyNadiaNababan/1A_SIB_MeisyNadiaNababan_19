import java.util.Scanner;

public class Gaji19{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int jmlMasuk, jmlTdkMasuk, TotGaji, gaji, potGaji;
    
    System.out.println("Masukkan Gaji Anda ");
    gaji= input.nextInt();
    System.out.println("Masukkan Potongan Gaji Anda ");
    potGaji= input.nextInt();
    System.out.println("Masukkan jumlah hari masuk kerja anda ");
    jmlMasuk=input.nextInt();
    System.out.println("Masukkan jumlah hari tidak masuk kerja anda ");
    jmlTdkMasuk=input.nextInt();

    TotGaji=(jmlMasuk*potGaji)-(jmlTdkMasuk*potGaji);
    System.out.println("Gaji yang anda terima adalah" +TotGaji);
    }
}
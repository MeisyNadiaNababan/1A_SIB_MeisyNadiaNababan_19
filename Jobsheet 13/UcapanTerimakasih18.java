import java.util.Scanner;
public class UcapanTerimakasih18 {
    
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih18(){
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" 
        + "You inspired in me a love for learning and made me feel like I could ask you anything.");
        //fungsi ucapanTambahan  dengan parameter
        UcapanTambahan(nama, "Grateful to meet you");
    }
    //fungsi UcapanTambahan dengan parameter tipe String
    public static void UcapanTambahan(String nama, String ucapan) {
        System.out.println("pesan lain untukmu " + nama + ": " +ucapan );
    }
    public static void main(String[] args) {
        UcapanTerimaKasih18();
    }
}
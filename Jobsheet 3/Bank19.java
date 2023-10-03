import java.util.scanner;

    public class Bank19{
        public static void main(String [] args){

           Scanner input =new Scanner(System.in);

           int jml_tabungan_awal, lama_menabung;
           double prosentase_bunga =0.02, bunga, jml_tabungan_akir;

           System.out.println("masukkan jumlah tabungan awal anda");
           jml_tabungan_awal = input.nextInt();
           System.out.println ("masukkan jam lama menabung anda");
           lama_menabung= input.nextInt();

           bunga= lama_menabung*prosentase_bunga*jml_tabungan_awal;
           jml_tabungan_akir=bunga+jml_tabungan_awal;

           System.out.println("Bunga adalah " +bunga);
           System.out.println("Jumlah tabungan akhir anda adalah " +jml_tabungan_akir);
         }
    }
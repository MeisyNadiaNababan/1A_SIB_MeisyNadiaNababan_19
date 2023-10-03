import java.util.Scanner;
public class Lingkaran19{

    public static void main (String [] args){

        Scanner input =new Scanner(System.in);
        int r;
        double keliling, luas;

        System.out.println("Masukkan jari-jari lingkarang: ");
        r=input.nextInt();

        keliling= 2*3.14*r;
        luas=3.14*r*r;
        
        System.out.println(keliling);
        System.out.println(luas);
    }
}
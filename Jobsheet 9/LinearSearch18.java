import java.util.Scanner;

public class LinearSearch18{
    public static void main(String[] args){
        System.out.print("Masukkan jumlah elemen array: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int[] arrayInt = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Masukkan elemen array ke-" +(i)+" : ");
            arrayInt[i]= sc.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari: ");
        int key= sc.nextInt();

        int hasil= -1;
        for (int i = 0; i < n; i++){
            if (arrayInt[i] == key){
                hasil = i;
                break;
            }
        }
        System.out.println("Key ada dalam array pada posisi indeks ke-"+hasil);
    }
}
public class ContohVarargs18{

    // Fungsi dengan varargs tipe data string
    public static void fungsiVarargsString(String... kata) {
        for (String teks : kata ){
            System.out.println(teks +" ");
        }
        System.out.println();
    }

    // Fungsi dengan varargs tipe data integer
    public static void fungsiVarargsInteger(int... angka){
        for (int nilai : angka){
            System.out.println(nilai + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        // Memanggil fungsi varargs string`
        fungsiVarargsString("Hello", "Good", "Morning");

        //Memanggil fungsi varargs integer
        fungsiVarargsInteger(7,15);
    }
}

import java.util.Scanner;

public class NestedLoop_NIM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] temps = new int[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        // Display the array using foreach loops
        int kotaIndex = 1;
        for (int[] kotaTemps : temps) {
            System.out.print("Kota ke-" + kotaIndex + ": ");
            for (int temp : kotaTemps) {
                System.out.print(temp + " ");
            }
            System.out.println();
            kotaIndex++;
        }
    }
}

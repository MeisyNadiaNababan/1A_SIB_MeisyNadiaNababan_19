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

        // Display the array and calculate the average temperature for each city
        for (int i = 0; i < temps.length; i++) {
            int kotaTotal = 0; // Total temperature for the city
            for (int j = 0; j < temps[0].length; j++) {
                kotaTotal += temps[i][j];
            }
            double kotaAverage = (double) kotaTotal / temps[0].length;
            
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (int temp : temps[i]) {
                System.out.print(temp + " ");
            }
            System.out.println("Rata-rata: " + kotaAverage);
        }
    }
}

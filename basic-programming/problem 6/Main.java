import java.util.Scanner;

public class Main {
    public static void drawXYZ(int size) {
        char[] pattern = {'X', 'Y', 'Z'};
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int randomIndex = (int) (Math.random() * 3);
                System.out.print(pattern[randomIndex]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ukuran pola: ");
        int size = input.nextInt();
        drawXYZ(size);
    }
}
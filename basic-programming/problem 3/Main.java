import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan konversi nilai: ");
        int nilai = input.nextInt();
        String nilaihuruf;
        if (nilai <= 100 && nilai >= 80) {
            nilaihuruf = "A";
        } else if (nilai <= 79 && nilai >= 65) {
            nilaihuruf = "B+";
        } else if (nilai <= 64 && nilai >= 50) {
            nilaihuruf = "B";
        } else if (nilai <= 49 && nilai >= 35) {
            nilaihuruf = "C";
        } else if (nilai <= 34 && nilai >= 0) {
            nilaihuruf = "D";
            System.out.println("Valid");
        } else {
            nilaihuruf = "Invalid";
        }
        System.out.println("Nilai Huruf: " + nilaihuruf);
    }
}
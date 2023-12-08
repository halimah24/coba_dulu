import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();
        System.out.print("Faktor dari " + bilangan + " adalah: ");
        for (int i = 1; i <= bilangan; i++) {
            if (bilangan % i ==0) {
                System.out.print(i + " ");
            }
        }
    }
}
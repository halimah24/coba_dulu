import java.util.Scanner;

public class Main {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan yang ingin dicek: ");
        int inputNumber = input.nextInt();
        System.out.println(isPrime(inputNumber));
    }
}
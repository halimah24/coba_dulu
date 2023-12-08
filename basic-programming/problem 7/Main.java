import java.util.Scanner;

public class Main {
    public static double calculateMean(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int count = input.nextInt();
        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        double mean = calculateMean(numbers);
        System.out.println("Rata-rata dari " + count + " bilangan tersebut adalah " + mean);
    }
}
import java.util.Scanner;

public class Tugas3Kelipatan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input n: ");
        int n = scanner.nextInt();

        int count = 0;
        int number = 2;

        while (count < n) {
            if (number % 4 != 0) {
                System.out.print(number + ", ");
                count++;
            }
            number += 2;
        }

        System.out.println();
    }
}

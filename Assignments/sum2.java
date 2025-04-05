import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        System.out.println("Enter numbers (enter 0 to stop):");

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
        }

        System.out.println("Sum of all entered numbers: " + sum);
        scanner.close();
    }
}
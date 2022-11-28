import java.util.InputMismatchException;
import java.util.Scanner;

public class ExistInArray {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 11, 13};
        int searchValue;
        boolean valueFound = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        try {
            searchValue = scanner.nextInt();

            for (int number : numbers) {
                if(number == searchValue) {
                    System.out.printf("Value %d found in array\n", number);
                    valueFound = true;
                }
            }

            if (!valueFound) {
                System.out.println("Value was not found in array");
            }

        } catch (InputMismatchException e ) {
            System.out.println("Invalid input. Please enter an integer value.");
        }

    }
}

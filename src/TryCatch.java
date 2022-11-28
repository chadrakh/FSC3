import java.util.InputMismatchException;
import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {

        int age;
        boolean isValid = false;

        while (!isValid) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter age: ");

            try {
                age = scanner.nextInt();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                isValid = false;

                continue;
            }

            if (isValid) {
                System.out.println("Age: " + age);
                scanner.close();
            }
        }


    }
}

import java.util.Random;

public class Duplicates {
    public static void main(String[] args) {
        int[] array1 = new int[6];
        int[] array2 = new int[6];

        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] += random.nextInt(20)+1;
        }
        for (int j = 0; j < array2.length; j++) {
            array2[j] += random.nextInt(20)+1;
        }

        displayContents(array1);
        displayContents(array2);

        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2) {
                    System.out.println("Duplicate " + num1 + " found");
                }
            }
        }

    }

    public static void displayContents(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }

        System.out.println();

    }
}

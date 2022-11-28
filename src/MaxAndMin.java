import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] randomNumbers = new int[10];

        Random random = new Random();

        // for loop to write values to array
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(10)+1;
            System.out.print(randomNumbers[i] + " ");
        }

        int maxValue = 0; // initialised maxValue as 0 as the random numbers generated are in the range 1-20
        int minValue = randomNumbers[0]; // initialised minValue as first item in array so that comparison is only done with existing values

        for (int number: randomNumbers) {
            if (number > maxValue) {
                maxValue = number;
            }

            if (number < minValue) {
                minValue = number;
            }
        }

        System.out.println();
        System.out.println("max = " + maxValue);
        System.out.println("min = " + minValue);
    }
}

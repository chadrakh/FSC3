public class TestArray {
    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] += i * 3;
            sum += numbers[i];

            System.out.print(numbers[i] + " ");
        }

        double average = (double)(sum) / numbers.length;

        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

    }
}

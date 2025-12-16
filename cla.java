public class cla {

    public static void main(String[] args) {
        int sum = 0;
        int nonIntegerCount = 0;

        for (String arg : args) {
            try {
                // Try to parse the argument as an integer
                int number = Integer.parseInt(arg);
                sum += number;
            } catch (NumberFormatException e) {
                // If it fails, it's not an integer
                nonIntegerCount++;
            }
        }

        System.out.println("Sum of integers: " + sum);
        System.out.println("Count of non-integer arguments: " + nonIntegerCount);
    }
}

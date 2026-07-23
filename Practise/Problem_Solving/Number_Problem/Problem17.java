public class Problem17 {
    public static void main(String[] args) {

        int n = 987978;
        int max = -1;
        int secondMax = -1;

        while (n != 0) {
            int digit = n % 10;

            if (digit > max) {
                secondMax = max;
                max = digit;
            } else if (digit > secondMax && digit != max) {
                secondMax = digit;
            }

            n /= 10;
        }

        System.out.println("Max: " + max);
        System.out.println("Second Max: " + secondMax);
    }
}
class Problem29 {

    public static void main(String[] args) {

        int n = 2026;
        int temp = n;

        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }

        int sum = 0;

        if (count == 2) {

            int first = temp / 10;
            int second = temp % 10;

            sum = first + second;

        } else if (count == 4) {

            int first = temp / 100;
            int second = temp % 100;

            sum = first + second;

        } else {
            System.out.println("This is Not Tech Number");
            return;
        }

        if (sum * sum == temp) {
            System.out.println("Tech Number");
        } else {
            System.out.println("This is Not Tech Number");
        }
    }
}
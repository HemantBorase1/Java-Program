class Problem13 {

    public static void main(String[] args) {

        int n = 123456;

       
        int revNum = 0;
        int temp = n;

        while (temp != 0) {
            revNum = revNum * 10 + temp % 10;
            temp /= 10;
        }

        // Store even digits (in reverse order)
        temp = revNum;
        int even = 0;

        while (temp != 0) {
            int digit = temp % 10;

            if (digit % 2 == 0) {
                even = even * 10 + digit;
            }

            temp /= 10;
        }

       
        temp = revNum;
        int ans = 0;

        while (temp != 0) {

            int digit = temp % 10;

            if (digit % 2 == 0) {
                ans = ans * 10 + (even % 10);
                even /= 10;
            } else {
                ans = ans * 10 + digit;
            }

            temp /= 10;
        }

        System.out.println(ans);
    }
}
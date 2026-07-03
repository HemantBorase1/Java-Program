class Problem24 {

    public static void main(String[] args) {

        int arr1[] = {2, 4, 6, 8};
        int arr2[] = {1, 2, 5, 6};

        for (int i = 0; i < arr1.length; i++) {

            int duplicate = 0;

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    duplicate += arr1[i];
                }
            }

            if (duplicate > 0)
                System.out.print(duplicate + " ");
        }
    }
}
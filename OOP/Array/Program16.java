import java.util.Arrays;

// Selection Sort Code.
class Program16 {
    public static void main(String[] args) {
        int a[] = {64, 25, 12, 22, 11};

        for (int i = 0; i < a.length - 1; i++) {
            int small = i;

            // Find index of smallest element
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[small] > a[j]) 
                {
                    small = j;
                }
            }
             
            // Swap after inner loop
            int temp = a[i];
            a[i] = a[small];
            a[small] = temp;
        }

        System.out.println(Arrays.toString(a));
    }
}

/*
11,12,22,25,64
 0  1  2  3  4
          i
          s
             j
11,12,25,22,64


*/
import java.util.Scanner;

class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }

        sc.close();
    }
}
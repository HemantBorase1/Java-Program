class Problem13 {
    public static void main(String[] args) {
        String str = "Apple is an Orange";
        String[] word = str.split(" ");
        int count = 0;

        for (int i = 0; i < word.length; i++) {
            char current = Character.toLowerCase(word[i].charAt(0));

            if (current == 'a' || current == 'e' || current == 'i'
                    || current == 'o' || current == 'u') {
                count++;
            }
        }

        System.out.println(count);
    }
}
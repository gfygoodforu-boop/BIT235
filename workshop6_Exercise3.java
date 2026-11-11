public class workshop6_Exercise3 {
    public static void main(String[] args) {
        String sentence = "To be or not to be.";
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            char[] letters = words[i].toCharArray();

            // Keep punctuation at the end of the word.
            int right = letters.length - 1;
            while (right >= 0 && !Character.isLetterOrDigit(letters[right])) {
                right--;
            }

            int left = 0;
            while (left < right) {
                char temp = letters[left];
                letters[left] = letters[right];
                letters[right] = temp;
                left++;
                right--;
            }

            words[i] = new String(letters);
        }

        System.out.println(String.join(" ", words));
    }

}

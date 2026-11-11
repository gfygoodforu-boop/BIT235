public class workshop6_Exercise4 {
    public static void main(String[] args) {
        String message = "G tgsl Qefe.";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String code = "crgzavibsdoeqfhujxklwmynpt";
        StringBuilder decodedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char current = message.charAt(i);

            if (Character.isLetter(current)) {
                boolean isUpperCase = Character.isUpperCase(current);
                char lowerCase = Character.toLowerCase(current);
                int index = alphabet.indexOf(lowerCase);
                char decoded = code.charAt(index);

                if (isUpperCase) {
                    decoded = Character.toUpperCase(decoded);
                }

                decodedMessage.append(decoded);
            } else {
                decodedMessage.append(current);
            }
        }

        System.out.println("Decoded message: " + decodedMessage);
    }

}

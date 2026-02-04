
class CleanSentence {
    public static void main(String[] args) {

        String sentence = "A man, a plan, a canal, Panama!";
        StringBuilder clean = new StringBuilder();

        // Step 1: Clean the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                clean.append(Character.toLowerCase(c));
            }
        }

        // Step 2: Convert to String
        String original = clean.toString();

        // Step 3: Reverse
        String reversed = new StringBuilder(original).reverse().toString();

        // Step 4: Compare
        if (original.equals(reversed)) {
            System.out.println("Palindrome sentence");
        } else {
            System.out.println("Not a palindrome sentence");
        }
    }
}

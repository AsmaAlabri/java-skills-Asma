public class TextProcessor {

    // Count words in a sentence
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    // Replace specific words
    public static String replaceWord(String text, String oldWord, String newWord) {
        if (text == null || oldWord == null || newWord == null) {
            return text;
        }
        return text.replace(oldWord, newWord);
    }

    // Main method
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";

        int wordCount = countWords(sentence);
        System.out.println("Original sentence: " + sentence);
        System.out.println("Word count: " + wordCount);

        String updatedSentence = replaceWord(sentence, "Java", "Python");
        System.out.println("After Replacement: " + updatedSentence);
    }
}

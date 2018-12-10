package training8;

public class CapitalLetter {
    //1. Convert the text so that each word begins with a capital letter.

    private String testCharArray;
    String[] myTask = {
            "Convert, the 7 text so that each word begins with a capital letter?",
            "Count the number of punctuation marks in this text.",
            "Determine the entire of all integers found in a given text.",
            "In each word of the text of the k-th letter, replace the number with a symbol. If k is more than words words, no adjustment is made.",
            "Remove from the text its part,7 enclosed between two characters that are entered (for example, between the brackets '(' and ')' or between asterisks '*', etc.).",
            "Find and print how many times every word in the text is repeated.",
            "Find which letters, vowels or 7 consonants are more in each sentence of the text.",
            "In (all) the interrogative sentences of the text, find and print without repeating the words of a given length."};

    public String toUp(String s){
        char[] arr = s.toCharArray();
        boolean inWord = false;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] >= 97 && arr[i] <= 122) {
                if (inWord) {
                    continue;
                }
                arr[i] -= 32;
                inWord = true;
            } else {
                inWord = false;
            }
        }
        return new String(arr);
    }

    public void showToUp(){
        for (String s : myTask) {
            System.out.println(toUp(s));
    }
}
}

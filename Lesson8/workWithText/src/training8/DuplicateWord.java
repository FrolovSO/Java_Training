package training8;

public class DuplicateWord {
    //Find and print how many times every word in the text is repeated
    String[] myTask = {
            "Convert, the 7 text so that each word begins with a capital letter?",
            "Count the number of punctuation marks in this text.",
            "Determine the entire of all integers found in a given text.",
            "In each word of the text of the k-th letter, replace the number with a symbol. If k is more than words words, no adjustment is made.",
            "Remove from the text its part,7 enclosed between two characters that are entered (for example, between the brackets '(' and ')' or between asterisks '*', etc.).",
            "Find and print how many times every word in the text is repeated.",
            "Find which letters, vowels or 7 consonants are more in each sentence of the text.",
            "In (all) the interrogative sentences of the text, find and print without repeating the words of a given length."};

    int count = 0;
    char[]c={'t'};
    public String duplicateWord (String d){
        char[] word = d.toCharArray();
        for (int i=0; i<word.length; i++){
            for (int j=0; j<c.length; j++)
                if (word[i]==c[j]){
                    count++;
                    break;
                }
        }
        System.out.println(count);
        return new String(word);
    }

    public void showDuplicateWord(){
        for(String word : myTask) {
            System.out.println(duplicateWord(word));
        }
    }
}

package training8;

public class SummAll {
    //3. Determine the entire of all integers found in a given text.
    String[] myTask = {
            "Convert, the 7 text so that each word begins with a capital letter?",
            "Count the number of punctuation marks in this text.",
            "Determine the entire of all integers found in a given text.",
            "In each word of the text of the k-th letter, replace the number with a symbol. If k is more than words words, no adjustment is made.",
            "Remove from the text its part,7 enclosed between two characters that are entered (for example, between the brackets '(' and ')' or between asterisks '*', etc.).",
            "Find and print how many times every word in the text is repeated.",
            "Find which letters, vowels or 7 consonants are more in each sentence of the text.",
            "In (all) the interrogative sentences of the text, find and print without repeating the words of a given length."};


    public String summAll(String su){
        char[] chars = su.toCharArray();
        int sum=0;
        for(int i = 0; i < chars.length; i++) {
            if ((byte)chars[i] >= 0x30 && (byte)chars[i] <= 0x39)
                sum += (byte)chars[i] - 0x30;
        }
        System.out.println(sum);
        return new String(chars);
    }
    public void showSummAll(){
        for (String su : myTask){
            System.out.println(summAll(su));
        }
    }
}

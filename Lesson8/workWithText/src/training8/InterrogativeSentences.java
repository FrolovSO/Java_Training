package training8;

public class InterrogativeSentences {
    //8 In (all) the interrogative sentences of the text, find and print without repeating the words of a given length.
    String[] myTask = {
            "Convert, the 7 text so that each word begins with a capital letter?",
            "Count the number of punctuation marks in this text.",
            "Determine the entire of all integers found in a given text.",
            "In each word of the text of the k-th letter, replace the number with a symbol. If k is more than words words, no adjustment is made.",
            "Remove from the text its part,7 enclosed between two characters that are entered (for example, between the brackets '(' and ')' or between asterisks '*', etc.).",
            "Find and print how many times every word in the text is repeated.",
            "Find which letters, vowels or 7 consonants are more in each sentence of the text.",
            "In (all) the interrogative sentences of the text, find and print without repeating the words of a given length."};

    char[]c={'?'};
    public String interrogativeSentences(String ins){
        char[] ch = ins.toCharArray();
        for (int i=0; i<ch.length; i++){
            for (int j=0; j<c.length; j++)
                if (Character.toString(ch[i]).endsWith("?")){
                    StringBuilder stringBuilder = new StringBuilder();

                    stringBuilder.append("InterrogativeSentences");

                    System.out.println(stringBuilder.toString());

                    break;
                }
        }
        return new String(ch);
    }
    public void showInterrogativeSentences(){
        for(String ins : myTask) {
            System.out.println(new InterrogativeSentences().interrogativeSentences(ins));
        }
    }
}

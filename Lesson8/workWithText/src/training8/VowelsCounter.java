package training8;

public class VowelsCounter {
    //7. Find which letters, vowels or 7 consonants are more in each sentence of the text.",
    String[] myTask = {
            "Convert, the 7 text so that each word begins with a capital letter?",
            "Count the number of punctuation marks in this text.",
            "Determine the entire of all integers found in a given text.",
            "In each word of the text of the k-th letter, replace the number with a symbol. If k is more than words words, no adjustment is made.",
            "Remove from the text its part,7 enclosed between two characters that are entered (for example, between the brackets '(' and ')' or between asterisks '*', etc.).",
            "Find and print how many times every word in the text is repeated.",
            "Find which letters, vowels or 7 consonants are more in each sentence of the text.",
            "In (all) the interrogative sentences of the text, find and print without repeating the words of a given length."};

    int count1 = 0;
    int count2 = 0;
    char[]vowels={'a', 'e', 'i', 'o', 'u'};
    char[]notVowels={'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
    public String vowelsCounter (String chL){
        char[] character = chL.toCharArray();
        for (int i=0; i<character.length; i++){
            for (int j=0; j<vowels.length; j++)
                if (character[i]==vowels[j]) {
                    count1++;
                    break;
                }
        }
        for (int i=0; i<character.length; i++){
            for (int j=0; j<notVowels.length; j++)
                if (character[i]==notVowels[j]) {
                    count2++;
                    break;
                }
        }
        if (count1 > count2) {
            System.out.println("vowels are more ");
        }else System.out.println("consonants are more ");
        return new String(character);
    }
    public void showVowelsCounter(){
        for(String chL : myTask) {
            System.out.println(vowelsCounter(chL));
        }
    }
}

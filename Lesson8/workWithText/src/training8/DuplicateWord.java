package training8;

public class DuplicateWord {
    //Find and print how many times every word in the text is repeated
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

}

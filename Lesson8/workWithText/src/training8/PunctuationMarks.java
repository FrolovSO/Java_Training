package training8;

public class PunctuationMarks {
    //2. Count the number of punctuation marks in this text.

    char[]c={'.',',','-',':',';','?','!'};
    int count = 0;

    public String countPunkt(String p){
        char[] ch = p.toCharArray();
        for (int i=0; i<ch.length; i++){
            for (int j=0; j<c.length; j++){
                if (ch[i]==c[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
        return new String(ch);

    }
}


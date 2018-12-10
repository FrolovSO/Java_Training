package training8;

public class VowelsCounter {
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
}

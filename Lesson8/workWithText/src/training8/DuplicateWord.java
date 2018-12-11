package training8;

public class DuplicateWord {
    //Find and print how many times every word in the text is repeated

    private int duplicateWord (String text, String stringToFind){

        int count = 0;
        StringBuffer buffer = new StringBuffer();
        for (int i=0; i<text.length(); i++){
            if(text.charAt(i) != ' ') {
                buffer.append(text.charAt(i));
            } else {
                if(buffer.toString().equals(stringToFind)) {
                    count++;
                }
                buffer.delete(0, buffer.length());
            }
        }

        return count;
    }

    public int showDuplicateWord(String stringToFind){
        int commonCount = 0;
        for(String text : ContsSting.myTask) {
            commonCount = commonCount +duplicateWord(text,stringToFind);
        }
        return  commonCount;
    }
}

package training8;

public class CapitalLetter {
    //1. Convert the text so that each word begins with a capital letter.

    private String testCharArray;


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
        for (String s : ContsSting.myTask) {
            System.out.println(toUp(s));
    }
}
}

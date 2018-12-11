package training8;

public class InterrogativeSentences {
    //8 In (all) the interrogative sentences of the text, find and print without repeating the words of a given length.

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
        for(String ins : ContsSting.myTask) {
            System.out.println(new InterrogativeSentences().interrogativeSentences(ins));
        }
    }
}

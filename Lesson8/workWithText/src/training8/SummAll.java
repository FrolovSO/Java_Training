package training8;

public class SummAll {
    //3. Determine the entire of all integers found in a given text.


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
        for (String su : ContsSting.myTask){
            System.out.println(summAll(su));
        }
    }
}

package training8;

public class RemoveSelected {

    //5. Remove from the text its part,7 enclosed between two characters that are entered (for example, between the brackets '(' and ')' or between asterisks '*', etc.).",


    public String removeSelected(String rems){
        char[] replace = rems.toCharArray();
        return new String(replace);
    }
    public void showRemoveSelected(){
        for (String rems : ContsSting.myTask){
            System.out.println(removeSelected(rems).replaceAll("\\([^)]+\\)", ""));
        }
    }
}

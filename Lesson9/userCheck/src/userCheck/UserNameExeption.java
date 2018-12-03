package userCheck;

public class UserNameExeption extends Exception {
    private String userNameAlert;

    UserNameExeption(String u){userNameAlert = u;}
    public String getUserNameAlert() {return userNameAlert;}

    @Override
    public String toString() {
        return super.toString() + userNameAlert;
    }

}

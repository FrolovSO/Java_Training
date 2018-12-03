package userCheck;

public class PasswordExeption extends Exception {
    private String passwordAlert;

    PasswordExeption(String p){passwordAlert = p;}
    public String gerPasswordAlert() {
        return passwordAlert;
    }

    @Override
    public String toString() {
        return super.toString() + passwordAlert;
    }
}

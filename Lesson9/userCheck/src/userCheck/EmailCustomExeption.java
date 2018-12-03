package userCheck;

public class EmailCustomExeption extends Exception {
    private String emailAlert;

    EmailCustomExeption(String e){
        emailAlert = e;
    }
    public String getEmailAlert() {
        return emailAlert;
    }

    @Override
    public String toString() {
        return super.toString() + emailAlert;
    }
}

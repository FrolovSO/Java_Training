package userCheck;

public class Validator{
    //User - 5 fields
    //Class Validator chek some fields and throw exception in case of invalid data
    // 3 custom exception
    //Show users with invalid registration in format (User1 - invalid, User2 valid)


    public void validateUser(User user) {
        try {
            if (!user.getEmail().contains("@")) {
                emailValidator(user.getUserName() + " - invalid");
            }
            if (user.getUserName().contains("!")){
                usenNameValidator(user.getUserName() + " - invalid");
            }
            if (user.getPassword() > 5){
                passwordValidator(user.getUserName() + " - invalid");
            }
            System.out.println(user.getUserName() + " - User valid");
        } catch (EmailCustomExeption e){
            System.out.println(e.getEmailAlert());
        } catch (UserNameExeption u){
            System.out.println(u.getUserNameAlert());
        } catch (PasswordExeption p){
            System.out.println(p.gerPasswordAlert());
        }
    }

    public void emailValidator(String e) throws EmailCustomExeption{
        throw new EmailCustomExeption(e);
    }
    public void usenNameValidator(String u) throws UserNameExeption {
        throw new UserNameExeption(u);
    }
    public void passwordValidator(String p) throws PasswordExeption {
        throw new PasswordExeption(p);
    }

}

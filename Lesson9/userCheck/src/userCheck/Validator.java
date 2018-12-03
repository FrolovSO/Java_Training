package userCheck;

public class Validator{
    //User - 5 fields
    //Class Validator chek some fields and throw exception in case of invalid data
    // 3 custom exception
    //Show users with invalid registration in format (User1 - invalid, User2 valid)

    public static void main(String[] args) {
        User user1 = new User("sergey32", 00001,"sergey", "frolov","test@tut.by");
        User user2 = new User("test32", 99999,"sergey23", "frolov23","testtut.by");
        User user3 = new User("!test3", 90001,"test", "test","test@test.test");
        User user4 = new User("sergey32", 000010,"sergey", "frolov","test@tut.by");
        Validator validator = new Validator();
        validator.validateUser(user1);
        validator.validateUser(user2);
        validator.validateUser(user3);
        validator.validateUser(user4);
    }

    public void validateUser(User user) {
        try {
            if (!user.getEmail().contains("@")) {
                new Validator().emailValidator(user.getUserName() + " - invalid");
            }
            if (user.getUserName().contains("!")){
                new Validator().usenNameValidator(user.getUserName() + " - invalid");
            }
            if (user.getPassword() > 5){
                new Validator().passwordValidator(user.getUserName() + " - invalid");
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

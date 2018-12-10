package userCheck;

public class Main {
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
}

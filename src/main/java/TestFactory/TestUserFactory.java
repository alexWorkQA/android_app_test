package TestFactory;

import TestModel.User;

public class TestUserFactory {

    public static User getNewUser() {
        User user = new User();
        user.getName();
        user.getPassword();
        return user;
    }

    public static User getDefaultUser() {
        User user = new User();
        user.setName("username_placeholder");
        user.setPassword("userpassword_placeholder");
        return user;
    }
}


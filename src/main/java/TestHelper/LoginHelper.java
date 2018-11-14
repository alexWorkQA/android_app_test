package TestHelper;

import TestFactory.TestActivityFactory;
import TestModel.User;

public class LoginHelper {

    public void loginValidUserToApp(User user) {
        TestActivityFactory.mainActivity.loginToApp(user);
    }

    public void loginUserWithoutPassword(User user){

    }

    public String getErrorMessage(){
        return TestActivityFactory.mainActivity.getErrorMessage();
    }
}

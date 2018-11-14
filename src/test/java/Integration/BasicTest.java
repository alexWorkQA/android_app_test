package Integration;

import TestApplication.Application;
import TestFactory.TestUserFactory;
import TestModel.User;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasicTest {

    Application app;
    User user;

    @BeforeMethod
    public void globalBefore() {
        app = new Application();
        app.startApp();
        user = TestUserFactory.getDefaultUser();
    }

    @AfterMethod
    public void globalAfter() {
        app.closeApp();
    }

}

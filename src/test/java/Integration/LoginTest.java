package Integration;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BasicTest {

    @Test
    public void nonRegisteredUserIsNotAbleToLogin() {
        app.loginHelper.loginValidUserToApp(user);
        Assert.assertEquals(app.loginHelper.getErrorMessage(),"Login Failed.Invalid email id / mobile number");
    }

    @Test
    public void userWithoutPasswordIsNotAbleToLogin() {
        user.setPassword("");
        app.loginHelper.loginValidUserToApp(user);
        Assert.assertEquals(app.loginHelper.getErrorMessage(),"Please enter your password");
    }
}

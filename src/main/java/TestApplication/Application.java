package TestApplication;
import TestFactory.TestActivityFactory;
import TestHelper.LoginHelper;

public class Application {

   public LoginHelper loginHelper = new LoginHelper();

    public void startApp(){
        TestActivityFactory.initialization();
    }


    public void closeApp(){
        TestActivityFactory.mainActivity.closeApp();
    }

}

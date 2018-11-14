package TestFactory;

import TestActivities.MainActivity;
import io.appium.java_client.android.AndroidDriver;

public class TestActivityFactory {

    public static AndroidDriver driver;

    public static MainActivity mainActivity;

    static {
        driver = TestDriverFactory.getAndroidDriver();
    }

    public static void initialization() {
         mainActivity = new MainActivity(driver);
    }


}

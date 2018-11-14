package TestFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

class TestDriverFactory {

    private static AndroidDriver driver = null;
    private final static String APP_PACKAGE_NAME = "com.flipkart.android";
    private final static File APP_DIR = new File("C:\\Projects\\AutomationTestsTrainings\\android_app_test\\src\\apk");
    private final static File APP = new File(APP_DIR, "test.apk");


    static AndroidDriver getAndroidDriver() {
        if (driver != null) {
            return driver;
        } else {
            DesiredCapabilities capabilities = DesiredCapabilities.android();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
            capabilities.setCapability(MobileCapabilityType.APP, APP.getAbsolutePath());
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
            capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE_NAME);
            try {
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            return driver;
        }

    }
}

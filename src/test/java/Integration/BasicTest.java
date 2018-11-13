package Integration;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasicTest {

    private static AppiumDriverLocalService service;

    @BeforeMethod
    public void globalBefore() {
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
    }

    @AfterMethod
    public void globalAfter() {
        service.stop();
    }

}

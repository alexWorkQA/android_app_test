package TestActivities;

import TestModel.User;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainActivity {

    private AndroidDriver<AndroidElement> driver;
    private WebDriverWait wait;

    public MainActivity(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,30);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "user_id")
    private AndroidElement username_field;

    @AndroidFindBy(id = "user_password")
    private AndroidElement password_field;

    @AndroidFindBy(id = "btn_login")
    private AndroidElement login_button;

    @AndroidFindBy(id = "text")
    private AndroidElement failure_message;

    void waitForVisibilityOf(AndroidElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public MainActivity loginToApp(User user) {
        waitForVisibilityOf(username_field);
        username_field.sendKeys(user.getName());
        waitForVisibilityOf(password_field);
        password_field.sendKeys(user.getPassword());
        login_button.click();
        return this;
    }

    public String getErrorMessage() {
        return failure_message.getText();
    }

    public void closeApp() {
        driver.quit();
    }


}

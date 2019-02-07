package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import resources.BasePage;

import java.io.IOException;

public class LoginPageTest extends BasePage {
    public WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setUp() throws IOException {
        driver = initializeDriver();
        loginPage = new LoginPage(driver);
    }
    @Test
    public void verifyLogin() throws InterruptedException {
        loginPage.getUserName().sendKeys(prop.getProperty("user"));
        loginPage.getPassword().sendKeys(prop.getProperty("pwd"));
        loginPage.loginButton().click();
        Thread.sleep(5000);
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL,prop.getProperty("expectedURL"));
    }

}

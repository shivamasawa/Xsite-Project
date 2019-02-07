package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SignupPage;
import resources.BasePage;

import java.io.IOException;

public class SignupPageTest extends BasePage {
    public WebDriver driver;
    LoginPage loginPage;
    SignupPage signupPage;
    @BeforeClass
    public void setUp() throws IOException {
        driver = initializeDriver();
        loginPage = new LoginPage(driver);
        signupPage = new SignupPage(driver);
    }
    @Test
    public void verifySignup () throws InterruptedException {
        loginPage.signUpLink().click();
        //Thread.sleep(5000);
        signupPage.getFirstName().sendKeys(prop.getProperty("firstname"));
        signupPage.getLastName().sendKeys(prop.getProperty("lastname"));
        signupPage.getEmail().sendKeys(prop.getProperty("email"));
        signupPage.getPassword().sendKeys(prop.getProperty("password"));
        signupPage.getRepeatPassword().sendKeys(prop.getProperty("repeatPwd"));
        signupPage.getPhoneNumber().sendKeys(prop.getProperty("phoneNum"));
        signupPage.getTandC().click();
        Thread.sleep(3000);
        signupPage.getStartedLink().click();
        Thread.sleep(5000);
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals(currentURL, prop.getProperty("expectedURL"));
    }
}

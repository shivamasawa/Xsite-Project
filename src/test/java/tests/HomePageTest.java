package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SignupPage;
import resources.BasePage;

import java.io.IOException;

public class HomePageTest extends BasePage {
    public WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    SignupPage signupPage;
    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        driver = initializeDriver();
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        signupPage = new SignupPage(driver);
        loginPage.getUserName().sendKeys(prop.getProperty("user"));
        loginPage.getPassword().sendKeys(prop.getProperty("pwd"));
        loginPage.loginButton().click();
        Thread.sleep(5000);
    }

    @Test
    public void verifyPersonalInfo () throws InterruptedException {
        homePage.getDepositPopup().click();
        homePage.getIDNum().sendKeys(prop.getProperty("IDNum"));
        homePage.getDay().click();
        homePage.getDayValue().click();
        homePage.getMonth().click();
        homePage.getMonthValue().click();
        homePage.getYear().click();
        homePage.getYearValue().click();
        homePage.getAddress().sendKeys(prop.getProperty("Address"));
        homePage.getHouseNo().sendKeys(prop.getProperty("HouseNo"));
        homePage.getCity().sendKeys(prop.getProperty("City"));
        homePage.getPostalCode().sendKeys(prop.getProperty("Post"));
        homePage.getUpdateBtn().click();
        Thread.sleep(5000);
    }
}

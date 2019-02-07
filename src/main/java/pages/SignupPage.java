package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {
    public WebDriver driver;
    By firstname = By.xpath("//*[@name='firstName']");
    By lastname = By.xpath("//*[@name='lastName']");
    By email = By.xpath("//*[@name='email']");
    By password = By.xpath("//*[@name='password']");
    By repeatPwd = By.xpath("//*[@name='repeatPassword']");
    By country = By.xpath("");
    By phoneNum = By.xpath("//*[@name='telephone']");
    By checkTerms = By.xpath("//*[@class='md-container']");
    By getStarted = By.xpath("//*[@class='ladda-label']");
    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getFirstName() {
        return driver.findElement(firstname);
    }
    public WebElement getLastName() {
        return driver.findElement(lastname);
    }
    public WebElement getEmail() {
        return driver.findElement(email);
    }
    public WebElement getPassword() {
        return driver.findElement(password);
    }
    public WebElement getRepeatPassword() {
        return driver.findElement(repeatPwd);
    }
    public WebElement getPhoneNumber() {
        return driver.findElement(phoneNum);
    }
    public WebElement getTandC() { return driver.findElement(checkTerms); }
    public WebElement getStartedLink() {
        return driver.findElement(getStarted);
    }

}

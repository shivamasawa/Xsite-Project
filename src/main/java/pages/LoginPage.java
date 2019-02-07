package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver driver;
    By username = By.xpath("//input[@name='email']");
    By password = By.xpath("//input[@name='password']");
    By login = By.xpath("//button[@class='md-button md-primary md-raised fullwidth icon-button ladda-button']");
    By signupLink = By.linkText("Sign Up");
    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }
    public WebElement getUserName() {
        return driver.findElement(username);
    }
    public WebElement getPassword() {
        return driver.findElement(password);
    }
    public WebElement loginButton() {
        return driver.findElement(login);
    }
    public WebElement signUpLink() {
        return driver.findElement(signupLink);
    }
}

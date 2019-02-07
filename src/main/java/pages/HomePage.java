package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import resources.BasePage;

public class HomePage {
    public WebDriver driver;
    By depositPopup = By.cssSelector("#dialogContent_9 > div.actions.layout-align-start-center.layout-row > button");
    //Personal Information
    By IDNum = By.xpath("//*[@name='idNumber']");
    By Day = By.xpath("//md-select[@name='day']");
    By DayValue = By.xpath("//md-select[@name='day']/following::div[text()='1']");
    By Month = By.xpath("//md-select[@name='month']");
    By MonthValue = By.xpath("//md-select[@name='month']/following::div[text()='January']");
    By Year = By.xpath("//md-select[@name='year']");
    By YearValue = By.xpath("//md-select[@name='year']/following::div[text()='2000']");
    By Address = By.xpath("//*[@name='address']");
    By HouseNo = By.xpath("//*[@name='houseNumber']");
    By City = By.xpath("//*[@name='city']");
    By PostalCode = By.xpath("//*[@name='zip']");
    By UpdateBtn = By.xpath("//*[@class='md-button md-primary md-raised fullwidth icon-button ladda-button']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDepositPopup() {
        return driver.findElement(depositPopup);
    }

    public WebElement getIDNum() {
        return driver.findElement(IDNum);
    }

    public WebElement getDay() {
        return driver.findElement(Day);
    }

    public WebElement getDayValue() {
        return driver.findElement(DayValue);
    }

    public WebElement getMonth() {
        return driver.findElement(Month);
    }

    public WebElement getMonthValue() {
        return driver.findElement(MonthValue);
    }

    public WebElement getYear() {
        return driver.findElement(Year);
    }

    public WebElement getYearValue() {
        return driver.findElement(YearValue);
    }

    public WebElement getAddress() {
        return driver.findElement(Address);
    }

    public WebElement getHouseNo() {
        return driver.findElement(HouseNo);
    }

    public WebElement getCity() {
        return driver.findElement(City);
    }

    public WebElement getPostalCode() {
        return driver.findElement(PostalCode);
    }

    public WebElement getUpdateBtn() {
        return driver.findElement(UpdateBtn);
    }
}

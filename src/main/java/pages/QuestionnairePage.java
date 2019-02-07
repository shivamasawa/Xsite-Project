package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionnairePage {
    public WebDriver driver;
    By AccCur = By.xpath("//*[@name='question0129']");
    //By AccCurTxt = By.xpath("//*[@class='md-select-menu-container md-active md-clickable']/md-select-menu/md-content/md-option[1]");
            //*[@name='question0129']/following::div[text()='EUR']");
    By Leverage = By.xpath("//*[@name='question0130']");
    //By LeverageTxt = By.xpath("//*[@class='md-select-menu-container md-active md-clickable']/md-select-menu/md-content/md-option[1]");
            //*[@name='question0130']/following::div[text()='1:30']");
    By NextBtn1 = By.xpath("//*[@id='content']/div/questionnaire/div/div[2]/div/div/div/section[1]/div/div/div[2]");
    By EmpStatus = By.xpath("//*[@name='question1131']");
    //By EmpStatusTxt = By.xpath("//*[@class='md-select-menu-container md-active md-clickable']/md-select-menu/md-content/md-option[1]");
            //*[@name='question1131']/following::div[text()='Employed']");
    By NatOfBus = By.xpath("//*[@name='question1132']");
    //By NatOfBusTxt = By.xpath("//*[@class='md-select-menu-container md-active md-clickable']/md-select-menu/md-content/md-option[1]");
            //*[@name='question1132']/following::div[text()='Legal']");
    By AnnInc = By.xpath("//*[@name='question1133']");
    //By AnnIncTxt = By.xpath("//*[@class='md-select-menu-container md-active md-clickable']/md-select-menu/md-content/md-option[1]");
            //*[@name='question1133']/following::div[text()='Less than 15,000 EUR'][2]");
    By NetWorth = By.xpath("//*[@name='question1134']");
    //By NetWorthTxt = By.xpath("//*[@class='md-select-menu-container md-active md-clickable']/md-select-menu/md-content/md-option[1]");
            //*[@name='question1134']/following::div[text()='More than 250,000 EUR'][3]");
    By BankruptcyRadioBtn = By.xpath("//*[@name='question1135']/md-radio-button[1]/div[1]");
    By Funds = By.xpath("//*[@name='question1136']");
    //By FundsTxt = By.xpath("//*[@name='question1136']/following::div[text()='Salary']");
    //By FundTxt = By.xpath("//*[@class='md-select-menu-container md-active md-clickable']/md-select-menu/md-content/md-option[1]");
    By AmtofInvest = By.xpath("//*[@name='question1137']");
    By PurposeOfTA = By.xpath("//*[@name='question1138']");
    By USPRadioBtn = By.xpath("//*[@name='question1139']/md-radio-button[1]/div[1]");
    By USTin = By.xpath("//*[@name='question1140']");
    By PEPRadioBtn = By.xpath("//*[@name='question1143']/md-radio-button[1]/div[1]");
    By SelectFromDrpdwn = By.xpath("//*[@class='md-select-menu-container md-active md-clickable']/md-select-menu/md-content/md-option[1]");
    By NextBtn2 = By.xpath("//*[@id='content']/div/questionnaire/div/div[2]/div/div/div/section[2]/div/div/div[2]");
    By P3F1 = By.xpath("//*[@name='question2144']");  // Page 3 Field 1
    By P3F2 = By.xpath("//*[@name='question2145']");
    By P3F3 = By.xpath("//*[@name='question2146']/md-radio-button[1]/div[1]");
    By P3F4 = By.xpath("//*[@name='question2147']/md-radio-button[1]/div[1]");
    By P3F5 = By.xpath("//*[@name='question2148']");
    By P3F6 = By.xpath("//*[@name='question2149']");
    By P3F7 = By.xpath("//*[@name='question2150']");
    By P3F8 = By.xpath("//*[@name='question2151']");
    By P3F9 = By.xpath("//*[@name='question2152']");
    By P3F10 = By.xpath("//*[@name='question2153']");
    By P3F11 = By.xpath("//*[@name='question2154']");
    By SubmitBtn = By.xpath("//*[@id='content']/div/questionnaire/div/div[2]/div/div/div/section[3]/div/div/div[2]");
    By ContinueBtn = By.xpath("//*[@class='md-primary md-raised md-button']");

    public QuestionnairePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAccCur() {
        return driver.findElement(AccCur);
    }

    public WebElement getLeverage() {
        return driver.findElement(Leverage);
    }

    public WebElement getFirstNextBtn() {
        return driver.findElement(NextBtn1);
    }

    public WebElement getEmpStatus() {
        return driver.findElement(EmpStatus) ;
    }

    public WebElement getNatOfBus() {
        return driver.findElement(NatOfBus);
    }

    public WebElement getAnnInc() {
        return driver.findElement(AnnInc);
    }

    public WebElement getNetWorth() {
        return driver.findElement(NetWorth);
    }

    public WebElement getBankruptcyRadioBtn() {
        return driver.findElement(BankruptcyRadioBtn);
    }

    public WebElement getFunds() {
        return driver.findElement(Funds);
    }

    public WebElement getAmtofInvest() {
        return driver.findElement(AmtofInvest);
    }

    public WebElement getPurposeOfTA() {
        return driver.findElement(PurposeOfTA);
    }

    public WebElement getSelectFromDrpdwn() {
        return driver.findElement(SelectFromDrpdwn);
    }

    public WebElement getUSPRadioBtn() {
        return driver.findElement(USPRadioBtn);
    }

    public WebElement getUSTin() {
        return driver.findElement(USTin);
    }

    public WebElement getPEPRadioBtn() {
        return driver.findElement(PEPRadioBtn);
    }

    public WebElement getNextBtn2() {
        return driver.findElement(NextBtn2);
    }

    public WebElement getP3F1() {
        return driver.findElement(P3F1);
    }

    public WebElement getP3F2() {
        return driver.findElement(P3F2);
    }

    public WebElement getP3F3() {
        return driver.findElement(P3F3);
    }

    public WebElement getP3F4() {
        return driver.findElement(P3F4);
    }

    public WebElement getP3F5() {
        return driver.findElement(P3F5);
    }

    public WebElement getP3F6() {
        return driver.findElement(P3F6);
    }

    public WebElement getP3F7() {
        return driver.findElement(P3F7);
    }

    public WebElement getP3F8() {
        return driver.findElement(P3F8);
    }

    public WebElement getP3F9() {
        return driver.findElement(P3F9);
    }

    public WebElement getP3F10() {
        return driver.findElement(P3F10);
    }

    public WebElement getP3F11() {
        return driver.findElement(P3F11);
    }

    public WebElement getSubmitBtn() {
        return driver.findElement(SubmitBtn);
    }

    public WebElement getContinueBtn() {
        return driver.findElement(ContinueBtn);
    }
}

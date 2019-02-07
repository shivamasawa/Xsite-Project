package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.QuestionnairePage;
import pages.SignupPage;
import resources.BasePage;

import java.io.IOException;

public class QuestionnairePageTest extends BasePage {
    public WebDriver driver;
    QuestionnairePage quesPage;
    HomePage homePage;
    LoginPage loginPage;
    SignupPage signupPage;
    @BeforeClass
    public void setUp() throws IOException, InterruptedException {
        driver = initializeDriver();
        quesPage = new QuestionnairePage(driver);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        signupPage = new SignupPage(driver);
        loginPage.getUserName().sendKeys(prop.getProperty("user"));
        loginPage.getPassword().sendKeys(prop.getProperty("pwd"));
        loginPage.loginButton().click();
        Thread.sleep(3000);
    }

    @Test
    public void verifyQuestionnaireInfo () throws InterruptedException {
        homePage.getDepositPopup().click();
        //Thread.sleep(3000);
        quesPage.getAccCur().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getLeverage().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getFirstNextBtn().click();
        quesPage.getEmpStatus().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getNatOfBus().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getAnnInc().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getNetWorth().click();
        quesPage.getSelectFromDrpdwn().click();
        //Thread.sleep(5000);
        quesPage.getBankruptcyRadioBtn().click();
        quesPage.getFunds().click();
        //Thread.sleep(3000);
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getAmtofInvest().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getPurposeOfTA().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getUSPRadioBtn().click();
        Thread.sleep(2000);
        quesPage.getUSTin().sendKeys(prop.getProperty("USTIN"));
        quesPage.getPEPRadioBtn().click();
        Thread.sleep(3000);
        quesPage.getNextBtn2().click();
        //Thread.sleep(4000);
        quesPage.getP3F1().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getP3F2().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getP3F3().click();
        quesPage.getP3F4().click();
        quesPage.getP3F5().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getP3F6().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getP3F7().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getP3F8().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getP3F9().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getP3F10().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getP3F11().click();
        quesPage.getSelectFromDrpdwn().click();
        quesPage.getSubmitBtn().click();
        //Thread.sleep(3000);
        quesPage.getContinueBtn().click();
        Thread.sleep(5000);
    }
}

package stepDefinition;

import pages.AfterRegistrationPage;
import pages.HomePage;
import io.cucumber.java.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hook
{
    static public WebDriver driver =null;
    static public String validEmail= "firomadupe@gotgel.org\n";
    static public String validPassword="iti_2022";
    static public boolean isLogin=false;
    AfterRegistrationPage afterRegistrationPage = new AfterRegistrationPage();
    SoftAssert verifyRegistration = new SoftAssert();
    HomePage homePage = new HomePage();

    @BeforeAll
    public static void userOpnes_Browser() throws IOException {
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }

    @AfterAll
    public static void closeBrowser() throws InterruptedException {

        Thread.sleep(2000);
        driver.quit();
    }

    //Repeated steps between tests
    @Given("user navigates to home page")
    public void userNavigatestoHomePage()
    {
        if(!(Hook.driver.getCurrentUrl().equalsIgnoreCase("https://demo.nopcommerce.com/")))
        {
            Hook.driver.navigate().to("https://demo.nopcommerce.com/");
        }
    }
    @And("user should login successfully and see log out button")
    public void userLoginSuccessfullyand()
    {
        verifyRegistration.assertTrue(afterRegistrationPage.logout().isDisplayed(), "Login Process Failed");
        verifyRegistration.assertAll();
        Hook.isLogin=true;
    }
    @Then("user click on log out button")
    public void userClickonLogoutButton()
    {
        if(Hook.isLogin==true) {
            afterRegistrationPage.logout().click();
            verifyRegistration.assertTrue(homePage.login().isDisplayed(), "Logout Process Failed");
            verifyRegistration.assertAll();
            Hook.isLogin = false;
        }
    }
    @Given("user had a valid registered account")
    public void userHadValidRegisteredAccount() {
        Assert.assertTrue((!(Hook.validEmail.isEmpty())),"There's no valid account registered yet");
    }
    @And("user click on log in")
    public void userClickonLogin()
    {
        if(!Hook.isLogin) {
            homePage.login().click();
        }
    }
}

package stepDefinition;

import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import io.cucumber.java.en.And;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Login
{
    HomePage homePage=new HomePage();
    LoginPage loginPage=new LoginPage();

    @And("user fill his or her email")
    public void userFillsEmail() throws IOException {
        if(Hook.isLogin==false) {
            loginPage.email().sendKeys(Hook.validEmail);
        }
    }
    @And("user fill his or her password")
    public void userFillsPassword()
    {
        if(Hook.isLogin==false) {
            loginPage.password().sendKeys(Hook.validPassword);
        }
    }
    @And("user click on log in button")
    public void userClicksonLoginButton() throws InterruptedException {
        Thread.sleep(2000);
        if(Hook.isLogin==false) {
            loginPage.loginButton().click();
        }
    }
    @And("user should to be able to logged in")
    public void userShouldToBeAbletoLoggedin()
    {
        loginPage.loginButton().click();
    }

    @And ("user fills his invalid credentials{string} {string}")
    public void userFillsInvalidCredentials(String Email, String Password)
    {
        loginPage.email().sendKeys(Email);
        loginPage.password().sendKeys(Password);
    }
    @Then("user should not login successfully")
    public void userShouldnotLoginSuccessfully()
    {
        String actualResult = loginPage.errorMessage().getText();
        String expectedResult = "No customer account found";
        Assert.assertEquals(actualResult,expectedResult);
    }
}

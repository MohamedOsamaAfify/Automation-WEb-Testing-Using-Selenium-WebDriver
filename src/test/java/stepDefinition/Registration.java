package stepDefinition;

import pages.AfterRegistrationPage;
import pages.HomePage;
import pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class Registration {
    HomePage homePage = new HomePage();
    RegistrationPage registerPage=new RegistrationPage();
    AfterRegistrationPage afterRegistrationPage=new AfterRegistrationPage();
    SoftAssert verifyRegistration=new SoftAssert();


    @When("user clicks on Register link in upper right")
    public void userclicksonRegisterLink()
    {
            homePage.register().click();
    }

    @And("^user select gender \"(.*?)\"")
    public void userSelectsGender(String Gender)
    {
            if (Gender.equalsIgnoreCase("male")) {
                registerPage.genderMale().click();
            }
            if (Gender.equalsIgnoreCase("female")) {
                registerPage.genderFemale().click();
            }
    }

    @And("^user enter first name \"(.*?)\"")
    public void userEntersFirstName(String firstname)
    {
            registerPage.firstName().sendKeys(firstname);
    }
    @And("^user enter last name \"(.*?)\"")
    public void userEntersLastName(String lastname)
    {
            registerPage.lastName().sendKeys(lastname);
    }

    @And ("^user enter his or her date of birth \"(.*?)\"")
    public void userEntersDateofBirth(String date)
    {
            String[] dateFields = date.split("/");
            registerPage.DateOfBirthDay().selectByValue(dateFields[0]);
            registerPage.DateOfBirthMonth().selectByValue(dateFields[1]);
            registerPage.DateOfBirthYear().selectByValue(dateFields[2]);
    }
    @And ("^user enter his or her email")
    public void userEntersEmail() throws Exception
    {
        registerPage.Email().sendKeys(Hook.validEmail);
    }
    @And ("^user enter his or her company \"(.*?)\"")
    public void userEntersCompany(String company)
    {
            registerPage.Company().sendKeys(company);
    }
    @And ("^user select Newsletter option \"(.*?)\"")
    public void userSelectsNewsletterOption(String state)
    {
            if (state.equalsIgnoreCase("true")) {
                while (!(registerPage.NewsletterState().isSelected()))
                    registerPage.NewsletterState().click();
                while ((registerPage.NewsletterState().isSelected()))
                    registerPage.NewsletterState().click();
                while (!(registerPage.NewsletterState().isSelected()))
                    registerPage.NewsletterState().click();
            } else {
                while ((registerPage.NewsletterState().isSelected()))
                    registerPage.NewsletterState().click();
                while (!(registerPage.NewsletterState().isSelected()))
                    registerPage.NewsletterState().click();
                while ((registerPage.NewsletterState().isSelected()))
                    registerPage.NewsletterState().click();
            }
    }
    @And ("user fill password and confirm password fields with \\(Hook.validPassword) value")
    public void userFillsPasswordandConfirmPassword()
    {
            registerPage.PasswordField().sendKeys(Hook.validPassword);
            registerPage.ConfirmPasswordField().sendKeys(Hook.validPassword);
    }
    @And("user click on register button")
    public void userClicksonRegisterButton() throws InterruptedException {
        Thread.sleep(2000);
        registerPage.register_button().click();
    }
    @Then("^user should see \"(.*?)\" message")
    public void userShouldSeeMessage(String message)
    {
            verifyRegistration.assertEquals(afterRegistrationPage.message().getText(), message, "Registration Process Failed_1");
    }
}

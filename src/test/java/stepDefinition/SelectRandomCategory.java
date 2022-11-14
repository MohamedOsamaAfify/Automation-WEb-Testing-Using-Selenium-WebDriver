package stepDefinition;

import pages.AnyProductPage;
import pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectRandomCategory
{
    HomePage homePage=new HomePage();
    AnyProductPage anyProductPage=new AnyProductPage();
    Random random = new Random();
    int mainRandomNumber ; //this.random.nextInt(7);
    int subRandomNumber;
    String expectedURL;
    @Given("user select random category")
    public void userSelectRandomCategory() throws InterruptedException {
        while (anyProductPage.loadingProgress().isDisplayed())
        {
            //wait until product added to cart
        }
        int numberOfCategories = homePage.categories().size(); // 7
        int numberOfSubCat = homePage.allSubCategories().size();  // 9
        //System.out.println(numberOfCategories+" "+ numberOfSubCat);

        int numberOfAvailableSubCat=0;
        mainRandomNumber = random.nextInt(numberOfCategories);

        Actions action = new Actions(Hook.driver);
        List<WebElement> availableSubCat= new ArrayList<>();   // ~
        action.moveToElement(homePage.categories().get(mainRandomNumber)).build().perform();

        for(int i=0;i<numberOfSubCat;i++)
        {
            if(homePage.allSubCategories().get(i).isDisplayed())
            {
                numberOfAvailableSubCat++;
                availableSubCat.add(homePage.allSubCategories().get(i));
            }
        }
        if(numberOfAvailableSubCat>0)
        {
            subRandomNumber = ((this.random.nextInt(numberOfAvailableSubCat)));
            expectedURL=availableSubCat.get(subRandomNumber).getAttribute("href");
            availableSubCat.get(subRandomNumber).click();
        }
        else
        {
            expectedURL= homePage.categories().get(mainRandomNumber).getAttribute("href");
            homePage.categories().get(mainRandomNumber).click();
        }
            Thread.sleep(1000);
        }
    @Then("user should redirected to the page of the selected category")
    public void userShouldRedirectedToThePageOfTheSelectedCategory()
    {
        SoftAssert chosenCat=new SoftAssert();
        chosenCat.assertEquals(Hook.driver.getCurrentUrl(),expectedURL);
        chosenCat.assertAll();
    }
}

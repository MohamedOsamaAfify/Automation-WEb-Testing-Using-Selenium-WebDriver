package stepDefinition;

import pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

public class SwitchCurrency
{
    HomePage homePage=new HomePage();
    SoftAssert productsPrices=new SoftAssert();

    @Given("user change current currency to EURO")
    public void userChangeCurrentCurrencytoEURO()
    {
        homePage.switchCurrencies().selectByVisibleText("Euro");
    }

    @Then("user should found all products prices in EURO")
    public void userShouldFoundPricesinEURO() throws InterruptedException {
        Thread.sleep(2000);
        int numberOfProducts=homePage.productPrices().size();
        for(int i=0;i<numberOfProducts;i++)
        {
            productsPrices.assertTrue(homePage.productPrices().get(i).getText().contains("€"),
                    "One Of Products Prices In Different Currency From The Selected One");
            productsPrices.assertAll();
        }
    }

    @Given("user change current currency to Dollar")
    public void userChangeCurrentCurrencytoDollar()
    {
        homePage.switchCurrencies().selectByVisibleText("US Dollar");
    }

    @Then("user should found all products prices in Dollar")
    public void userShouldFoundAllPricesinDollar() throws InterruptedException {
        Thread.sleep(4000);
        int numberOfProducts=homePage.productPrices().size();
        for(int i=0;i<numberOfProducts;i++)
        {
            productsPrices.assertEquals(homePage.productPrices().get(i).getText().substring(0,1),"$",
                    "One Of Products Prices In Different Currency From The Selected One");
            productsPrices.assertAll();
        }
    }
}
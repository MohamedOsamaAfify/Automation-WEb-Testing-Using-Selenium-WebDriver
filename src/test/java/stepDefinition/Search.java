package stepDefinition;

import org.testng.Assert;
import pages.HomePage;
import pages.SearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class Search
{
    HomePage homePage=new HomePage();
    SearchResultPage searchResultPage=new SearchResultPage();
    SoftAssert searchResult= new SoftAssert();
    String searchTerm=null;

    @Given("user clicks on search field")
    public void userClickOnSearchField()
    {
        homePage.searchField().click();
    }
    @And("^user types what he or she want to search \"(.*?)\"")
    public void userTypeWhatHeOrSheWantToSearch(String searchTerm)
    {
        homePage.searchField().sendKeys(searchTerm);
        this.searchTerm=searchTerm;
    }
    @And("user clicks on search button")
    public void userClickOnSearchButton()
    {
        homePage.searchButton().click();
    }

    @Then("user could find relative results")
    public void userCouldFindRelativeResults() throws InterruptedException {
        Thread.sleep(1500);
        int numberOfItems = searchResultPage.productList().size();
        int check;
        searchResult.assertFalse(numberOfItems <= 0,"No Relevant Search Items For This Search Term");
        searchResult.assertAll();
        ArrayList<String> resultProductList =new ArrayList();
        for(int i = 0; i < numberOfItems; i++)
        {
            resultProductList.add(searchResultPage.productList().get(i).getText());
            //System.out.println(resultProductList);

            searchResult.assertTrue(resultProductList.get(i).toLowerCase().contains(searchTerm)
                    ,"No Relevant Search Items For This Search Term");
            searchResult.assertAll();
        }
    }
}

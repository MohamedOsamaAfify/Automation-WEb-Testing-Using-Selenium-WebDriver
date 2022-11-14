package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinition.Hook;
import java.util.List;

public class HomePage
{
    public WebElement register ()
    {
        return Hook.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement login ()
    {
        return Hook.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }
    public WebElement searchField ()
    {
        return Hook.driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
    }
    public WebElement searchButton ()
    {
        return Hook.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    /*******/
    public Select switchCurrencies()
    {
//        WebElement switchCurrencies= Hook.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
//        Select Currencies = new Select(switchCurrencies);
//        return Currencies;
        WebElement switchCurrencies= Hook.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
        return new Select(switchCurrencies);
    }
    public List<WebElement> productPrices ()
    {
//        List <WebElement> productPrices = Hook.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
//        return productPrices;
        return Hook.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
    public List<WebElement> categories ()
    {
//        List <WebElement> categories = Hook.driver.findElements(By.xpath("//div[@class=\"header-menu\"]//child::ul[@class=\"top-menu notmobile\"]/li/a"));
//        return categories;
        return Hook.driver.findElements(By.xpath("//div[@class=\"header-menu\"]//child::ul[@class=\"top-menu notmobile\"]/li/a"));
    }
    public List<WebElement> allSubCategories ()
    {
//        List <WebElement> allSubCategories = Hook.driver.findElements(By.xpath("//div[@class=\"header-menu\"]//child::ul[@class=\"top-menu notmobile\"]//li//ul//li//a"));
//        return allSubCategories;
        return Hook.driver.findElements(By.xpath("//div[@class=\"header-menu\"]//child::ul[@class=\"top-menu notmobile\"]//li//ul//li//a"));
    }
    public WebElement apparelCategory ()
    {
//        WebElement apparelCategory= Hook.driver.findElement(By.xpath("(//div[@class=\"header-menu\"] //child::ul[@class=\"top-menu notmobile\"]//li //a //following-sibling::div //preceding-sibling::a)[3]"));
//        return apparelCategory;
        return Hook.driver.findElement(By.xpath("(//div[@class=\"header-menu\"] //child::ul[@class=\"top-menu notmobile\"]//li //a //following-sibling::div //preceding-sibling::a)[3]"));
    }
    public WebElement shoesSubCategory ()
    {
//        WebElement shoesSubCategory= Hook.driver.findElement(By.xpath("((//div[@class=\"header-menu\"] //child::ul[@class=\"top-menu notmobile\"]//li //a //following-sibling::div //preceding-sibling::a) [3] //following-sibling::ul //child::li) [1]//a"));
//        return shoesSubCategory;
        return Hook.driver.findElement(By.xpath("((//div[@class=\"header-menu\"] //child::ul[@class=\"top-menu notmobile\"]//li //a //following-sibling::div //preceding-sibling::a) [3] //following-sibling::ul //child::li) [1]//a"));
    }
}

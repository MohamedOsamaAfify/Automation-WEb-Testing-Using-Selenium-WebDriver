package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinition.Hook;

import java.util.List;

public class HomePage {
    public WebElement register() {
        return Hook.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }

    public WebElement login() {
        return Hook.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }

    public WebElement searchField() {
        return Hook.driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
    }

    public WebElement searchButton() {
        return Hook.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    /*******/
    public Select switchCurrencies() {
        WebElement switchCurrencies = Hook.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
        return new Select(switchCurrencies);
    }

    public List<WebElement> productPrices() {
        return Hook.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    public List<WebElement> categories() {
        return Hook.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a")); }

    public List<WebElement> allSubCategories() {
        return Hook.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]//li//ul//li//a")); }
}

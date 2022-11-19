package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hook;

import java.util.List;

public class SearchResultPage
{
    public List <WebElement> productList ()
    { return Hook.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")); } //a
}

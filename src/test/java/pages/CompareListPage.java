package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hook;

import java.util.List;

public class CompareListPage
{
    public List<WebElement> productName ()
    {
        return Hook.driver.findElements(By.xpath("tr[@class=\"product-name\"]/td/a"));
    }
}
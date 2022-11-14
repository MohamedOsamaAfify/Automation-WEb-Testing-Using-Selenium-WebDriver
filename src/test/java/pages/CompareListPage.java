package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hook;

import java.util.List;

public class CompareListPage
{
    public List<WebElement> productName ()
    {
        List <WebElement> productName = Hook.driver.findElements(By.xpath("//div[@class=\"table-wrapper\"]//tbody/tr[@class=\"product-name\"]/td/a"));
        return productName;
    }
}

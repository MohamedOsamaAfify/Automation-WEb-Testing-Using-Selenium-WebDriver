package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hook;

import java.util.List;

public class WishlistPage
{
    public List<WebElement> productName ()
    {
        return Hook.driver.findElements(By.xpath("//td[@class=\"product\"]/a"));
    }
}

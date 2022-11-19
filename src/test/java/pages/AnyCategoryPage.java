package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hook;

import java.util.List;

public class AnyCategoryPage
{
    public List <WebElement> productListInStock ()
    { return Hook.driver.findElements(By.xpath("//h2[@class=\"product-title\"]/a")); }
}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hook;

import java.util.List;

public class AnyCategoryPage
{
    public List <WebElement> productListInStock ()
    {
        List <WebElement> productTitles = Hook.driver.findElements(By.xpath("//button[@class=\"button-2 product-box-add-to-cart-button\"]//ancestor::div[@class=\"add-info\"]//preceding-sibling::h2[@class=\"product-title\"]/a"));
        return productTitles;
    }
}

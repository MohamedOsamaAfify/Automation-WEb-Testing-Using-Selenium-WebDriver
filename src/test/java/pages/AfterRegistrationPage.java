package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hook;

public class AfterRegistrationPage
{
    public WebElement message ()
    { return Hook.driver.findElement(By.cssSelector("div[class=\"result\"]")); }
    public WebElement logout ()
    { return Hook.driver.findElement(By.cssSelector("a[class=\"ico-logout\"]")); }
}

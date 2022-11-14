package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hook;

public class AfterRegistrationPage
{
    public WebElement message ()
    {
        WebElement message= Hook.driver.findElement(By.cssSelector("div[class=\"result\"]"));
        return message;
    }
    public WebElement logout ()
    {
        WebElement logout = Hook.driver.findElement(By.cssSelector("a[class=\"ico-logout\"]"));
        return logout;
    }
}

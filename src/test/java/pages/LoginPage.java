package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hook;

public class LoginPage
{
    public WebElement email ()
    {
        return Hook.driver.findElement(By.cssSelector("input[class=\"email\"]"));
    }
    public WebElement password ()
    {
        return Hook.driver.findElement(By.cssSelector("input[class=\"password\"]"));
    }
    public WebElement loginButton ()
    {
        return Hook.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public WebElement forgotPassword ()
    {
        return Hook.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));
    }
    public WebElement errorMessage()
    {
        return Hook.driver.findElement
                (By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]/ul/li"));
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hook;

public class PasswordRecoveryPage
{
    public WebElement Email ()
    {
        return Hook.driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }
    public WebElement RecoverButton()
    { return Hook.driver.findElement(By.cssSelector("button[class=\"button-1 password-recovery-button\"]")); }
    public WebElement message()
    {
        return Hook.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }
}

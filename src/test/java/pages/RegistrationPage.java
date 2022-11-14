package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinition.Hook;

public class RegistrationPage
{
    public WebElement genderMale ()
    {
        return Hook.driver.findElement(By.cssSelector("input[value=\"M\"]"));
    }
    public WebElement genderFemale ()
    {
        return Hook.driver.findElement(By.cssSelector("input[value=\"F\"]"));
    }
    public WebElement firstName ()
    {
        return Hook.driver.findElement(By.cssSelector("input[id=\"FirstName\"]"));
    }
    public WebElement lastName ()
    {
        return Hook.driver.findElement(By.cssSelector("input[id=\"LastName\"]"));
    }
    public Select DateOfBirthDay ()
    {
        WebElement DateOfBirthDay= Hook.driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"]"));
        Select Day = new Select(DateOfBirthDay);
        return Day;
    }
    public Select DateOfBirthMonth ()
    {
        WebElement DateOfBirthMonth= Hook.driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"]"));
        Select Month = new Select(DateOfBirthMonth);
        return Month;
    }
    public Select DateOfBirthYear ()
    {
        WebElement DateOfBirthYear= Hook.driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"]"));
        Select Year = new Select(DateOfBirthYear);
        return Year;
    }
    public WebElement Email ()
    {
        return Hook.driver.findElement(By.cssSelector("input[id=\"Email\"]"));
    }
    public WebElement Company ()
    {
        return Hook.driver.findElement(By.cssSelector("input[id=\"Company\"]"));
    }
    public WebElement NewsletterState ()
    {
        return Hook.driver.findElement(By.cssSelector("input[id=\"Newsletter\"]"));
    }
    public WebElement PasswordField ()
    {
        return Hook.driver.findElement(By.cssSelector("input[id=\"Password\"]"));
    }
    public WebElement ConfirmPasswordField ()
    {
        return Hook.driver.findElement(By.cssSelector("input[id=\"ConfirmPassword\"]"));
    }
    public WebElement register_button ()
    {
        return Hook.driver.findElement(By.cssSelector("button[id=\"register-button\"]"));
    }
}

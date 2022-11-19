package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinition.Hook;

import java.util.List;

public class ShoppingCartPage
{
    public List<WebElement> productName ()
    {
        return Hook.driver.findElements(By.xpath("//td[@class=\"product\"]/a"));
    }
    public WebElement termsOfService ()
    { return Hook.driver.findElement(By.xpath("//input[@id=\"termsofservice\"]")); }
    public WebElement checkoutButton ()
    { return Hook.driver.findElement(By.xpath("//button[@id=\"checkout\"]")); }
    public Select country ()
    {
        WebElement countryList= Hook.driver.findElement(By.xpath("//select[@id=\"BillingNewAddress_CountryId\"]"));
        return new Select(countryList);
    }
    public WebElement city ()
    { return Hook.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_City\"]")); }
    public WebElement address ()
    { return Hook.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_Address1\"]")); }
    public WebElement zipCode ()
    { return Hook.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]")); }
    public WebElement phoneNumber ()
    { return Hook.driver.findElement(By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]")); }
    public WebElement firstContinueButton ()
    { return Hook.driver.findElement(By.xpath("//button[@onclick=\"Billing.save()\"]")); }
    public WebElement secondContinueButton ()
    { return Hook.driver.findElement(By.xpath("//button[@onclick=\"ShippingMethod.save()\"]")); }
    public WebElement thirdContinueButton ()
    { return Hook.driver.findElement(By.xpath("//button[@onclick=\"PaymentMethod.save()\"]")); }
    public WebElement fourthContinueButton ()
    { return Hook.driver.findElement(By.xpath("//button[@onclick=\"PaymentInfo.save()\"]")); }
    public WebElement confirmOrderButton ()
    { return Hook.driver.findElement(By.xpath("//button[@onclick=\"ConfirmOrder.save()\"]")); }
    public WebElement confirmedOrderTextElement ()
    { return Hook.driver.findElement(By.xpath("//div[@class=\"page-body checkout-data\"]/div/div/strong")); }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import stepDefinition.Hook;

import java.util.concurrent.TimeUnit;


public class AnyProductPage
{
    public boolean isAddToCartButton()
    {
        boolean isAddToCartButton = false;
        Hook.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

             WebElement button = Hook.driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]"));
             if (button != null)
                 isAddToCartButton=true;
             else
                 isAddToCartButton=false;

        Hook.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return isAddToCartButton;
    }
    public WebElement addToCartButton()
    {
        return Hook.driver.findElement(By.xpath("//button[@class=\"button-1 add-to-cart-button\"]"));
    }
    public boolean isAddedToCartSuccessNotification()
    {
        boolean isAddedToCartSuccessNotification=false;
        Hook.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            Hook.driver.findElement(By.xpath("//div[@class=\"bar-notification success\"]"));
            isAddedToCartSuccessNotification=true;
        }
        catch (NoSuchElementException e)
        {
            isAddedToCartSuccessNotification=false;
        }
        Hook.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return isAddedToCartSuccessNotification;
    }
    public WebElement loadingProgress()
    {
        return Hook.driver.findElement(By.xpath("//div[@class=\"ajax-loading-block-window\"]"));
    }
    public boolean isProductHasAttributes()
    {
        boolean isProductHasAttributes=false;
        Hook.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            Hook.driver.findElement(By.xpath("//div[contains(@class,'attributes')]"));
            isProductHasAttributes=true;
        }
        catch (NoSuchElementException e)
        {
            isProductHasAttributes=false;
        }
        Hook.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return isProductHasAttributes;
    }
    public boolean isProductGiftCard()
    {
        boolean isProductGiftCard=false;
        Hook.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            Hook.driver.findElement(By.xpath("//div[@class=\"giftcard\"]"));
            isProductGiftCard=true;
        }
        catch (NoSuchElementException e)
        {
            isProductGiftCard=false;
        }
        Hook.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return isProductGiftCard;
    }
    public WebElement productName()
    {
        return Hook.driver.findElement(By.xpath("//div[@class=\"product-name\"]/h1"));
    }
    public WebElement shoppingCart()
    {
        return Hook.driver.findElement(By.xpath("//a[@class=\"ico-cart\"]"));
    }
    public boolean availability()
    {
        boolean availability=false;
        Hook.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            availability= Hook.driver.findElement(By.xpath("//div[@class=\"availability\"]//following-sibling::span[@class=\"value\"]")).getText().equalsIgnoreCase("In stock");
        }
        catch (NoSuchElementException e)
        {
            availability=false;
        }
        Hook.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        return availability;
    }
    public WebElement addToWishlistButton()
    {
        return Hook.driver.findElement(By.xpath("//div[@class=\"add-to-wishlist\"]/button"));
    }
    public WebElement wishlist()
    {
        return Hook.driver.findElement(By.xpath("//a[@href=\"/wishlist\" and @class=\"ico-wishlist\"]"));
    }
    public WebElement addToCompareList()
    {
        return Hook.driver.findElement(By.xpath("//div[@class=\"compare-products\"]/button"));
    }
    public WebElement compareList()
    {
        return Hook.driver.findElement(By.xpath("//a[@href=\"/compareproducts\"]"));
    }
}

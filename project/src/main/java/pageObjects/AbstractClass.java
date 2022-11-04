package pageObjects;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;

public abstract class AbstractClass {
    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10)); // nereye yazarsak 10 saniye bekler
    public void clickFunction(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }
    public void sendKeysFunction(WebElement sendKeysElement,String value){
        wait.until((ExpectedConditions.visibilityOf(sendKeysElement)));
        sendKeysElement.sendKeys(value);
    }
    public void selectElementFromDropdown(WebElement dropdown,String element){
        Select select= new Select(dropdown);
        select.selectByVisibleText(element);
    }
   /* public void assertion(WebElement actual,String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));

        Assert.assertEquals(actual.getText(),expected);
        System.out.println("my message:"+ actual.getText());
    }*/
}

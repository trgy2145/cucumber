package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactUs_Page extends AbstractClass{
    WebDriver driver;
    public ContactUs_Page(){
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "contact-link")
    private WebElement contactUsElement;

    public void clickContactUsElement(){
        clickFunction(contactUsElement);
    }
}

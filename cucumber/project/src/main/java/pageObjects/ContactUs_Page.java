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
    @FindBy(xpath = "//select[@id='id_contact']")
    private WebElement subjectHeadingDropDown;

    public void selectDropDown(){
        selectElementFromDropdown(subjectHeadingDropDown,"Webmaster");
    }
     @FindBy(xpath = "//input[@id='email']")
    private WebElement eMailAddress;
    public void eMailInput(){
        sendKeysFunction(eMailAddress,"tyy@gmail.com");

    }
  @FindBy(id = "id_order")
    private WebElement orderRef;

    public void orderReference(){
        sendKeysFunction(orderRef,"alican");
    }
   @FindBy(xpath = "//textarea[@id='message']")
    private WebElement message;

    public void messageArea(){
        sendKeysFunction(message,"Ne zaman isterseniz paket hazır..");
    }
    @FindBy(id = "submitMessage")
    private WebElement submitButton;

    public void sendButton(){
        clickFunction(submitButton);
    }
    @FindBy(css = "p.alert-success")
    private WebElement verifyString;

    public void verify(){
        assertion(verifyString,"Your message has been successfully sent to our team.");
    }


}

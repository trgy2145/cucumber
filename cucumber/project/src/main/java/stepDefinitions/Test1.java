package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pageObjects.ContactUs_Page;
import utilities.Driver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Test1 {
    private WebDriver driver;
    ContactUs_Page contactUs_page =new ContactUs_Page();

    @Given("navigate to website")
    public void navigate_to_website() {
        // Write code here that turns the phrase above into concrete actions
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



    }
    @Given("click to Contact us")
    public void click_to_contact_us() {
        // Write code here that turns the phrase above into concrete actions
        contactUs_page.clickContactUsElement();

    }
    @Given("choose Subject Heading")
    public void choose_subject_heading() {
        // Write code here that turns the phrase above into concrete actions
        contactUs_page.selectDropDown();
    }
    @Given("enter Email address")
    public void enter_email_address() {
        // Write code here that turns the phrase above into concrete actions
        contactUs_page.eMailInput();

    }
    @Given("enter Order reference")
    public void enter_order_reference() {
        // Write code here that turns the phrase above into concrete actions
        contactUs_page.orderReference();

    }
    @Given("enter Message")
    public void enter_message() {
        // Write code here that turns the phrase above into concrete actions
        contactUs_page.messageArea();

    }
    @When("click on send button")
    public void click_on_send_button() {
        contactUs_page.sendButton();

    }
   /* @Then("verify success message")
    public void verify_success_message(){
        contactUs_page.verify();
    }*/


}

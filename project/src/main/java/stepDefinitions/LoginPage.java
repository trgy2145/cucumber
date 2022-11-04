package stepDefinitions;




import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
    @Given("Go to amazon website")
    public void go_to_amazon_website() throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        System.out.println("we are amazon website");
    }
    @Given("Click Login button")
    public void click_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("we have clicked login button");
    }
    @Given("Enter Name")
    public void enter_name() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("we have entered name");
    }
    @Given("Enter password")
    public void enter_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("we have entered password");
    }
    @When("Click on the submit button")
    public void click_on_the_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("we have clicked on the submit button");
    }
    @Then("verify success message")
    public void verify_success_message() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("and we have received success message");
    }
}

package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class QualityDemyStepdefinitions {

    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Then("click firstpage's login link")
    public void click_firstpage_s_login_link() {
        // Write code here that turns the phrase above into concrete actions
        qualitydemyPage.firstLoginLink.click();
    }
    @Then("write {string} in the userbox")
    public void write_in_the_userbox(String userNAme) {
        // Write code here that turns the phrase above into concrete actions
        qualitydemyPage.UserEmailBox.sendKeys(ConfigReader.getProperty(userNAme));
    }
    @Then("write {string} in the passwordbox")
    public void write_in_the_passwordbox(String password) {
        // Write code here that turns the phrase above into concrete actions

        qualitydemyPage.passwordBox.sendKeys(ConfigReader.getProperty(password));

    }
    @Then("click the login button")
    public void click_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        qualitydemyPage.loginButton.click();
    }
    @Then("test success login")
    public void test_success_login() {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(qualitydemyPage.successfullLoginLink.isDisplayed());
    }

    @And("accept cookies")
    public void acceptCookies() {
        qualitydemyPage.AcceptCokies.click();
    }

    @And("{int} second wait")
    public void secondWait(int second) {
        Driver.wait(5);
    }

    @And("test unsuccess login")
    public void testUnsuccessLogin() {
        Assert.assertTrue(qualitydemyPage.UserEmailBox.isDisplayed());
    }
}

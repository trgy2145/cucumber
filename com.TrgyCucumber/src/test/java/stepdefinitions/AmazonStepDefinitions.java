package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.Amazonpage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    Amazonpage amazonpage =new Amazonpage();
    @Given("user get the amazon page")
    public void user_get_the_amazon_page() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("user write on the searchbox and searches it.")
    public void user_write_on_the_searchbox_and_searches_it() {
        amazonpage.amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);

    }
    @Then("user tests it whether the result contain Nutella or not")
    public void user_tests_it_whether_the_result_contain_nutella_or_not() {
        String actualSearchText = amazonpage.searchResult.getText();
        String expectedText = "Nutella";
        Assert.assertTrue(actualSearchText.contains(expectedText));

    }
    @Then("close the page")
    public void close_the_page() {
        Driver.closeDriver();

    }

    @Then("user write on the Java and searches it.")
    public void userWriteOnTheJavaAndSearchesIt() {
        amazonpage =new Amazonpage();
        amazonpage.amazonSearchBox.sendKeys("Java"+ Keys.ENTER);
    }

    @And("user tests it whether the result contain Java or not")
    public void userTestsItWhetherTheResultContainJavaOrNot() {
        String actualSearchText = amazonpage.searchResult.getText();
        String expectedText = "Java";
        Assert.assertTrue(actualSearchText.contains(expectedText));
    }
    @Then("user write on the Samsung and searches it.")
    public void user_write_on_the_samsung_and_searches_it() {
        amazonpage =new Amazonpage();
        // Write code here that turns the phrase above into concrete actions
        amazonpage.amazonSearchBox.sendKeys("Samsung"+ Keys.ENTER);

    }
    @Then("user tests it whether the result contain Samsung or not")
    public void user_tests_it_whether_the_result_contain_samsung_or_not() {
        // Write code here that turns the phrase above into concrete actions
        String actualSearchText = amazonpage.searchResult.getText();
        String expectedText = "Samsung";
        Assert.assertTrue(actualSearchText.contains(expectedText));
    }

    @Then("user write {string} on the searchbox and searches it.")
    public void userWriteOnTheSearchboxAndSearchesIt(String searchedWord) {

        amazonpage =new Amazonpage();
        // Write code here that turns the phrase above into concrete actions
        amazonpage.amazonSearchBox.sendKeys(searchedWord+ Keys.ENTER);
    }

    @And("user tests it whether the result contain {string} or not")
    public void userTestsItWhetherTheResultContainOrNot(String searchedWord) {
        String actualSearchText = amazonpage.searchResult.getText();

        Assert.assertTrue(actualSearchText.contains(searchedWord));
    }

    @Given("user get {string} page")
    public void userGetPage(String searchedUrl) {  // burdan ya wqurl ya amazonurl yada walmarturl gelir
        Driver.getDriver().get(ConfigReader.getProperty(searchedUrl));
    }

    @Then("test it that there is {string} in the url")
    public void testItThatThereIsInTheUrl(String searchedWord) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(searchedWord));
    }
}

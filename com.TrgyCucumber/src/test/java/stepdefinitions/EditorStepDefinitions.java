package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorPage;

public class EditorStepDefinitions {
    EditorPage editorPage = new EditorPage();

    @Then("click the new button")
    public void click_the_new_button() {
        editorPage.newButtonElemen.click();

    }
    @Then("write the {string} in the firstnamebox")
    public void write_the_in_the_firstnamebox(String firstName) {
        editorPage.firstNameBox.sendKeys(firstName);
    }
    @Then("write the {string} in the Lastnamebox")
    public void write_the_in_the_lastnamebox(String lastName) {
        editorPage.lastNameBox.sendKeys(lastName);
    }
    @Then("write the {string} in the positionbox")
    public void write_the_in_the_positionbox(String position) {
        editorPage.positionBox.sendKeys(position);
    }
    @Then("write the {string} in the officebox")
    public void write_the_in_the_officebox(String office) {
        editorPage.officeBox.sendKeys(office);
    }
    @Then("write the {string} in the extensionbox")
    public void write_the_in_the_extensionbox(String extension) {
        editorPage.extensionBox.sendKeys(extension);
    }
    @Then("write the {string} in the startDatebox")
    public void write_the_in_the_start_datebox(String startDate) {
        // Write code here that turns the phrase above into concrete actions
        editorPage.startDateBox.sendKeys(startDate);
    }
    @Then("write the {string} in the salarybox")
    public void write_the_in_the_salarybox(String salary) {
        editorPage.salaryBox.sendKeys(salary);
    }
    @Then("click the Create button")
    public void click_the_create_button() {
        editorPage.crateButton.click();
    }
    @When("user search {string}")
    public void user_search(String firstName) {
        editorPage.searchBox.sendKeys(firstName+ Keys.ENTER);
    }
    @Then("valid your {string} on the name section")
    public void valid_your_on_the_name_section(String firstName) {
        String actualFirstName = editorPage.firstNameElement.getText();

        Assert.assertTrue(actualFirstName.contains(firstName));


    }
}

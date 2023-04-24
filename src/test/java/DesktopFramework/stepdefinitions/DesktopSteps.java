package DesktopFramework.stepdefinitions;

import DesktopFramework.Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DesktopSteps {


    LoginPage loginPage = new LoginPage();



    @Given("I have opened the Excel app")
    public void iHaveOpenedTheExcelApp() throws InterruptedException {
//        loginPage.clickMaximise();
        Thread.sleep(3000);
    }

    @When("I select New")
    public void iSelect() {
        loginPage.clickNew();

    }

    @And("I click Simple Gantt Chart from the templates")
    public void iClickFromTheTemplates() throws InterruptedException {
        loginPage.ClickGanttChart();

    }

    @Then("the title will be {string}.")
    public void theTitleWillBe(String text) throws InterruptedException {
        loginPage.CheckGanttChart(text);
        Thread.sleep(2000);
    }


    @When("I select a new Gantt Chart")
    public void iSelectNewGanttChart() {
        loginPage.clickNew();
        loginPage.ClickGanttChart();

    }

    @And("I click help from the title bar")
    public void iClickHelpFromTheTitleBar() {
        loginPage.clickHelpTab();
    }

    @And("I click the Contact Support icon")
    public void iClickTheContactSupportIcon() {
        loginPage.clickContactSupport();

    }

    @Then("the get help button will appear on the right hand side of the page")
    public void theGetHelpButtonWillAppearOnTheRightHandSideOfThePage() {
        loginPage.verifyGetHelpButton();
    }

    @When("I Select the account option")
    public void iSelectTheAccountOption() {
        loginPage.clickFile();
        loginPage.clickAccountButton();

    }

    @Then("my name will appear under User Information")
    public void myNameWillAppearUnderUserInformation() {
//        loginPage.verifyName();
    }

    @Then("my {string} will appear under User Information")
    public void myWillAppearUnderUserInformation(String name) {
        loginPage.verifyName(name);
    }

    @When("I click file")
    public void iClickFile() {
        loginPage.clickFile();
        
    }

    @And("open")
    public void open() {
        loginPage.clickOpen();
        
    }

    @And("I search the term Desktop Test")
    public void iSearchTheTermDESKTOPTEST() {
        loginPage.SearchingAFile();
        
    }

    @And("I click on the document that appears")
    public void iClickOnTheDocumentThatAppears() {
        loginPage.clickingAfile();

    }


    @Then("I will be able to enter text into the page")
    public void iWillBeAbleToEnterTextIntoThePage() {
        loginPage.clickingBlankCell();
    }
}



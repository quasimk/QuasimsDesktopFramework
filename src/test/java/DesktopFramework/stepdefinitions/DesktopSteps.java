package DesktopFramework.stepdefinitions;
import DesktopFramework.Pages.homepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DesktopSteps {


    homepage homepage = new homepage();



    @Given("I have opened the Excel app")
    public void iHaveOpenedTheExcelApp() throws InterruptedException {
//        loginPage.clickMaximise();
        Thread.sleep(3000);
    }

    @When("I have selected New")
    public void iSelect() {
       homepage.clickNew();

    }

    @And("I click Simple Gantt Chart from the templates")
    public void iClickFromTheTemplates() throws InterruptedException {
        homepage.clickGanttChart();

    }

    @Then("the title will be {string}.")
    public void theTitleWillBe(String text) throws InterruptedException {
        homepage.checkGanttChart(text);
        Thread.sleep(2000);
    }


    @When("I have selected a new Gantt Chart")
    public void iSelectNewGanttChart() {
        homepage.clickNew();
        homepage.clickGanttChart();

    }

    @And("I click help from the title bar")
    public void iClickHelpFromTheTitleBar() {
        homepage.clickHelpTab();
    }

    @And("I click the Contact Support icon")
    public void iClickTheContactSupportIcon() {
        homepage.clickContactSupport();

    }

    @Then("the get help button will appear on the right hand side of the page")
    public void theGetHelpButtonWillAppearOnTheRightHandSideOfThePage() {
        homepage.verifyGetHelpButton();
    }

    @When("I have selected the account option")
    public void iSelectTheAccountOption() {
        homepage.clickFile();
        homepage.clickAccountButton();

    }


    @Then("my {string} will appear under User Information")
    public void myWillAppearUnderUserInformation(String name) {
        homepage.verifyName(name);
    }

    @When("I have clicked the file button")
    public void iClickFile() {
        homepage.clickFile();
        
    }

    @And("open")
    public void open() {
        homepage.clickOpen();
        
    }

    @And("I search the term Desktop Test")
    public void iSearchTheTermDESKTOPTEST() {
        homepage.searchingAFile();
        
    }

    @And("I click on the document that appears")
    public void iClickOnTheDocumentThatAppears() {
        homepage.clickingAfile();

    }


    @Then("I will be able to enter text into the page")
    public void iWillBeAbleToEnterTextIntoThePage() {
        homepage.clickingBlankCell();
    }
}



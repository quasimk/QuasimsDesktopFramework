package DesktopFramework.Pages;

import io.appium.java_client.windows.WindowsDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

import static DesktopFramework.Desktopdriver.driver.getDriver;

public class LoginPage {
    private By MinimiseButton = By.name("Minimise");
    private By GantProjectPlanner = By.name("Gantt project planner");
    private By NewButton = By.name("Name Box");
    private By Create = By.name("Create");
    private By File = By.name("File Tab");
    private By BlankWorkbook = By.name("Blank workbook");
    private By HelpTab = By.name("Help");
    private By ContactSupportButton = By.name("Contact Support...");
    private By VerifyGanttChart = By.name("Gantt project planner1 - Excel");
    private By VerifyGetHelpButton = By.name("Get Help");
    private By AccountButton = By.name("Account");
    private By VerifyName = By.name("Qas Khan");
    private By OpenButton = By.name("Open");
    private By SearchBox = By.name("Search");
    private By DocumentName = By.name("desktop test.xlsx");
    private By BlankCell = By.name("L5");

    public WindowsDriver driver;
    public void clickMaximise(){
        getDriver().findElement(MinimiseButton).click();


    }

    public void clickNew() {
        getDriver().findElement(NewButton).click();

    }
    public void ClickGanttChart()  {

        getDriver().findElement(File).click();
    getDriver().findElement(GantProjectPlanner).click();

    getDriver().findElement(Create).click();


    }
    public void CheckGanttChart(String text){
   String Title = getDriver().findElement(VerifyGanttChart).getText();
   System.out.println(Title);
        Assert.assertEquals(Title, text);

    }
    public void clickBlankWorkbook(){
        getDriver().findElement(BlankWorkbook).click();

    }
    public void clickHelpTab(){
        getDriver().findElement(HelpTab).click();

    }
    public void clickContactSupport(){
        getDriver().findElement(ContactSupportButton).click();

    }
    public void verifyGetHelpButton(){
        getDriver().findElement(VerifyGetHelpButton).isDisplayed();
    }
    public void clickAccountButton(){
        getDriver().findElement(AccountButton).click();
    }
    public void verifyName(String name){
        String Name = getDriver().findElement(VerifyName).getText();
        System.out.println(Name);
        Assert.assertEquals(Name, name);
    }
    public void clickFile(){
        getDriver().findElement(File).click();
    }
    public void clickOpen(){
        getDriver().findElement(OpenButton).click();
    }
    public void SearchingAFile(){
        getDriver().findElement(SearchBox).sendKeys("Desktop Test");
    }
    public void clickingAfile(){
        getDriver().findElement(DocumentName).click();
    }
    public void clickingBlankCell(){
        getDriver().findElement(BlankCell).sendKeys("Testerrrr");
    }







}


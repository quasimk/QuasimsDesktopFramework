package DesktopFramework.Pages;

import io.appium.java_client.windows.WindowsDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

import static DesktopFramework.Desktopdriver.driver.getDriver;

public class homepage {
    private By accountButton = By.name("Account");
    private By blankWorkbook = By.name("Blank workbook");
    private By blankCell = By.name("L5");
    private By contactSupportButton = By.name("Contact Support...");
    private By create = By.name("Create");
    private By documentName = By.name("desktop test.xlsx");
    private By file = By.name("File Tab");
    private By gantProjectPlanner = By.name("Gantt project planner");
    private By helpTab = By.name("Help");
    private By minimiseButton = By.name("Minimise");
    private By newButton = By.name("Name Box");
    private By openButton = By.name("Open");
    private By searchBox = By.name("Search");
    private By verifyGanttChart = By.name("Gantt project planner1 - Excel");
    private By verifyGetHelpButton = By.name("Get Help");
    private By verifyName = By.name("Qas Khan");




    public WindowsDriver driver;
    public void clickMaximise(){
        getDriver().findElement(minimiseButton).click();


    }

    public void clickNew() {
        getDriver().findElement(newButton).click();

    }
    public void clickGanttChart()  {

        getDriver().findElement(file).click();
    getDriver().findElement(gantProjectPlanner).click();

    getDriver().findElement(create).click();


    }
    public void checkGanttChart(String text){
   String Title = getDriver().findElement(verifyGanttChart).getText();
   System.out.println(Title);
        Assert.assertEquals(Title, text);

    }
    public void clickBlankWorkbook(){
        getDriver().findElement(blankWorkbook).click();

    }
    public void clickHelpTab(){
        getDriver().findElement(helpTab).click();

    }
    public void clickContactSupport(){
        getDriver().findElement(contactSupportButton).click();

    }
    public void verifyGetHelpButton(){
        getDriver().findElement(verifyGetHelpButton).isDisplayed();
    }
    public void clickAccountButton(){
        getDriver().findElement(accountButton).click();
    }
    public void verifyName(String name){
        String Name = getDriver().findElement(verifyName).getText();
        System.out.println(Name);
        Assert.assertEquals(Name, name);
    }
    public void clickFile(){
        getDriver().findElement(file).click();
    }
    public void clickOpen(){
        getDriver().findElement(openButton).click();
    }
    public void searchingAFile(){
        getDriver().findElement(searchBox).sendKeys("Desktop Test");
    }
    public void clickingAfile(){
        getDriver().findElement(documentName).click();
    }
    public void clickingBlankCell(){
        getDriver().findElement(blankCell).sendKeys("Testerrrr");
    }



}


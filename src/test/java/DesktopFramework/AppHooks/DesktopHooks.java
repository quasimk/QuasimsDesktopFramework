package DesktopFramework.AppHooks;

import DesktopFramework.Desktopdriver.driver;
import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;
import java.net.MalformedURLException;

public class DesktopHooks extends DesktopFramework.Desktopdriver.driver {
    public WindowsDriver driver;
    @Before
    public void StartUp() throws IOException {
        driver = Setup();

    }
    @After(order=0)
    public void CloseApp() {
        driver.close();

    }
    @After(order= 1)
    public void takeScreenshotOnFailure(Scenario scenario){
        if (scenario.isFailed()){
            String screenshotDescription = scenario.getName().replaceAll(" ", "_");

            byte[] src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(src,"image/png", screenshotDescription);
        }

    }


}

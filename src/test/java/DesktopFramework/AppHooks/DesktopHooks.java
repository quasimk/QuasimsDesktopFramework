package DesktopFramework.AppHooks;

import DesktopFramework.Desktopdriver.driver;
import io.appium.java_client.windows.WindowsDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.io.IOException;
import java.net.MalformedURLException;

public class DesktopHooks extends DesktopFramework.Desktopdriver.driver {
    public WindowsDriver driver;
    @Before
    public void StartUp() throws IOException {
        driver = Setup();

    }
    @After
    public void CloseApp() {
        driver.close();

    }
}

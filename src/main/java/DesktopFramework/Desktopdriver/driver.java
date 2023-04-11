package DesktopFramework.Desktopdriver;


import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class driver {
    public static WindowsDriver driver;
    Desktop desktop = Desktop.getDesktop();

    public WindowsDriver Setup() throws IOException {
        desktop.open(new File("C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe"));

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE");
        capabilities.setCapability("appArguments", "/e");
        capabilities.setCapability("platformName", "Windows");
        driver = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


return getDriver();
    }

    public static WindowsDriver getDriver(){
        return driver;
    }
}

package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    public static AndroidDriver androidDriver;
    DesiredCapabilities capabilities = new DesiredCapabilities();

    @BeforeTest
    public void setUpApplication() {
        try {
            capabilities.setCapability("deviceName", "Pixel 7 API 33");// Sanal cihazimin ismi
            capabilities.setCapability("platformName", "Android"); // sistem platformunun ismi
            capabilities.setCapability("platformVersion", "13.0");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("browserName", "chrome");
            //capabilities.setCapability("app",System.getProperty("user.dir")+"/app/ApiDemos.apk");
            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
        } catch (MalformedURLException e) {
            System.out.println("URL Exception: " + e.getMessage());
        }
    }
}

package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HooksWeb {

    public static AndroidDriver androidDriver;
    static DesiredCapabilities capabilities = new DesiredCapabilities();

    @BeforeMethod
    public void setUp() {
        try {
            capabilities.setCapability("deviceName", "Pixel 7 API 33");
            capabilities.setCapability("platformName", "android");
            capabilities.setCapability("platformVersion", "13.0");
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("browserName", "chrome");
            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);
            androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.getMessage();
        }
    }
}

package com.nttdata.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

import java.time.Duration;

public class BaseTest {

    public static AppiumDriver driver;

    public static void setup() {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "9.0");
            caps.setCapability("deviceName", "Pixel 4 API 30");
            caps.setCapability("automationName", "UiAutomator2");
            caps.setCapability("app", "https://github.com/saucelabs/my-demo-app-android/releases/download/2.0.2/mda-2.0.2-23.apk");
            caps.setCapability("appPackage", "com.saucelabs.mydemoapp.android");
            caps.setCapability("appActivity", "com.saucelabs.mydemoapp.android.view.activities.SplashActivity");

            URL remoteUrl = new URL("http://localhost:4723/");

            driver = new AndroidDriver(remoteUrl, caps);

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


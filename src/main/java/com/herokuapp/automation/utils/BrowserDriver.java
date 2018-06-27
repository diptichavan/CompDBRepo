package com.herokuapp.automation.utils;

import org.openqa.selenium.WebDriver;

public class BrowserDriver {
    public static void startBrowser(String browserName) {
        GuiControl.setWebDriver(browserName);
    }

    public static void maximizeBrowser() {
        GuiControl.getWebDriver().manage().window().maximize();
    }

    public static void accessUrl(String url) {
        GuiControl.getWebDriver().get(url);
    }

    public static void stopBrowser() {
        GuiControl.getWebDriver().quit();
    }

    public static WebDriver getWebDriver(){
        return GuiControl.getWebDriver();
    }
}

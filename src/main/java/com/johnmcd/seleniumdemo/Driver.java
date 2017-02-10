package com.johnmcd.seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    public static WebDriver NewFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\development\\drivers\\geckodriver.exe");
        return new FirefoxDriver();
    }
}

package com.johnmcd.seleniumdemo;


import org.openqa.selenium.WebDriver;

import static com.johnmcd.seleniumdemo.Pause.pause;

public class Navigate {

    static void navigation() {
        WebDriver driver = Driver.NewFirefoxDriver();


        driver.navigate().to("https://github.com/SeleniumHQ/selenium");
        pause();
        driver.navigate().to("https://github.com/docker/docker");
        pause();
        driver.navigate().back();
        pause();
        driver.navigate().forward();
        pause();
        driver.navigate().refresh();
        pause();


        driver.quit();

    }
}

package com.johnmcd.seleniumdemo;


import org.openqa.selenium.WebDriver;

import static com.johnmcd.seleniumdemo.Pause.pause;

public class PageInfo {
    static void pageInfo() {
        WebDriver driver = Driver.NewFirefoxDriver();

        driver.navigate().to("https://github.com/SeleniumHQ/selenium");
        pause();

        // Page URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("getCurrentUrl: " + currentUrl);

        //Page Title
        String getTitle = driver.getTitle();
        System.out.println("getTitle: " + getTitle);

        //Page Content
        String pageSource = driver.getPageSource();
        System.out.println("pageSource:" + pageSource);


        driver.quit();

    }
}

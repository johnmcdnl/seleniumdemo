package com.johnmcd.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.johnmcd.seleniumdemo.Pause.pause;

public class FindingElements {
    static void findingElement() {
        WebDriver driver = Driver.NewFirefoxDriver();


        driver.navigate().to("https://github.com/SeleniumHQ/selenium");


        // Using IDs
        WebElement elementByID = driver.findElement(By.id("topics-list-container"));
        System.out.println("elementByID.getText(): " + elementByID.getText());


        // CSS Classes
        WebElement elementByClassName = driver.findElement(By.className("list-topics-container"));
        System.out.println("elementByClassName.isDisplayed(): " + elementByClassName.isDisplayed());


        // XPATH
        WebElement elementByXpath = driver.findElement(By.xpath("//*[@id=\"topics-list-container\"]/div"));
        System.out.println("elementByClassName.isEnabled(): " + elementByXpath.isEnabled());


        //Link Text
        WebElement elementByLinkText = driver.findElement(By.linkText("SeleniumHQ"));
        elementByLinkText.click();
        pause();
        WebElement elementByPartialLinkText = driver.findElement(By.partialLinkText("selen"));
        elementByPartialLinkText.click();
        pause();


        // Multiple Elements
        List<WebElement> allElementsByTagName = driver.findElements(By.tagName("a"));
        for (WebElement webElement : allElementsByTagName) {
            System.out.println(webElement.getText());
        }

        pause();
        driver.quit();

    }
}




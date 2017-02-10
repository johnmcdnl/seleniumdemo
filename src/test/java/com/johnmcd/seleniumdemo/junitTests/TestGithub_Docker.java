package com.johnmcd.seleniumdemo.junitTests;

import com.johnmcd.seleniumdemo.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestGithub_Docker {

    private static WebDriver driver;

    @Before
    public void beforeEachTest() {
        System.setProperty("jna.nosys", "true");
        driver = Driver.NewFirefoxDriver();
        driver.navigate().to("https://github.com/docker/docker");
    }

    @After
    public void afterEachTest() {
        driver.quit();
    }

    @Test
    public void VerifyPageTitle() {
        Assert.assertEquals("SeleniumHQ/selenium: A browser automation framework and ecosystem.", driver.getTitle());
    }

    @Test
    public void UserShouldSeeAListOfFoldersAndFiles() {
        WebElement fileWrap = driver.findElement(By.className("file-wrap"));
        WebElement tableBody = fileWrap.findElement(By.tagName("tbody"));
        List<WebElement> filesAndFolders = tableBody.findElements(By.tagName("a"));

        for (WebElement filesAndFolder : filesAndFolders) {
            Assert.assertTrue("Element was not displayed:" + filesAndFolder.getText(), filesAndFolder.isDisplayed());
        }

    }

    @Test
    public void UserShouldSeeHowManyCommits() {
        WebElement numberOfCommits = driver.findElement(By.partialLinkText("commits"));
        Assert.assertTrue(numberOfCommits.isDisplayed());
    }
}

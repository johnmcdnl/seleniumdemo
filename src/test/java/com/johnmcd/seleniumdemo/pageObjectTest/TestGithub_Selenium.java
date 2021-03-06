package com.johnmcd.seleniumdemo.pageObjectTest;

import com.johnmcd.pageobject.githubRepo.GitHubRepoPage;
import com.johnmcd.seleniumdemo.Driver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TestGithub_Selenium {

    private static WebDriver driver;
    private GitHubRepoPage gitHubRepoPage;

    @Before
    public void beforeEachTest() {
        System.setProperty("jna.nosys", "true");
        driver = Driver.NewFirefoxDriver();
        driver.navigate().to("https://github.com/SeleniumHQ/selenium");
        PageFactory.initElements(driver, GitHubRepoPage.class);
        gitHubRepoPage = new GitHubRepoPage(driver);
    }

    @After
    public void afterEachTest() {
        driver.quit();
    }

    @Test
    public void VerifyPageTitle() {
        Assert.assertEquals("SeleniumHQ/selenium: A browser automation framework and ecosystem.", gitHubRepoPage.getPageTitle());
    }

    @Test
    public void UserShouldSeeAListOfFoldersAndFiles() {
        Assert.assertTrue(gitHubRepoPage.repoDocuments.areAllDocumentsDisplayed());
    }

    @Test
    public void UserShouldSeeHowManyCommits() {
        WebElement numberOfCommits = driver.findElement(By.partialLinkText("commits"));
        Assert.assertTrue(numberOfCommits.isDisplayed());
    }

    @Test
    public void UserCanSearchForText() {
        gitHubRepoPage.search.SearchFor("Test");
        String newUrl = driver.getCurrentUrl();

        String expectedUrl = "https://github.com/SeleniumHQ/selenium/search?";
        Assert.assertTrue(newUrl, newUrl.startsWith(expectedUrl));
    }
}

package com.johnmcd.pageobject.githubRepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
    private WebDriver driver;

    public Search(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(className = "header-search-input")
    public WebElement searchInputField;

    public void SearchFor(String searchTerm){
        searchInputField.sendKeys(searchTerm);
        searchInputField.sendKeys(Keys.RETURN);
//        waitAWhile()
        new WebDriverWait(this.driver, 10).until(ExpectedConditions.urlContains(searchTerm));
    }

    private void waitAWhile() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

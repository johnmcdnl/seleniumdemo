package com.johnmcd.pageobject.githubRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RepoDocuments {

    public RepoDocuments(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBys({@FindBy(className = "file-wrap"), @FindBy(tagName = "tbody"), @FindBy(tagName = "a")})
    private List<WebElement> allDocuments;

    public boolean areAllDocumentsDisplayed() {
        for (WebElement filesAndFolder : allDocuments) {
            if (!filesAndFolder.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

}

package com.johnmcd.pageobject.githubRepo;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class RepoDocuments {
    @FindBys({@FindBy(className = "file-wrap"), @FindBy(tagName = "tbody"), @FindBy(tagName = "a")})
    public List<WebElement> allDocuments;


    public boolean areAllDocumentsDisplayed() {
        for (WebElement filesAndFolder : allDocuments) {
            if (!filesAndFolder.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

}

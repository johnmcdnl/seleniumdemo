package com.johnmcd.pageobject.githubRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Search {
    public Search(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

package com.johnmcd.pageobject.githubRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NavigationBar {

    public NavigationBar(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}

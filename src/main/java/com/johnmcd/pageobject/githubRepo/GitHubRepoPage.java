package com.johnmcd.pageobject.githubRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GitHubRepoPage {
    private WebDriver driver;
    public Search search;
    public NavigationBar navigationBar;
    public RepoDocuments repoDocuments;
    public Footer footer;

    public GitHubRepoPage(WebDriver driver) {
        this.driver = driver;
        this.search = new Search( this.driver);
        this.navigationBar = new NavigationBar( this.driver);
        this.repoDocuments = new RepoDocuments( this.driver);
        this.footer = new Footer( this.driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateTo(String url) {
        this.driver.navigate().to(url);
    }

    public String getPageTitle() {
        return this.driver.getTitle();
    }
}

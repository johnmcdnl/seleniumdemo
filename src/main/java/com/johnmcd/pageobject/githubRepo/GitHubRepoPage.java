package com.johnmcd.pageobject.githubRepo;

import org.openqa.selenium.WebDriver;

public class GitHubRepoPage {
    private WebDriver driver;
    public Search search;
    public NavigationBar navigationBar;
    public RepoDocuments repoDocuments;
    public Footer footer;

    public GitHubRepoPage(WebDriver driver) {
        this.driver = driver;
        this.search = new Search();
        this.navigationBar = new NavigationBar();
        this.repoDocuments = new RepoDocuments();
        this.footer = new Footer();
    }

    public void navigateTo(String url) {
        this.driver.navigate().to(url);
    }

    public String getPageTitle() {
        return this.driver.getTitle();
    }
}

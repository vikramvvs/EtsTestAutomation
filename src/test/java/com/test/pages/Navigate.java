package com.test.pages;

import com.test.configs.FileReaderManager;
import com.test.configs.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class Navigate {

    private WebDriverManager webDriverManager = new WebDriverManager();
    private WebDriver driver = webDriverManager.getDriver();

    public void toEtsyHomePage() {

        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

}

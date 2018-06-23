package com.test.pages;

import com.test.configs.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class UtilPage {

    private WebDriverManager webDriverManager = new WebDriverManager();
    private WebDriver driver = webDriverManager.getDriver();

    WebElement findElement(By locator) {

        return driver.findElement(locator);
    }

    List<WebElement> findElements(By locator) {

        return driver.findElements(locator);
    }

    List<String> getElementsText(By locator) {
        List<String> values = new ArrayList<>();
        findElements(locator).forEach(element -> values.add(element.getText()));
        return values;
    }

    void waitFor(long seconds) {
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

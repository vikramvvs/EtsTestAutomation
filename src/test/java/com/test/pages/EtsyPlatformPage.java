package com.test.pages;

import com.test.configs.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

public class EtsyPlatformPage extends UtilPage {

    private WebDriverManager webDriverManager = new WebDriverManager();
    private WebDriver driver = webDriverManager.getDriver();

    private By privateSerttings = By.cssSelector(".width-full.btn.btn-outline.btn-outline-black");
    private By searchTxtField = By.cssSelector("#search-query");
    private By firstSuggestion = By.cssSelector("#search-suggestions .as-suggestion");
    private By sortDropDownButton = By.cssSelector(".btn.btn-secondary.caret.normal");
    private By itemPrices = By.xpath("//p[contains(@class,'n-listing-card__price')]/span[1]/span[@class='currency-value']");

    private By getLinkTextLocator(String linkText) {
        return By.linkText(linkText);
    }

    public void acceptPrivateSettings() {
        findElement(privateSerttings).click();
    }

    public void searchtext(String keyWord) {
        findElement(searchTxtField).sendKeys(keyWord);
    }

    public void selectValueDropDownOptions(String value) {
        waitFor(2);
        findElements(firstSuggestion).get(0).click();
    }

    public void selectOptionSortBy(String sortOption) {
        findElement(getLinkTextLocator(sortOption)).click();
    }

    public void clickSortBy() {
        findElement(sortDropDownButton).click();
    }

    public void printItems() {
        List<String> prices = getElementsText(itemPrices).stream().filter(x -> !x.equals("")).collect(Collectors.toList());
        List<String> firstTenItemPrices = prices.stream().limit(10).collect(Collectors.toList());
        System.out.println(firstTenItemPrices);
    }
}

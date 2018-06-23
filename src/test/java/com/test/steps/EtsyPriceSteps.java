package com.test.steps;

import com.test.ObjectRepository;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class EtsyPriceSteps extends ObjectRepository {

    @Given("^I am a on etsy page$")
    public void i_am_on_etsy_page() throws Throwable {
        navigate().toEtsyHomePage();
        etsyPlatformPage().acceptPrivateSettings();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String search) throws Throwable {
        etsyPlatformPage().searchtext(search);

    }

    @When("^I select \"([^\"]*)\" and hit search$")
    public void i_select_and_hit_search(String selectValue) throws Throwable {
        etsyPlatformPage().selectValueDropDownOptions(selectValue);
        //etsyPlatformPage.selectValueSuggestionOption(selectValue);

    }

    @When("^I sort by \"([^\"]*)\"$")
    public void i_sort_by(String sortOption) throws Throwable {
        etsyPlatformPage().clickSortBy();
        etsyPlatformPage().selectOptionSortBy(sortOption);

    }

    @Then("^I print top (\\d+) items price$")
    public void i_print_top_items_price(int arg1) throws Throwable {
        etsyPlatformPage().printItems();
    }
}

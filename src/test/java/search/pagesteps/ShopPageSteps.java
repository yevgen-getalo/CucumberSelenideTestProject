package search.pagesteps;


import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static search.Elements.*;

public class ShopPageSteps {

    @And("find link with (.*) and move to the shop")
    public void findShopsLink(String shopAddress){
        $(By.partialLinkText(shopAddress)).click();
    }

    @And("change search category to (.*)")
    public void typeSearchWord(String searchCategory){
        $(By.xpath(SEARCH_CATEGORY_BUTTON)).click();
        $(By.xpath(SEARCH_CATEGORY)).click();

    }

    @And("type (.*) into search field")
    public void addValueToSearch(String requiredSearchValue){
        $(By.xpath(SEARCH_INPUT_FIELD)).setValue(requiredSearchValue).pressEnter();
    }

    @And("find (.*) book and move to book's page")
    public void findRequiredEntry(String requiredEntry){
        $(By.xpath(SEARCH_VALUE.replace("$", requiredEntry))).click();
    }

    @And("select book format as (.*)")
    public void selectBookFormat(String format){
        $(By.xpath(BOOK_FORMAT.replace("$", format))).click();
    }

    @And("click Add to cart button")
    public void addItemToCart(){
        $(By.xpath(ADD_TOCART_BUTTON)).click();
    }

    @And("click View Cart button")
    public void vewCart(){
        $(By.xpath(VIEW_CART_BUTTON)).click();
    }

    @Then("cart page contains (\\d+) item")
    public void checkNumberOfItemsInCart(String number){
        Assert.assertTrue($(By.xpath(NUMBER_OF_ITEMS_IN_CART.replace("$", number))).isDisplayed());
    }

    @And("cart page contains (.*) book")
    public void checkNameOfItemsInCart(String itemName){
        Assert.assertTrue($(By.xpath(ITEM_NAME_IN_CART.replace("$", itemName))).isDisplayed());
    }
}

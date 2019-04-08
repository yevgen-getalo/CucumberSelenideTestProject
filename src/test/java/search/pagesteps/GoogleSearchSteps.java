package search.pagesteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static search.Elements.*;

public class GoogleSearchSteps {

    @Given("open browser and navigate to google search page")
    public void openGoogleSearch(){
        open(GOOGLE_SEARCH_PAGE);
    }

    @When("type (.*) in search field")
    public void typeSearchWord(String searchWord){
        $(By.xpath(INPUT_FIELD)).val(searchWord);
    }

    @And("click search button")
    public void clickSearchButton(){
        $(By.xpath(SEARCH_BUTTON)).click();
    }

}

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;
import pages.SearchResultsPage;
import utils.DriverManager;

public class SearchSteps {

    public WebDriver driver;
    public String browser = "chrome";
    public static final String URL = "http://automationpractice.com/index.php";
    public LandingPage landingPage;
    public SearchResultsPage searchResultsPage;

    @Given("the user is in the landing page")
    public void theUserIsInTheLandingPage() {
        driver = DriverManager.getDriver(browser);
        landingPage = new LandingPage(driver);
        landingPage.navigate(URL);
    }

    @When("the user inserts keywords in the search bar")
    public void theUserInsertsKeywordsInTheSearchBar() {
        landingPage.type(landingPage.getSearchBar(), "Dresses");
    }

    @When("the user clicks the search button")
    public void theUserClicksTheSearchButton() {
        landingPage.click(landingPage.getSearchButton());
    }

    @Then("the SearchResults Page is displayed")
    public void theSearchResultsPageIsDisplayed() {
        searchResultsPage = new SearchResultsPage(driver);
        Assert.assertTrue(searchResultsPage.isLoaded(searchResultsPage.getSearch_span()));
        driver.close();
    }

}

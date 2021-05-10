package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

    @FindBy(className = "navigation_page")
    private WebElement search_span;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearch_span() {
        return this.search_span;
    }

}

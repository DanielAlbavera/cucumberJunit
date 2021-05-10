package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    @FindBy(id = "search_query_top")
    private WebElement search_bar;

    @FindBy(name = "submit_search")
    private WebElement search_button;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchBar() {
        return this.search_bar;
    }

    public WebElement getSearchButton() {
        return this.search_button;
    }

}

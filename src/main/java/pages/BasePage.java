package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigate(String url) {
        driver.get(url);
    }

    public void type(WebElement element, String string) {
        element.sendKeys(string);
    }

    public void click(WebElement element) {
        element.click();
    }

    public Boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public boolean isLoaded(WebElement element) {
        return element.isDisplayed();
    }

}

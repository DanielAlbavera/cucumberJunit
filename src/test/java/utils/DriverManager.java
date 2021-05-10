package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverManager {

    public static WebDriver getDriver(String browser) {

        if ("chrome".equals(browser.toLowerCase())) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if ("firefox".equals(browser.toLowerCase())) {
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        } else if ("ie".equals(browser.toLowerCase())) {
            WebDriverManager.iedriver().setup();
            return new InternetExplorerDriver();
        } else if ("edge".equals(browser.toLowerCase())) {
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }
        return null;

    }

}

package Factory_DesignPattern.Factory_DesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MyFirefoxDriverWithCapabilities implements Browser {
    private WebDriver driver;

    
    public void initialize() {
        System.out.println("Initializing FirefoxDriver with custom capabilities");
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("dom.webnotifications.enabled", false);
        driver = new FirefoxDriver(options);
    }
}

package Factory_DesignPattern.Factory_DesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirefoxDriver implements Browser {
    private WebDriver driver;

    
    public void initialize() {
        System.out.println("Initializing custom FirefoxDriver");
        // Initialize actual FirefoxDriver
        driver = new FirefoxDriver();
    }
}

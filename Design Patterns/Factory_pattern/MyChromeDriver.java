package Factory_DesignPattern.Factory_DesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyChromeDriver implements Browser {
    private WebDriver driver;

    
    public void initialize() {
        System.out.println("Initializing custom ChromeDriver");
        // Initialize actual ChromeDriver
        driver = new ChromeDriver();
    }
}
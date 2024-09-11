package Factory_DesignPattern.Factory_DesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyChromeDriverWithCapabilities implements Browser {
    private WebDriver driver;

    
    public void initialize() {
        System.out.println("Initializing ChromeDriver with custom capabilities");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");
        driver = new ChromeDriver(options);
    }
}

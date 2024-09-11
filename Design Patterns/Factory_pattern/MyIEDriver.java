package Factory_DesignPattern.Factory_DesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyIEDriver implements Browser {
    private WebDriver driver;

  
    public void initialize() {
        System.out.println("Initializing custom IEDriver");
        // Initialize actual IEDriver
        driver = new InternetExplorerDriver();
    }
}

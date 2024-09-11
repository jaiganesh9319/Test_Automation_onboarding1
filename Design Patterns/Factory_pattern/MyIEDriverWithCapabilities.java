package Factory_DesignPattern.Factory_DesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class MyIEDriverWithCapabilities implements Browser {
    private WebDriver driver;

    
    public void initialize() {
        System.out.println("Initializing IEDriver with custom capabilities");
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.ignoreZoomSettings();
        driver = new InternetExplorerDriver(options);
    }
}

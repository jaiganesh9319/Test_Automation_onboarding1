package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.RegistrationPage;
import pages.SignInPage;

public class TestContext {
    private WebDriver driver;
    private RegistrationPage registrationPage;
    private SignInPage signInPage;

    public TestContext() {
    	// Using WebDriverManager to manage the ChromeDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        registrationPage = new RegistrationPage(driver);
        signInPage = new SignInPage(driver);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public RegistrationPage getRegistrationPage() {
        return registrationPage;
    }

    public SignInPage getSignInPage() {
        return signInPage;
    }
}

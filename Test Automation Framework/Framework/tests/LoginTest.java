package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.ConfigUtil;
import pages.ExcelUtil;
import pages.LoginPage;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;
    ExcelUtil excelUtil;
    ConfigUtil configUtil;

    @BeforeClass
    public void setUp() {
        // Load the configuration file
        configUtil = new ConfigUtil("src/test/resources/config/config.properties");

        // Retrieve browser type and application URL from properties file
        String browser = configUtil.getProperty("browser");
        String appUrl = configUtil.getProperty("app.url");

        // Set up WebDriver based on browser type using WebDriverManager
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Browser type not supported.");
        }

        // Navigate to the application URL
        driver.get(appUrl);

        // Initialize page and Excel utility
        loginPage = new LoginPage(driver);
        excelUtil = new ExcelUtil(configUtil.getProperty("excel.filepath"), configUtil.getProperty("excel.sheet"));
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        int rowCount = excelUtil.getRowCount();
        Object[][] data = new Object[rowCount][2];
        for (int i = 1; i <= rowCount; i++) {  
            data[i - 1][0] = excelUtil.getData(i, 0);  // Username
            data[i - 1][1] = excelUtil.getData(i, 1);  // Password
        }
        return data;
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        // Add assertions to verify login
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

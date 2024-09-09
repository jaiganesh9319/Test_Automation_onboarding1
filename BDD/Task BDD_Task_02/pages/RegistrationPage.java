package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    WebDriver driver;

    @FindBy(id = "email_create")
    WebElement emailInput;

    @FindBy(id = "SubmitCreate")
    WebElement submitCreateButton;

    @FindBy(id = "customer_firstname")
    WebElement firstNameInput;

    @FindBy(id = "customer_lastname")
    WebElement lastNameInput;

    @FindBy(id = "passwd")
    WebElement passwordInput;

    @FindBy(id = "submitAccount")
    WebElement submitAccountButton;

    @FindBy(css = ".alert.alert-danger")
    WebElement errorMessage;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String email) {
        emailInput.sendKeys(email);
        submitCreateButton.click();
    }

    public void fillDetails(String firstName, String lastName, String password) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        passwordInput.sendKeys(password);
    }

    public void submitRegistration() {
        submitAccountButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}

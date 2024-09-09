package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    WebDriver driver;

    @FindBy(id = "email")
    WebElement emailInput;

    @FindBy(id = "passwd")
    WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    WebElement submitButton;

    @FindBy(css = ".alert.alert-danger")
    WebElement errorMessage;

    @FindBy(css = "a.logout")
    WebElement logoutButton;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterCredentials(String email, String password) {
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
    }

    public void submitLogin() {
        submitButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void signOut() {
        logoutButton.click();
    }
}

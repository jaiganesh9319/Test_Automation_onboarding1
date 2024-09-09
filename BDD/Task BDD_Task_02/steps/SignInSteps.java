package steps;

import pages.SignInPage;
import utils.TestContext;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class SignInSteps {

    private TestContext context;
    private SignInPage signInPage;

    public SignInSteps(TestContext context) {
        this.context = context;
        this.signInPage = context.getSignInPage();
    }

    @Given("user am on the sign-in page")
    public void user_am_on_the_sign_in_page() {
        context.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @When("user enter valid credentials")
    public void user_enter_valid_credentials() {
        signInPage.enterCredentials("testuser@example.com", "Password123");
        signInPage.submitLogin();
    }

    @Then("user should be redirected to my account page")
    public void user_should_be_redirected_to_my_account_page() {
        Assert.assertTrue(context.getDriver().getCurrentUrl().contains("my-account"));
    }

    @When("user enter an invalid email format")
    public void user_enter_an_invalid_email_format() {
        signInPage.enterCredentials("invalid-email", "Password123");
        signInPage.submitLogin();
    }

    @Then("user should see an error message indicating the email is invalid")
    public void user_should_see_an_error_message_indicating_the_email_is_invalid() {
        Assert.assertTrue(signInPage.getErrorMessage().contains("Invalid email address"));
    }

    @Given("user am logged into my account")
    public void user_am_logged_into_my_account() {
        user_am_on_the_sign_in_page();
        user_enter_valid_credentials();
    }

    @When("user click the sign-out button")
    public void user_click_the_sign_out_button() {
        signInPage.signOut();
    }

    @Then("user should be logged out and redirected to the homepage")
    public void user_should_be_logged_out_and_redirected_to_the_homepage() {
        Assert.assertTrue(context.getDriver().getCurrentUrl().contains("index.php"));
    }
}

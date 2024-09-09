package steps;

import pages.RegistrationPage;
import utils.TestContext;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class RegistrationSteps {

    private TestContext context;
    private RegistrationPage registrationPage;

    public RegistrationSteps(TestContext context) {
        this.context = context;
        this.registrationPage = context.getRegistrationPage();
    }

    @Given("user on the registration page")
    public void user_on_the_registration_page() {
        context.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @When("user enter a valid email for registration")
    public void user_enter_a_valid_email_for_registration() {
        registrationPage.enterEmail("testuser@example.com");
    }

    @When("user fill in all mandatory fields with valid details")
    public void user_fill_in_all_mandatory_fields_with_valid_details() {
        registrationPage.fillDetails("John", "Doe", "Password123");
    }

    @When("user submit the registration form")
    public void user_submit_the_registration_form() {
        registrationPage.submitRegistration();
    }

    @Then("user should see a success message confirming my account creation")
    public void user_should_see_a_success_message_confirming_my_account_creation() {
        // Assuming success leads to a new page or dashboard
        Assert.assertTrue(context.getDriver().getCurrentUrl().contains("my-account"));
    }

    @When("user enter an invalid email format for registration")
    public void user_enter_an_invalid_email_format_for_registration() {
        registrationPage.enterEmail("invalid-email");
    }

    @Then("user should see an error message indicating the email is invalid")
    public void user_should_see_an_error_message_indicating_the_email_is_invalid() {
        Assert.assertTrue(registrationPage.getErrorMessage().contains("Invalid email address"));
    }
}

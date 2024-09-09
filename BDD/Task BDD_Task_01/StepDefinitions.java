package jai.jai;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class StepDefinitions {

    private Account account;
    private int cashDispensed;

    @Given("I have a balance of ${int} in my account")
    public void i_have_a_balance_of_$100_in_my_account(int balance) {
        account = new Account(balance);
    }

    @When("I request ${int}")
    public void i_request_$20(int amount) {
        account.withdraw(amount);
        cashDispensed = amount;
    }

    @Then("${int} should be dispensed")
    public void $20_should_be_dispensed(int expectedAmount) {
        Assert.assertEquals(expectedAmount, cashDispensed);
    }
}

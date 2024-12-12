package io.cucumber.skeleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Test;

public class StepDefinitions {

    private Account account;

    @Given("account balance is {double}")
    public void initialAccountBalance(Double initialBalance) {
        account = new Account(initialBalance);
    }

    @When("the account is credited with {double}")
    public void credit(Double amount) {
        account.credit(amount);
    }

    @Then("account should have a balance of {double}")
    public void checkBalance(Double expectedBalance) {
        assertEquals(expectedBalance, account.getBalance());
    }
}

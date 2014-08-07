package com.terracotta;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by johndoe on 7/21/14.
 */
public class DepositMoneyStepsTest {
    @Given("^a User has no money in their account$")
    public void a_User_has_no_money_in_their_account() throws Throwable {

    }


    @When("^£(\\d+) is deposited in to the account$")
    public void £_is_deposited_in_to_the_account(int arg1) throws Throwable {
        System.out.println("deposit");
    }


    @Then("^the balance should be £(\\d+)$")
    public void the_balance_should_be_£(int arg1) throws Throwable {
        System.out.println("balance should be " + arg1);
    }
}

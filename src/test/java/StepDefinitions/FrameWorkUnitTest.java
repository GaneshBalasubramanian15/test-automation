package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.Test;

public class FrameWorkUnitTest {

    @Given("^I have the framework$")
    public void base1() throws Throwable {

        System.out.println("This is basic cucumber testing");

    }

    @When("^I initilise the framework$")
    public void base2() throws Throwable {

        System.out.println("This is basic Cucumber");

    }


    @Then("^I say my test is passed$")
    public void base3() throws Throwable {

        System.out.println("This is basic Cucumber");

    }


}

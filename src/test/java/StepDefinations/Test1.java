package StepDefinations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


/**
 * Created by SAYEM009 on 10/6/2016.
 */
public class Test1 {

    @Given("^Open Firefox and start application$")
    public void open_Firefox_and_start_application() throws Throwable {
        System.out.println("start applicaton");

    }

    @When("^I enter valid credentials$")
    public void i_enter_valid_credentials() throws Throwable {
        System.out.println("enter credentials");
    }

    @Then("^user should be able to login succesfully$")
    public void user_should_be_able_to_login_succesfully() throws Throwable {
        System.out.println("login succesful");
    }

}

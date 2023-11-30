package calculator;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs2 {
    private Calculator calculator;
    private int value1;
    private int value2;
    private double result;
    private String exception;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1) {
        value1 = arg0;
        value2 = arg1;
    }

    @When("^I calculate the sqrt\\(a/b\\)$")
    public void iCalculateTheSqrtAB() {
        try {
            result = calculator.sqrt_divide(value1, value2);
        } catch (ArithmeticException e) {
            exception = e.getMessage();
        }
    }

    @Then("^I expect the result to be (.+)$")
    public void iExpectTheResultToBe(String arg0) {
        if (exception == null) {
            Assert.assertEquals(Double.parseDouble(arg0), result, 0.001);
        } else {
            Assert.assertEquals(arg0, exception);
        }
    }
}

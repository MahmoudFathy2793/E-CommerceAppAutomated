package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.testng.asserts.SoftAssert;

public class D02_Login {

    P02_Login p02log = new P02_Login();

    @Given("user navigate to login page")
    public void goToLoginPage()
    {
        p02log.loginLink().click();
    }
    @When("^user enter valid email \"(.*)\"$")
    public void enterValidEmail(String email)
    {
        p02log.emailTxt().sendKeys(email);
    }
    @And("^user enter valid password \"(.*)\"$")
    public void enterValidPass(String password)
    {
        p02log.passTxt().sendKeys(password);
    }
    @And("user press on login button")
    public void pressLoginBtn()
    {
        p02log.loginBtn().click();
    }
    @Then("user login to the system successfully")
    public void loginSuccess(){
        SoftAssert sAssert = new SoftAssert();
        sAssert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        sAssert.assertTrue(p02log.myAccTab().isDisplayed());
        sAssert.assertAll();
    }

}

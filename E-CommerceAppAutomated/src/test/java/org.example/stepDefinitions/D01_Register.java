package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_Register {

    P01_Register p01reg = new P01_Register();

    @Given("user go to register page")
    public void goToRegisterLink()
    {
        p01reg.registerLink().click();
    }
    @When("^user select gender type \"(.*)\"$")
    public void chooseGender(String gender)
    {
        p01reg.genderType(gender).click();
    }
    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void validNames(String firstname, String lastname)
    {
        p01reg.firstNameTxt().sendKeys(firstname);
        p01reg.lastNameTxt().sendKeys(lastname);
    }
    @And("^user enter date of birth day \"(.*)\" month \"(.*)\" year \"(.*)\"$")
    public void dateOfBirth(int day, String month, String year) {

        Select select = new Select(p01reg.birthDay());
        select.selectByIndex(day);

        select = new Select(p01reg.birthMonth());
        select.selectByValue(month);

        select = new Select(p01reg.birthYear());
        select.selectByVisibleText(year);
    }
    @And("^user enter email \"(.*)\"$")
    public void enterEmail(String email)
    {
        p01reg.emailTxt().sendKeys(email);
    }
    @And("^user fills password fields \"(.*)\" \"(.*)\"$")
    public void fillPass(String pass, String passConfirm)
    {
        p01reg.passwordTxt().sendKeys(pass);
        p01reg.confirmPassTxt().sendKeys(passConfirm);
    }
    @And("user clicks on register button")
    public void clkRegBtn() throws InterruptedException {
        p01reg.registerButton().click();
        Thread.sleep(5000);
    }
    @Then("^user redirected to register completion page \"(.*)\"$")
    public void redirectPage(String url)
    {
        SoftAssert sAssert= new SoftAssert();
        sAssert.assertEquals(Hooks.driver.getCurrentUrl(),url);
        sAssert.assertAll();
    }
    @And("^a success message is displayed \"(.*)\"$")
    public void successMsg(String msg)
    {
        SoftAssert sAssert = new SoftAssert();
        sAssert.assertEquals(p01reg.successMessage().getText(),msg);
        sAssert.assertAll();
    }
    @And("^the color of this message is green \"(.*)\"$")
    public void msgColor(String color)
    {
        SoftAssert sAssert = new SoftAssert();
        sAssert.assertEquals(p01reg.successMessage().getCssValue("color"),color);
        sAssert.assertAll();
    }

}

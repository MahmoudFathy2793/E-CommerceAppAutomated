package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_Currencies {

    P03_HomePage p03home = new P03_HomePage();

    @Given("user navigates to home page")
    public void navigateHome()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @When("user select currency from dropdown list")
    public void selectEuro() throws InterruptedException {
        Select select = new Select(p03home.currencySelection());
        select.selectByVisibleText("Euro");
        Thread.sleep(3000);
    }
    @Then("prices of shown items should be in euro currency")
    public void euroPrice()
    {
        int numberOfProducts = p03home.productPrice().size();
        for (int x=0;x<numberOfProducts;x++)
        {
            String txt = p03home.productPrice().get(x).getText();
            Assert.assertTrue(txt.contains("€"));
        }
    }

}

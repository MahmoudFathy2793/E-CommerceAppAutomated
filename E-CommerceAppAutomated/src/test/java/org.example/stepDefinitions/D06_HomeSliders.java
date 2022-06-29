package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.testng.Assert;

public class D06_HomeSliders {

    P03_HomePage d06slider = new P03_HomePage();

    @When("^user select a slider \"(.*)\"$")
    public void selectSlider(int slider)
    {
        d06slider.sliderIcons().get(slider).click();
    }
    @And("^user click on the item in slider \"(.*)\"$")
    public void clickItems(int slider)
    {
        d06slider.sliderScreens().get(slider).click();
    }
    @Then("^user should be redirected to the item page \"(.*)\"$")
    public void directItemPage(String url)
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url,"user can not navigate to the required page");
    }
}

package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishList {

    P03_HomePage d08wish = new P03_HomePage();

    @When("user click on wishlist button for item \"HTC One M8 Android L 5.0 Lollipop\"")
    public void clickWish() throws InterruptedException {
        d08wish.wishlistBtn().click();
        Thread.sleep(3000);
    }
    @Then("success message is shown to inform user that item has been added to wishlist")
    public void successMSG_Shown()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(d08wish.successMSG().isDisplayed());
        soft.assertAll();
    }
    @And("^color of wishlist success message should be \"(.*)\"$")
    public void successMSG_Color(String color)
    {
        SoftAssert soft = new SoftAssert();
        String rgba = d08wish.successMSG().getCssValue("background-color");
        String hex = Color.fromString(rgba).asHex();
        soft.assertEquals(hex,color,"Color is not matched");
        soft.assertAll();
    }
    @And("user navigate to wishlist page")
    public void wishlistPage()
    {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.invisibilityOf(d08wish.successMSG()));
        d08wish.wishlistLink().click();
    }
    @Then("quantity of items should be incremented in wishlist page")
    public void itemQuantity()
    {
        String q = d08wish.quantity().getAttribute("value");
        Assert.assertTrue(Integer.parseInt(q)>0);
    }
}

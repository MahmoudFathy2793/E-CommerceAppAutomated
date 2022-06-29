package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class D05_HoverCategories {

    P03_HomePage p05hover = new P03_HomePage();
    String subCategoryTxt;

    @When("user hover to Apparel category")
    public void hoverToCategory() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(p05hover.apparelCategory()).perform();
        Thread.sleep(2000);
    }
    @And("user selects Shoes subcategory")
    public void selectSubCategory()
    {
        subCategoryTxt = p05hover.shoesSubCategory().getText().toLowerCase().trim();
        p05hover.shoesSubCategory().click();
    }
    @Then("^user should be redirected to subcategory page \"(.*)\"$")
    public void subCategoryPage(String url)
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url);
        String subTitle = p05hover.shoesSubTitle().getText().toLowerCase().trim();
        Assert.assertTrue(subTitle.contains(subCategoryTxt));
    }


}

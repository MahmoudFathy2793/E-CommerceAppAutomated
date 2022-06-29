package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_FollowUs {

    P03_HomePage d07follow = new P03_HomePage();

    @When("^user scroll down to select social media icon and click on \"(.*)\" icon$")
    public void clickIcon(String website) throws InterruptedException {
        d07follow.iconSelector(website).click();
        Thread.sleep(3000);
    }
    @Then("^user should be redirected to the required page \"(.*)\"$")
    public void directPage(String url)
    {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        String currentTab = Hooks.driver.getWindowHandle();
        int index = tabs.indexOf(currentTab);
        if(tabs.size()>1)
        {
            Hooks.driver.switchTo().window(tabs.get(index+1));
        }
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),url,"user redirected to wrong webpage");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(tabs.get(index));
    }

}

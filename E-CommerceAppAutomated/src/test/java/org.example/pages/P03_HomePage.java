package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_HomePage {
    public WebElement currencySelection()
    {
        return Hooks.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
    }
    public List<WebElement> productPrice()
    {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
    }
    public WebElement searchField()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public WebElement searchButton()
    {
        return Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    }
    public List<WebElement> searchResultItems()
    {
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }
    public WebElement searchResultItem()
    {
        return Hooks.driver.findElement(By.xpath("//h2[@class='product-title']/a"));
    }
    public WebElement itemSKU()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"sku\"]>span[class=\"value\"]"));
    }
    public WebElement apparelCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
    }
    public WebElement shoesSubCategory()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/shoes\"]"));
    }
    public WebElement shoesSubTitle()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]>h1"));
    }
    public List<WebElement> sliderIcons()
    {
        return Hooks.driver.findElements(By.cssSelector("div[class=\"nivo-controlNav\"]>a"));
    }
    public List<WebElement> sliderScreens()
    {
        return Hooks.driver.findElements(By.cssSelector("div[id=\"nivo-slider\"]>a"));
    }
    public WebElement iconSelector(String website)
    {
        return Hooks.driver.findElement(By.cssSelector("li[class="+website+"]"));
    }
    public WebElement wishlistBtn()
    {
        return Hooks.driver.findElement(By.xpath("//div//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/18/2/1\"),!1']"));
    }
    public WebElement successMSG()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement wishlistLink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-wishlist\"]"));
    }
    public WebElement quantity()
    {
        return Hooks.driver.findElement(By.cssSelector("input[class=\"qty-input\"]"));
    }

}

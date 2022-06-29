package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Register {

    public WebElement registerLink()
    {
        return  Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }
    public WebElement genderType(String gType)
    {
        WebElement element = null;

        if (gType.contains("Male"))
        {
            element = Hooks.driver.findElement(By.id("gender-male"));
        }
        else if (gType.contains("Female"))
        {
            element = Hooks.driver.findElement(By.id("gender-female"));
        }
        
        return element;
    }
    public WebElement firstNameTxt()
    {
        return  Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastNameTxt()
    {
        return  Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement birthDay()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement birthMonth()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement birthYear()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement emailTxt()
    {
        return  Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement passwordTxt()
    {
        return  Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassTxt()
    {
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerButton()
    {
        return  Hooks.driver.findElement(By.id("register-button"));
    }

    public WebElement successMessage()
    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
}


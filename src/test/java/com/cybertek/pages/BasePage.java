package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    @FindBy(linkText = "Login")
    public WebElement loginLink;


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }





}
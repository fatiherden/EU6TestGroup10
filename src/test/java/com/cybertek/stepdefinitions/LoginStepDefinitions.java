package com.cybertek.stepdefinitions;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    //@Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    //@Given("User logins with username {string} and password {string}")
    public void user_logins_with_username_and_password(String UN, String PW) {

        loginPage.login(UN,PW);
    }

    //@Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String menuName) {

        String currentTitle = Driver.getDriver().getTitle();

        //Assert.assertTrue("Title is not matching",currentTitle.contains(menuName));

    }


}

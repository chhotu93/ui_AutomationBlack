package com.bst.stepDefinitions.home;

import com.bst.base.BaseSteps;
import com.bst.pageObjects.home.HomePage;
import com.bst.pageObjects.home.LoginPage;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

@Scope("cucumber-glue")
public class LoginPageSteps extends BaseSteps {

  @Autowired public LoginPage loginPage;

  @Autowired public HomePage homePage;



  @Given("Log in as Admin {string} user")
  public void logInAsUserNameUser(String adminUser) {
    wait.waitForElementToBeVisible(loginPage.logoImage);
    loginPage.logInAs(adminUser);
//    wait.waitForElementToBeVisible(homePage.riskTitle);
  }
}

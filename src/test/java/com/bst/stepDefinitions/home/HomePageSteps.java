package com.bst.stepDefinitions.home;

import com.bst.base.BaseSteps;
import com.bst.pageObjects.home.HomePage;

import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

@Scope("cucumber-glue")
public class HomePageSteps extends BaseSteps {
  @Autowired public HomePage homePage;

  @When("go to case system settings page")
  public void goToSystemSettingsPage() {
    wait.waitForElementToBeVisible(homePage.riskTitle);
    homePage.riskTitle.click();
//    wait.waitForElementToBeVisible(homePage.systemSettingsTile);
//    homePage.systemSettingsTile.click();
  }
}

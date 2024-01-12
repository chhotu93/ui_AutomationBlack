package com.bst.pageObjects.home;

import com.bst.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class HomePage extends BasePage {

  public HomePage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  @FindBy(css = "[class*='forget-text']")
  public WebElement riskTitle;

  @FindBy(css = "button i.fa-search")
  public WebElement advancedSearchTile;

  @FindBy(css = "button i.fa-suitcase")
  public WebElement casesTile;

  @FindBy(css = "button i.fa-cog")
  public WebElement systemSettingsTile;

  @FindBy(css = ".fa-bell.icon")
  public WebElement alertManagementTile;

  @FindBy(css = "[class*='fa fa-user icon icon']")
  public WebElement userManagementTile;
}

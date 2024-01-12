package com.bst.pageObjects.home;

import com.bst.base.BasePage;
import lombok.var;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
public class LoginPage extends BasePage {

  @FindBy(name = "username")
  public WebElement usernameTextBox;

  @FindBy(name = "username")
  public WebElement usernameTextBox7;

  @FindBy(name = "password")
  public WebElement passwordTextBox;

  @FindBy(css = "[type='submit']")
  public WebElement loginButton;

  @FindBy(css = "[class*='company-logo d-none']")
  public WebElement logoImage;

  public LoginPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);

  }

  public void logInAs(String user) {
    var username = config.environment().getUser(user).username;
    var password = config.environment().getUser(user).password;
    logInAsStandardUser(username, password);
  }

  private void setUsername(String username) {
    wait.waitForElementToBeVisible(usernameTextBox);
    usernameTextBox.clear();
    usernameTextBox.sendKeys(username);
  }

  private void setPassword(String password) {
    wait.waitForElementToBeVisible(passwordTextBox);
    passwordTextBox.clear();
    passwordTextBox.sendKeys(password);
  }

  private void logInAsStandardUser(String username, String password) {
    wait.waitForElementToBeVisible(usernameTextBox);
    setUsername(username);
    setPassword(password);
    loginButton.click();
  }
}

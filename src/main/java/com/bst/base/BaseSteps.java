package com.bst.base;

import com.bst.Application;
import com.bst.commons.JsExecutor;
import com.bst.wait.ExplicitWait;
import io.cucumber.spring.CucumberContextConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Scope;
import org.testng.asserts.SoftAssert;

@CucumberContextConfiguration
@SpringBootTest(classes = Application.class)
@Scope("cucumber-glue")
public abstract class BaseSteps {

  @Autowired public WebDriver driver;
  @Autowired public ExplicitWait wait;
  @Autowired public JsExecutor js;
  public final SoftAssert softAssert = new SoftAssert();

  public Actions actions;

  public Actions getActions() {
    if (actions == null) {
      actions = new Actions(driver);
    }
    return actions;
  }
}

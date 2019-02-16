package cheshire;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testCreate {
  private WebDriver driver;
  private CreateObjectPage pageCreate = new CreateObjectPage();

  @BeforeTest
  public void initBrowser() {
    driver = new ChromeDriver();
    driver.get(AuthPage.urlAuthPage);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }

  @Test()
  public void checkCreateNewObjectWithEmptyInput() {
    AuthPage authPage = new AuthPage(driver);
    authPage.autorization();
    driver.get(CreateObjectPage.urlCreateObjectPage);
    driver.findElement(pageCreate.getXpathSubmit()).click();
    Assert.assertTrue(driver.findElement(pageCreate.getErrorSubmit()).isDisplayed());
  }

  @Test()
  public void checkCreateNewObjectWithOnlyNameInput() {
    driver.findElement(pageCreate.getXpathNameProject()).sendKeys("someonename");
    driver.findElement(pageCreate.getXpathSubmit()).click();
    Assert.assertTrue(driver.findElement(pageCreate.getErrorSubmit()).isDisplayed());
  }

  @Test()
  public void checkCreateNewObjectWithNameAndUrlInput() {
    new Controller(driver).inputDataField();
    Assert.assertTrue(driver.findElement(pageCreate.getErrorSubmit()).isDisplayed());

  }

  @Test()
  public void checkCreateNewObjectWithEmptyInput3() {
  }

  @Test()
  public void checkCreateNewObjectWithEmptyInput4() {
  }

  @Test()
  public void checkCreateNewObjectWithEmptyInput5() {
  }

  @Test()
  public void checkCreateNewObjectWithEmptyInput6() {
  }

  @AfterTest
  public void browserClose() {
    driver.quit();
  }
}

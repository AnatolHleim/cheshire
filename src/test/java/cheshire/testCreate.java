package cheshire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testCreate {
  private WebDriver driver;
  @BeforeTest
  public void initBrowser(){
    driver = new ChromeDriver();
    driver.get(AuthPage.urlAuthPage);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
  }
  @Test()
  public void checkCreateNewObject() throws InterruptedException {
    AuthPage authPage = new AuthPage();
    CreateObjectPage pageCreate = new CreateObjectPage();
    driver.findElement(By.xpath(authPage.getXpathUserInput())).sendKeys("admin");
    driver.findElement(By.xpath(authPage.getXpathUserPassword())).sendKeys("123698745");
    driver.findElement(By.xpath(authPage.getXpathSubmit())).click();
    driver.get(CreateObjectPage.urlCreateObjectPage);
    driver.findElement(By.xpath(pageCreate.getXpathSubmit())).click();
    Assert.assertTrue( driver.findElement(By.xpath(pageCreate.getErrorSubmit())).isDisplayed());
    Thread.sleep(2000);
    driver.quit();
  }
}

package cheshire;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    WebDriver driver = new ChromeDriver();
    /**
     * Rigorous Test :-)
     */
    @BeforeTest
    public void initBrowser(){
      driver.get(AuthPage.urlAuthPage);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }
    @Test
    public void shouldAnswerWithTrue()
    {
        Assert.assertTrue( true );
    }
    @Test
    public void checkAuthValidForm()
    {
      driver.findElement(By.xpath(new AuthPage().getXpathUserInput())).sendKeys("admin");
      driver.findElement(By.xpath(new AuthPage().getXpathUserPassword())).sendKeys("123698745");
      driver.findElement(By.xpath(new AuthPage().getXpathSubmit())).click();
      Assert.assertTrue( driver.getCurrentUrl().equals("http://31.130.206.73:3210/app") );
    }
  @Test
  public void checkAuthInvalidForm()
  {
    driver.findElement(By.xpath(new AuthPage().getXpathUserInput())).sendKeys("admin");
    driver.findElement(By.xpath(new AuthPage().getXpathUserPassword())).sendKeys("333");
    driver.findElement(By.xpath(new AuthPage().getXpathSubmit())).click();
    Assert.assertFalse( driver.getCurrentUrl().equals("http://31.130.206.73:3210/app") );
  }
}

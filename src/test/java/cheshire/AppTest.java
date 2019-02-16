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
    public AppTest(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private WebDriver webDriver;



  /**
     * Rigorous Test :-)
     */
    @BeforeTest
    public void initBrowser(){
      webDriver= new ChromeDriver();
      webDriver.get(AuthPage.urlAuthPage);
      webDriver.manage().window().maximize();
      webDriver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }
    @Test(enabled = false)
    public void shouldAnswerWithTrue()
    {
        Assert.assertTrue( true );
    }
    @Test(priority = 1)
    public void checkAuthValidForm()
    {
      webDriver.findElement(new AuthPage(webDriver).getXpathUserInput()).sendKeys("admin");
      webDriver.findElement(new AuthPage(webDriver).getXpathUserPassword()).sendKeys("123698745");
      webDriver.findElement(new AuthPage(webDriver).getXpathSubmit()).click();
      Assert.assertTrue( webDriver.getCurrentUrl().equals("http://31.130.206.73:3210/app") );
      webDriver.quit();
    }
  @Test(priority = 2)
  public void checkAuthInvalidForm()
  {
    initBrowser();
    webDriver.findElement(new AuthPage(webDriver).getXpathUserInput()).sendKeys("admin");
    webDriver.findElement(new AuthPage(webDriver).getXpathUserPassword()).sendKeys("333");
    webDriver.findElement(new AuthPage(webDriver).getXpathSubmit()).click();
    Assert.assertFalse( webDriver.getCurrentUrl().equals("http://31.130.206.73:3210/app") );
    webDriver.quit();
  }

}

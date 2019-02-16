package cheshire;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Controller extends CreateObjectPage {
  private  WebDriver driver;
 public static List<By> xpathFieldOnCreateObjectPage = Arrays.asList(
          new CreateObjectPage().getXpathNameProject(),
         new CreateObjectPage().getXpathUrl(),
         new CreateObjectPage().getXpathColumnSize(),
         new CreateObjectPage().getXpathDeformationLimit(),
         new CreateObjectPage().getXpathCriticalDeformation()
  );

  public Controller(WebDriver driver) {
    this.driver = driver;
  }
 public void inputDataField(){
   int count = 1;
   while (count!=xpathFieldOnCreateObjectPage.size()){
   for (int i =0;i<count;i++){
     driver.findElement(xpathFieldOnCreateObjectPage.get(i)).clear();
     driver.findElement(xpathFieldOnCreateObjectPage.get(i)).sendKeys("1");

   }driver.findElement(new CreateObjectPage().getXpathSubmit()).click();
   count++;
   }
 }
}

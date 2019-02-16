package cheshire;

import org.openqa.selenium.By;

public class ObjectPage {
  static String urlAuthPage = "http://31.130.206.73:3210/app";

  public By getXpathAddNew() {
    return xpathAddNew;
  }

  private By xpathAddNew = By.xpath("//div[@class='card card-add-obj']/a");

}

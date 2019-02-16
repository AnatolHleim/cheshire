package cheshire;

import org.openqa.selenium.By;

public class CreateObjectPage {
  static String urlCreateObjectPage = "http://31.130.206.73:3210/app/addObject";

  public String getXpathSubmit() {
    return xpathSubmit;
  }

  private String xpathSubmit = "//button[@class='col-6 btn btn-lg btn-primary mt30']";
  private String errorSubmit = "/html/body/div[@class='notifyjs-corner']/div[@class='notifyjs-wrapper notifyjs-hidable']/div[@class='notifyjs-container']/div[@class='notifyjs-bootstrap-base notifyjs-bootstrap-error']";

  public String getErrorSubmit() {
    return errorSubmit;
  }
}

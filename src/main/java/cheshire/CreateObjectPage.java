package cheshire;

import org.openqa.selenium.By;

public class CreateObjectPage {
  static String urlCreateObjectPage = "http://31.130.206.73:3210/app/addObject";
  private By xpathSubmit = By.xpath("//button[@class='col-6 btn btn-lg btn-primary mt30']");
  private By xpathUrl = By.xpath("/html/body/div[2]/div/div[1]/div/div[4]/input");
  private By xpathNameProject = By.xpath("//*[@id=\"name\"]");
  private By xpathCriticalDeformation = By.xpath("/html/body/div[@class='container']/div[@class='d-flex flex-column justify-content-center']/div[@class='row'][2]/div[@class='col-5 form']/div[@class='form-group'][3]/input[@class='form-control js_input is-invalid']");
  private By xpathColumnSize = By.xpath("/html/body/div[2]/div/div[3]/div/div[1]/input");
  private By xpathDeformationLimit = By.xpath("/html/body/div[2]/div/div[3]/div/div[2]/input");
  private By errorSubmit = By.xpath("/html/body/div[@class='notifyjs-corner']/div[@class='notifyjs-wrapper notifyjs-hidable']/div[@class='notifyjs-container']/div[@class='notifyjs-bootstrap-base notifyjs-bootstrap-error']");

  public By getXpathSubmit() {
    return xpathSubmit;
  }

  public By getXpathUrl() {
    return xpathUrl;
  }

  public By getXpathNameProject() {
    return xpathNameProject;
  }

  public By getErrorSubmit() {
    return errorSubmit;
  }

  public By getXpathCriticalDeformation() {
    return xpathCriticalDeformation;
  }

  public By getXpathColumnSize() {
    return xpathColumnSize;
  }

  public By getXpathDeformationLimit() {
    return xpathDeformationLimit;
  }
}

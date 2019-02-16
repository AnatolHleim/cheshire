package cheshire;

public class ObjectPage {
  static String urlAuthPage = "http://31.130.206.73:3210/app";

  public String getXpathAddNew() {
    return xpathAddNew;
  }

  private String xpathAddNew = "//div[@class='card card-add-obj']/a";
}

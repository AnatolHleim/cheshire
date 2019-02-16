package cheshire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthPage {

    public AuthPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private WebDriver webDriver;


    static String urlAuthPage = "http://31.130.206.73:3210/auth/login";
    private By xpathSubmit = By.xpath("//button[@class='btn btn-lg btn-primary btn-block']");
    private By xpathUserInput = By.xpath("//*[@id=\"inputEmail\"]");
    private By xpathUserPassword = By.xpath("//*[@id=\"inputPassword\"]");



    By getXpathUserInput() {
        return xpathUserInput;
    }
    public By getXpathUserPassword() {
        return xpathUserPassword;
    }


    By getXpathSubmit() {
        return xpathSubmit;
    }
    void autorization(){
        //это команда находить результирующий элемент на странице
        webDriver.findElement(new AuthPage(webDriver).getXpathUserInput()).sendKeys("admin");
        webDriver.findElement(new AuthPage(webDriver).getXpathUserPassword()).sendKeys("123698745");
        webDriver.findElement(new AuthPage(webDriver).getXpathSubmit()).click();
    }
}

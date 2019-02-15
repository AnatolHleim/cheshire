package cheshire;

public class AuthPage {

    static String urlAuthPage = "http://31.130.206.73:3210/auth/login";

    public String getXpathUserInput() {
        return xpathUserInput;
    }

    public String getXpathUserPassword() {
        return xpathUserPassword;
    }

    private String xpathUserInput = "//*[@id=\"inputEmail\"]";
    private String xpathUserPassword = "//*[@id=\"inputPassword\"]";

    public String getXpathSubmit() {
        return xpathSubmit;
    }

    private String xpathSubmit = "//button[@class='btn btn-lg btn-primary btn-block']";
}

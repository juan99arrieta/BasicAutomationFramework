package Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage extends BasePage{

    @FindBy(xpath="//input[@name='username']")
    private WebElement usernameInput;

    @FindBy(xpath="//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement logInButton;


    public LogInPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void enterLogInPage(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void sendCredentials(String username, String password){
        sendKeysToElement(usernameInput, username);
        sendKeysToElement(passwordInput, password);
    }

    public void clickLogInButton(){
        clickElement(logInButton);
    }
}

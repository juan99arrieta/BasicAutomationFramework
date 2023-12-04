package Models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage extends BasePage{

    @FindBy(id = "user-name")
    WebElement userNameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id="login-button")
    WebElement logInButton;

    public LogInPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }


    public void sendCredentials(String username, String password){
        sendKeysToElement(userNameInput, username);
        sendKeysToElement(passwordInput, password);
    }

    public void clickLogInButton(){
        clickElement(logInButton);
    }

    public void enterLoginInPage() {
        driver.get("https://www.saucedemo.com/v1/index.html");
    }

}

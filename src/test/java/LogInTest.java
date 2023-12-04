import Models.LogInPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest{

    @Test
    public void logInValidCredentials(){
        LogInPage logInPage = new LogInPage(driver, wait);
        logInPage.enterLogInPage();
        logInPage.sendCredentials("Admin","admin123");
        logInPage.clickLogInButton();
        Assert.assertEquals("OrangeHRM", driver.getTitle());
    }

}

import Models.LogInPage;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest{

    @Test
    public void firstNavigationTest(){
        LogInPage logInPage = new LogInPage(driver, wait);
        logInPage.enterLoginInPage();
        logInPage.sendCredentials("standard_user","secret_sauce");
        logInPage.clickLogInButton();
    }

}

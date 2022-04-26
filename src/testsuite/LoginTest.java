package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

String BaseUrl = "https://demo.nopcommerce.com/";

@Before

    public void setUp()
{
    openBrowser(BaseUrl);
}


@Test
// find login link and click on login link
public void userShouldNavigateToLoginPageSuccessfully()
{
    clickOnElement(By.linkText("Log in"));
    verifyElements("login page message not matching","Welcome, Please Sign In!",By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
}
@Test
// verifying user should be able to login with valid credentials
   public void userShouldLoginSuccessfullyWithValidCredentials(){
    clickOnElement(By.linkText("Log in"));
    sendTextToElement(By.id("Email"),"xyz8999@gmail.com");
    sendTextToElement(By.id("Password"),"Temp123");
    clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
    verifyElements("Logout text is not matching","Log out",By.xpath("//a[contains(text(),'Log out')]"));
}
@Test
// verify the error message with invalid credentials
public void verifyTheErrorMessage(){
    // this is from requirement
    String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
            + "No customer account found";

    clickOnElement(By.linkText("Log in"));

    sendTextToElement(By.id("Email"),"abc@yahoo.com");

    sendTextToElement(By.id("Password"),"abc123");

    clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

    String actualmessage = getTextFromElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
    //Verify the text error message with assert
    verifyElements("Error Message not displayed",expectedMessage,By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));

}
    @After
    public void tearDown()
    {
        //closeBrowser();
    }

}

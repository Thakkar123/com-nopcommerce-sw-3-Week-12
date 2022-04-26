package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class RegisterTest extends Utility {
    String BaseUrl = "https://demo.nopcommerce.com/";
    @Before

    public void setUp()
    {
        openBrowser(BaseUrl);
    }

    @Test
    // find the register elements when clicking on register link
    public void userShouldNavigateToRegisterPageSuccessfully() {
     clickOnElement(By.linkText("Register"));
     verifyElements("Register tab not matching","Register",By.xpath("//h1[contains(text(),'Register')]"));
    }

    @Test
    // Verifying user should be able to complete the registration by providing all details
    public void userShouldRegisterAccountSuccessfully() {

        clickOnElement(By.linkText("Register"));

        clickOnElement(By.id("gender-male"));

        sendTextToElement(By.id("FirstName"),"test123");

        sendTextToElement(By.id("LastName"),"test456");

        selectByValueFromDropDown(By.name("DateOfBirthDay"),"17");

        selectByVisibleTextFromDropDown(By.name("DateOfBirthMonth"),"April");

        selectByValueFromDropDown(By.name("DateOfBirthYear"),"1985");

        sendTextToElement(By.id("Email"),"xyz89991@gmail.com");

        sendTextToElement(By.id("Password"),"Temp123");

        sendTextToElement(By.id("ConfirmPassword"),"Temp123");

        clickOnElement(By.id("register-button"));

        verifyElements("Registration not completed","Your registration completed",By.xpath("//div[contains(text(),'Your registration completed')]"));

    }
    @After
    public void tearDown()
    {
        closeBrowser();
    }

}

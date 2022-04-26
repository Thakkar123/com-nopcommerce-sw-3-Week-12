package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class TopMeuTest extends Utility {
    String BaseUrl = "https://demo.nopcommerce.com/";

    @Before

    public void setUp()
    {
        openBrowser(BaseUrl);
    }

    @Test
        // Verifying user should be able to navigate to this tab
        public void userShouldNavigateToComputerPageSuccessfully() {

        clickOnElement(By.linkText("Computers"));
        verifyElements("Computers tab not matching","Computers",By.xpath("//h1[contains(text(),'Computers')]"));
    }
    @Test
    // Verifying user should be able to navigate to this tab
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        clickOnElement(By.linkText("Electronics"));
        verifyElements("Electronics tab not matching","Electronics",By.xpath("//h1[contains(text(),'Electronics')]"));

    }
    @Test
    // Verifying user should be able to navigate to this tab
    public void userShouldNavigateToApparelPageSuccessfully() {

        clickOnElement(By.linkText("Apparel"));
        verifyElements("Apparel tab not matching","Apparel",By.xpath("//h1[contains(text(),'Apparel')]"));
    }
    @Test
    // Verifying user should be able to navigate to this tab
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {

        clickOnElement(By.linkText("Digital downloads"));
        verifyElements("Digital downloads tab not matching","Digital downloads",By.xpath("//h1[contains(text(),'Digital downloads')]"));

    }
    @Test
    // Verifying user should be able to navigate to this tab
    public void userShouldNavigateToBooksPageSuccessfully() {

        clickOnElement(By.linkText("Books"));
        verifyElements("Books tab not matching","Books",By.xpath("//h1[contains(text(),'Books')]"));

    }
    @Test
    // Verifying user should be able to navigate to this tab
    public void userShouldNavigateToJewelryPageSuccessfully() {

        clickOnElement(By.linkText("Jewelry"));
        verifyElements("Jewelry tab not matching","Jewelry",By.xpath("//h1[contains(text(),'Jewelry')]"));

       }
    @Test
    // Verifying user should be able to navigate to this tab
    public void userShouldNavigateToGiftCardsPageSuccessfully() {

        clickOnElement(By.linkText("Gift Cards"));
        verifyElements("Gift Cards tab not matching","Gift Cards",By.xpath("//h1[contains(text(),'Gift Cards')]"));

    }

    @After
    public void tearDown()
    {
        closeBrowser();
    }

 }


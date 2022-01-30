package SimpleTestNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2
{
    BasePage bs=new BasePage();

    @BeforeMethod
    void setup()
    {
        bs.initialization();
    }

    @Test(priority = 1)
    void CheckGoogleLogo()
    {
        WebElement GoogleLogo = bs.driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        boolean image = GoogleLogo.isDisplayed();
        Assert.assertTrue(image, "Image Displayed");
        if (image == true)
        {
           System.out.println("Google Logo Displayed");
        }
    }


    @AfterMethod
    void teardown()
    {
        bs.quit();
    }

}

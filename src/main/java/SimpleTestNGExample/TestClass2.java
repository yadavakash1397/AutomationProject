package SimpleTestNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2
{
    @BeforeMethod
    void setup()
    {
    	BasePage.initialization();
    }

    @Test(priority = 1)
    void CheckGoogleLogo()
    {
    	PageClass p=new PageClass();
        Assert.assertEquals(p.checkLogo(), true);
        if (p.checkLogo() == true)
        {
           System.out.println("Google Logo Displayed");
        }
    }


    @AfterMethod
    void teardown()
    {
    	BasePage.quit();
    }

}

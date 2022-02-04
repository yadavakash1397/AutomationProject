package SimpleTestNGExample;

import SimpleTestNGExample.BasePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass
{
    

    @BeforeMethod
    void setup()
    {
        BasePage.initialization();
    }

    @Test (priority = 1)
    void Checktitle()
    {
        System.out.println("Title is : "+BasePage.getTitle());
        Assert.assertEquals(BasePage.getTitle().equalsIgnoreCase(TestData.Title),true);
    }

    @Test (priority = 2)
    void Checkurl()
    {
        
        System.out.println("URL is : "+BasePage.getURL());
        Assert.assertEquals(BasePage.getURL().equalsIgnoreCase(TestData.URL),true);
    }

    @AfterMethod
    void teardown()
    {
    	BasePage.quit();
    }

}

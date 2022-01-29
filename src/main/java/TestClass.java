import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass
{
    BasePage bs=new BasePage();

    @BeforeMethod
    void setup()
    {
        bs.initialization();
    }

    @Test (priority = 1)
    void Checktitle()
    {
        String title=bs.driver.getTitle();
        System.out.println("Title is : "+title);
        Assert.assertEquals(title.equalsIgnoreCase("google"),true);
    }

    @Test (priority = 2)
    void Checkurl()
    {
        String url=bs.driver.getCurrentUrl();
        System.out.println("URL is : "+url);
        Assert.assertEquals(url.equalsIgnoreCase("https://www.google.com/"),true);
    }

    @AfterMethod
    void teardown()
    {
        bs.quit();
    }

}

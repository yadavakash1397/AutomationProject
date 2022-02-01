package SimpleTestNGExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;

public class BasePage
{
    private static WebDriver driver=null;

    public static void initialization()
  {
    if(driver==null)
    {
       WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get(TestData.URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
  }
    
    public static boolean getLogo(WebElement logo) {
    	boolean checklogo=logo.isDisplayed();
    	return checklogo;
    	
    }
    
    public static WebDriver returnDriver() {
    	return driver;
    }
    
    public static String getTitle() {
    	String title=driver.getTitle();
    	return title;
    }
    
    public static String getURL() {
    	String URL=driver.getCurrentUrl();
    	return URL;
    }

  public static void quit()
  {
      driver.quit();
      driver=null;
  }



}

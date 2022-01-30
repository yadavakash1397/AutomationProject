package SimpleTestNGExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage
{
    WebDriver driver=null;

    public void initialization()
  {
    if(driver==null)
    {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\91976\\IdeaProjects\\AutomationProject\\ChromeDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
  }

  public void quit()
  {
      driver.quit();
      driver=null;
  }



}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage
{
    WebDriver driver=null;


    public void initialization()
  {
    if(driver==null)
    {
        System.setProperty("webdriver.chrome.driver",
                "D:\\All about Software testing\\NEW START\\chromedriver 97 version\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

    }
  }

  public void quit()
  {
      driver.quit();
      driver=null;
  }



}

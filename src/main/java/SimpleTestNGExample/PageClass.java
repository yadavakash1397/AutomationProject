package SimpleTestNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageClass {

	public boolean checkLogo() {
		WebElement logo=BasePage.returnDriver().findElement(By.xpath(TestData.logo));
		return BasePage.getLogo(logo);
	}
}

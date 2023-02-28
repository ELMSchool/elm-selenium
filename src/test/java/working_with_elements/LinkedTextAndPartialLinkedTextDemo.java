package working_with_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTextAndPartialLinkedTextDemo {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slymn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		WebElement link = driver.findElement(By.linkText("ThemeRoller"));
//		link.click();
		
		
		WebElement partialLink = driver.findElement(By.partialLinkText("Theme"));
		partialLink.click();
	}

}

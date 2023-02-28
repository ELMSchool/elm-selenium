package working_with_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDeme2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slymn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		
		//<input class="wikipedia-search-input" id="Wikipedia1_wikipedia-search-input" type="text">
		
		//5.1 Starts With ^
//		WebElement searchBox = driver.findElement(By.cssSelector("input[id^='Wikipedia1']"));
//		searchBox.sendKeys("hello");
		
		//5.2 Ends With $
//		WebElement searchBox = driver.findElement(By.cssSelector("input[id$='input']"));
//		searchBox.sendKeys("hello");
		
		//5.3 Contains *
//		WebElement searchBox = driver.findElement(By.cssSelector("input[class*='input']"));
//		searchBox.sendKeys("bye");
		
		
		//6. Parent > Child
		WebElement searchBox = driver.findElement(By.cssSelector("span.wikipedia-input-box > input"));
		searchBox.sendKeys("?????");
		
	}

}

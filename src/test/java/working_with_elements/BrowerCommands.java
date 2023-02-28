package working_with_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slymn\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// tell webdriver that we are going to use ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//get(String url) -> loads the web page in the existing browser window
		driver.get("https://www.google.com/");
		
		//getTitle() -> gets the title of current web page. Returns a String
//		String title = driver.getTitle();
		
		//getCurrentUrl() -> fetches the current URL of current webPage. Returns String
//		driver.findElement(By.name("q")).sendKeys("apple"+Keys.ENTER);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
		
		//getPageSource() -> returns the source code of the current web page loaded
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		
		//close() -> terminates current browser window operated by Webdriver at the current time
//		driver.close();
		
		//quit() -> terminates All windows operated by Webdriver. Including All tabs
		driver.quit();
		
	}

}

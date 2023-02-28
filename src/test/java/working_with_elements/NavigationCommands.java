package working_with_elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slymn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//navigate().to() -> Allows the browser to load a new web page within existing browser window
		driver.navigate().to("https://www.google.com");
		
		//navigate().back() -> It allows the browser to go back to previous page in browser's history
		driver.navigate().to("https://www.elm.school");
		driver.navigate().back(); // we are coming back to google
		
		//navigate().forward() -> It allows the browser to go forward to next page in browser's history
		driver.navigate().forward(); //we are going forward to elm.school
		
		//navigate().refresh() -> reloads the current web page in existing browser window
		driver.navigate().refresh();
		
	}

}

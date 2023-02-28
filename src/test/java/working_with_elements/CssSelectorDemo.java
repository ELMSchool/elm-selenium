package working_with_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\slymn\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		//1. Tag + id
		WebElement wikiSearch = driver.findElement(By.cssSelector("input#Wikipedia1_wikipedia-search-input"));
		wikiSearch.sendKeys("Selenium");
		
		
		//2. Tag + className
		WebElement searchButton = driver.findElement(By.cssSelector("input.wikipedia-search-button"));
		searchButton.click();
	
		//3. Tag + attribute value
//		WebElement clickMe = driver.findElement(By.cssSelector("button[onclick='myFunction()']"));
//		clickMe.click();
		
		
		//4. Tag + className + Attribute
		WebElement wikiSearch2 = driver.findElement(By.cssSelector("input.wikipedia-search-input[type='text']"));
		wikiSearch2.sendKeys("hello");
	}

}

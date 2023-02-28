package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	
	public static void main(String[] args) {
		
		//C:\Users\slymn\Downloads\chromedriver_win32
		//setting ChromeDriver.exe
		
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\slymn\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		//tell webdriver that we are going to use ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//tell WebDriver that we are going to google.com
		driver.get("https://elm.school/");
		
		//tell WebDriver to find and store search box element
		WebElement searchBox = driver.findElement(By.name("q"));
		
		
		//send the String that we want to search
		searchBox.sendKeys("elm school sdet courses");
		
		//click Enter to search
		searchBox.sendKeys(Keys.ENTER);
	}

}

package driver_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomationWithEdgeDriver {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.msedge.driver", "C:\\Users\\slymn\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://elm.school/");
		
		WebElement coursesButton = driver.findElement(By.linkText("Courses"));
		
		coursesButton.click();
	}

}

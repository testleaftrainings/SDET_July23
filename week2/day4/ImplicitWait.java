package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();

		driver.get("https://www.facebook.com/");

		//findelement & findelements
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();

		driver.findElement(By.name("firstname")).sendKeys("Dilip");

	}

}

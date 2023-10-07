package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchClass {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
	    driver.findElement(By.className("MV3Tnb")).click();
	    driver.close();
	}

}

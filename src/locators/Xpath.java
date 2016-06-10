package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.className("button")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/div[1]/div/div[2]/a")).click();// Absolute xpath
		driver.navigate().back();
		driver.findElement(By.xpath(".//*[@id='banner-secondary']/div/div[1]/a")).click();//Relative xpath
		
		
	}

}

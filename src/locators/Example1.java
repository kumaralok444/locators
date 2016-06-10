package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example1 {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org/");
		WebElement we=driver.findElement(By.name("q"));
		we.clear();
		we.sendKeys("webdriver");
		WebElement we1=driver.findElement(By.id("submit"));
		we1.click();
		driver.navigate().back();
		we=driver.findElement(By.linkText("Projects"));
		we.click();
		driver.findElement(By.partialLinkText("edit")).click();
	}

}

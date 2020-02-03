package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akksh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver ChromeDriver=new ChromeDriver();
		ChromeDriver.get("http://demo.guru99.com/test/drag_drop.html");
		ChromeDriver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)(ChromeDriver);
		js.executeScript("arg[0].scrollintoview(false)",)
		WebElement drag=ChromeDriver.findElement(By.xpath("(//li[@data-id=\"2\"])[1]"));
		WebElement drop=ChromeDriver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
		WebElement Bank=ChromeDriver.findElement(By.xpath("//li[@data-id=\"5\"]"));
		WebElement debit=ChromeDriver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
		Actions ac=new Actions(ChromeDriver);
		ac.dragAndDrop(drag,drop).build().perform();
		ac.dragAndDrop(Bank,debit).build().perform();
		
		
	
		
	}


}

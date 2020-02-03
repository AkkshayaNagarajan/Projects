package practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Day1 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\akksh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://onecognizant.cognizant.com/");
driver.manage().window().maximize();
WebElement username=driver.findElement(By.xpath("//input[@id='userNameInput']"));
username.sendKeys("756208");
WebElement pswd=driver.findElement(By.xpath("//input[@id='passwordInput']"));
pswd.sendKeys("Lathajgvv!27");
WebElement login=driver.findElement(By.xpath("//input[@id='Log_On1']"));
login.click();
Thread.sleep(3000);
WebElement sec=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
sec.click();
WebElement aclist=driver.findElement(By.xpath("//input[@id=\"txtPlatformBarSearch\"]"));
Actions ac=new Actions(driver);
ac.moveToElement(aclist).build().perform();
ac.sendKeys(aclist, "one Transport").build().perform();
Thread.sleep(1000);
WebElement but=driver.findElement(By.xpath("//input[@type=\"button\"]"));
but.click();
Thread.sleep(10000);
//WebElement app=driver.findElement(By.xpath("//ul[@class=\"appBox\"]"));
//ac.doubleClick(app).build().perform();
WebElement trans=driver.findElement(By.xpath("(//div[@class='inActive'])[1]"));
//trans.click();
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("argument[0].click()", trans);
ac.moveToElement(trans).build().perform();
ac.doubleClick(trans).build().perform();
}

}

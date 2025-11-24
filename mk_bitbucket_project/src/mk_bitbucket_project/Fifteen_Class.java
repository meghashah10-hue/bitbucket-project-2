package mk_bitbucket_project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fifteen_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("/html/body/div/div[1]/div[3]/div/div/form/div/div/span/span/button")).click();
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
		action.moveToElement(element).perform();
		
		
	}

}

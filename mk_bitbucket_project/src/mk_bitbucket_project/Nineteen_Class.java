package mk_bitbucket_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nineteen_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("53920");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String alert1 = driver.switchTo().alert().getText();

		System.out.println(alert1);
		
	}

}

package mk_bitbucket_project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eight_Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://petstore.octoperf.com/");
		driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
		Thread.sleep(3000);
		//UserInformation
		driver.findElement(By.name("username")).sendKeys("megha.kothari");
		driver.findElement(By.className("password")).sendKeys("12345678");
		driver.findElement(By.className("repeatedPassword")).sendKeys("12345678");
		Thread.sleep(3000);
		//Account Information
		driver.findElement(By.className("account.firstName")).sendKeys("Megha");
		driver.findElement(By.className("account.lastName")).sendKeys("Kothari");
		driver.findElement(By.className("account.email")).sendKeys("megha.kotahri@appunik.com");
		driver.findElement(By.className("account.phone")).sendKeys("123789456");
		driver.findElement(By.className("account.address1")).sendKeys("Ahmedabad");
		driver.findElement(By.className("account.address2")).sendKeys("Ahmedabad");
		driver.findElement(By.className("account.state")).sendKeys("Gujarat");
		driver.findElement(By.className("account.country")).sendKeys("India");
		driver.findElement(By.className("account.languagePreference")).sendKeys("english");
		
		driver.findElement(By.className("newAccount")).click();
		
		driver.findElement(By.className("username")).sendKeys("megha.kothari");
		driver.findElement(By.className("password")).sendKeys("12345678");
		Thread.sleep(3000);
		driver.findElement(By.name("signon")).click();
		
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
	}
	
	
	

}

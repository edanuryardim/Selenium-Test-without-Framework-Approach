package testcase;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyFirstTest {

	public static void main(String[] args) {
		
		
		
	
		WebDriver driver = new ChromeDriver();   //base
	
		driver.get("https://www.liyaneon.com/");   // locators --properties
		
		driver.findElement(By.xpath("//span[@class='background-overlay']")).click();   // 

	
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("YOURMAIL");
		driver.findElement(By.xpath("//input[@placeholder='Şifreniz']")).sendKeys("YOURPASSWORD");
		driver.findElement(By.xpath("//button[contains(text(),'Giriş Yap')]")).click();
		
		
		
		
		 

	}

}

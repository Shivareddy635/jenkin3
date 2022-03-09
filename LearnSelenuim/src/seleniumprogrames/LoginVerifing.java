package seleniumprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginVerifing {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Testing softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("shivareddy634@gmail.com");
	    driver.findElement(By.id("Password")).sendKeys("shiva@1");
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	    driver.findElement(By.linkText("Log out")).click();
	    
	}
}
		
		
		
			
		
		
			
			
			
		
			
	   
		
	



package testNGporamdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginVerifing {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Testing softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		
		driver.manage().window().maximize();
		
		String expectedtitle="Demo web shop. login";
		
		String actualtitle=driver.getTitle();
		
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println(actualtitle);
			System.out.println("Correct page");
			driver.findElement(By.id("Email")).sendKeys("shivareddy634@gmail.com");
		    driver.findElement(By.id("Password")).sendKeys("shiva@1");
		    driver.findElement(By.xpath("//inputclick();[@class='button-1 login-button']"));
		    driver.findElement(By.linkText("Log out")).click();
		    driver.close();	
		}
			
		else
		{
			System.out.println("Incorrect page");
			System.out.println(actualtitle);
			driver.close();
		}
			
	   
		
	}

}

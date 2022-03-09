package seleniumprogrames;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Testing softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
        System.out.println("The title of thre main window" +driver.getTitle());
        
        WebElement tabwindow=driver.findElement(By.xpath("//a//button[@class='btn btn-info']"));
        
        tabwindow.click();
        
        Set<String>window=driver.getWindowHandles();
        
        
        
        
        
	}

}

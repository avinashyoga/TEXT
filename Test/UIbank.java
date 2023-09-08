package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UIbank {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://uibank.uipath.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@class='btn btn-white btn-xl get-started-button']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Avinash");
		
		WebElement findElement1 = driver.findElement(By.xpath("//select[@name='title']"));
		
		Select DropDowm=new Select(findElement1);
		
		DropDowm.selectByVisibleText("Mr");driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Y");
		
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='gender']"));
		
		Select Gender=new Select(findElement2);
		
		Gender.selectByVisibleText("Male");
		
		WebElement findElement3 = driver.findElement(By.xpath("//select[@name='employmentStatus']"));
		
		Select Employee=new Select(findElement3);
	
		Employee.selectByVisibleText("Full-time");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Avinash");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("avinashyoga2@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Avinash@950025");
		
		//driver.close();
		
		
		
		
		
		
		
	}

}

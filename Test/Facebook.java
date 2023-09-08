package Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Avinash");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("avinashyogabalan");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8778496446");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Avinash@950025");
		
		WebElement findElement = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select Dropdown=new Select(findElement);
	    
	    Dropdown.selectByVisibleText("2");	    
	    
	    WebElement findElement2 = driver.findElement(By.xpath("//select[@id='year']"));
	    
	    Select Dateofyear=new Select(findElement2);
	    
	    Dateofyear.selectByValue("1999");
	     
	    driver.findElement(By.xpath("//label[text()='Male']")).click();
	    
	    driver.close();
		
	}

}

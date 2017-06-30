package mc626.mc626;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AndreTest extends FTest {
	
	@Test
	public void createForum() throws InterruptedException{	
	
		logAdmin("Admin", "ADMIN");
	
		driver.findElement(By.id("adminpanel")).click();
		Thread.sleep(300);
		driver.findElement(By.id("forums")).click();
		Thread.sleep(300);
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(300);		
		WebElement link = driver.findElement(By.name("forum_name"));
		link.sendKeys("Fórum");
		Thread.sleep(300);
		
		driver.findElement(By.name("submit"));
	}
	
	@Test
	public void logAdmin(String username, String pass) throws InterruptedException{
		
		driver.get("http://localhost:8080/jforum/user/login.page");
		
		WebElement link = driver.findElement(By.name("username"));
		link.sendKeys(username);
		link = driver.findElement(By.name("password"));
		link.sendKeys(pass);
		
		link = driver.findElement(By.name("login"));
		link.click();
		Thread.sleep(300);
	}

}

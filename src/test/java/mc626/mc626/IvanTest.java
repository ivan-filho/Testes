package mc626.mc626;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IvanTest extends FTest {

	@Test
	public void runTest() throws InterruptedException {
		teste1();
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
	
	@Test
	public void teste1() throws InterruptedException {
		logAdmin("Admin", "admin");
	}		
}

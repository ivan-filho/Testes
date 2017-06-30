package mc626.mc626;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FTest {

	public WebDriver driver;
	public String site = "http://localhost:8080/jforum/";
	
	@Test
	public void test() throws Exception {
		setUp();
		enterSite(site);
		
		Thread.sleep(800);	
		
		andreTest();
	}
	
	public void setUp() throws Exception {
		String target = System.getProperty("zap.targetApp");
		if (target != null && target.length() > 0) {
			// Theres an override
			site = target;
		}
		System.setProperty("webdriver.chrome.driver", "/home/cc2011/ra085893/chromedriver");
		this.setDriver(new ChromeDriver());
	}
	
	
	protected void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterSite(String target) throws InterruptedException{
		this.driver.get(target);
			
	}
	
	public void andreTest() throws InterruptedException {
		logAdmin("Admin", "ADMIN");
		createForum();
	}
	
	public void createForum() throws InterruptedException{	
		driver.findElement(By.id("adminpanel")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("forums")).click();
		Thread.sleep(300);
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(300);		
		WebElement link = driver.findElement(By.name("forum_name"));
		link.sendKeys("Fórum");
		Thread.sleep(300);
		
		driver.findElement(By.name("submit"));
	}
	
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

/*
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit

public class FTest {
	
	private WebDriver driver;
	private String site = "http://localhost:8080/jforum/";
	
	public void setUp() throws Exception {
		String target = System.getProperty("zap.targetApp");
		if (target != null && target.length() > 0) {
			// Theres an override
			site = target;
		}
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		this.setDriver(new ChromeDriver());
	}
	
	
	protected void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterSite(String target) throws InterruptedException{
		this.driver.get(target);
		Thread.sleep(10000);
	}
	
	
	public static void main(String args []) throws Exception{
		final String site = "http://localhost:8080/jforum/";
		FTest test = new FTest();
		test.setUp();
		test.enterSite(site);
	}

	*/

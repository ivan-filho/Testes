package mc626.mc626;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FTest {

	private WebDriver driver;
	private String site = "http://localhost:8080/jforum/";
	
	@Test
	public void test() throws Exception {
		setUp();
		enterSite(site);
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
		Thread.sleep(10000);
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

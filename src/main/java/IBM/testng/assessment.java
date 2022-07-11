package IBM.testng;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assessment {
	WebDriver driver;
	
	//@BeforeMethod
	public void initial()
	{
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();  //open my browser
		//driver.get("http://elearningm1.upskills.in/");
	}
	
	public int getrandom()
	{
		Random rand = new Random();
		String soc = "qwertyuiopasdfghjklzxcvbnm";
		int randint = rand.nextInt(soc.length());
		char randchar = soc.charAt(randint);
		//Random rand2 = new Random();
		return randchar;
	}
	@Test
	public void testcase1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//lib//chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://elearningm1.upskills.in/");
		System.out.println("test case 1");
		
		//driver.findElement(By.linkText("http://elearningm1.upskills.in/main/auth/inscription.php")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Sign up!')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("a"+getrandom());
		driver.findElement(By.name("lastname")).sendKeys("a"+getrandom());
		driver.findElement(By.name("email")).sendKeys("a"+getrandom()+"@d.com");
		driver.findElement(By.name("username")).sendKeys("a"+getrandom());
		driver.findElement(By.name("pass1")).sendKeys("dinesh123");
		driver.findElement(By.name("pass2")).sendKeys("dinesh123");
		driver.findElement(By.name("submit")).click();
		//driver.findElement(By.name("next")).click();
		driver.findElement(By.xpath("//*[@id='menuone']/ul[2]/li[1]/a/span")).click();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Inbox')])")).click();
		driver.findElement(By.xpath("//*[@id='menuone']/ul[2]/li[1]/ul/li/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='toolbar']/div/div[1]/a[1]/img")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ddd");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='asdkkk ddd']")).click();
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys("dinesh123");
		driver.findElement(By.xpath("//button[@name='compose']")).click();
		Thread.sleep(3000);
		driver.quit();
		//driver.findElement(By.xpath("//*[@id='login']")).sendKeys("dfghjk");
	}
	public void testcase2()
	{
		String expected = "The message has been sent to asdkkk ddd";
		String executed = driver.findElement(By.xpath("//*[@id='top_main_content']/div/div/div/div[2]/div/div[2]/div")).getText();
		SoftAssert obj = new SoftAssert();
		obj.assertEquals(executed, expected);
		obj.assertAll();

	}
	
	
	//@AfterMethod
	public void finall()
	{
		System.out.println("message sent");
	}
	}


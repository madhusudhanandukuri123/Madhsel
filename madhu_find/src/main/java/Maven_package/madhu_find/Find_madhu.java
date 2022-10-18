package Maven_package.madhu_find;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Find_madhu 
{ 
	@Test(priority=1)
	public static void madhuf() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.google.co.in/");
		
		/*driver2.findElement(By.xpath("//input")).sendKeys("Hyderabad");
	//	driver2.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[1]/div[2]/div/ul/li/span")).click();
		Thread.sleep(3000);
		driver2.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[1]/div[2]/div/ul/li")).click();
		Thread.sleep(3000);
		driver2.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/div[3]/div[1]/div[2]/div/div/div/div[2]/div/div[1]/div[1]/a/div/div[3]/div[1]/div")).click();*/
        //driver2.findElement(By.xpath("//input[@class='gLFyf gsfi'] ")).sendKeys("https://www.goibibo.com/");
        //driver2.findElement(By.xpath("//input[@id='query']")).sendKeys("selenium java");
		driver2.findElement(By.xpath("//a[@class='gb_A']")).click();
		//System.out.println(driver2.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[4]/div[1]/article/section[5]/p")).getText());

		//driver2.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		
		//driver2.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[4]/div/div[2]")).click();
		//driver2.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[6]/div[2]/div[1]/h2/a")).click();

		//driver2.findElement(By.xpath("//input[@placeholder='Email address or mobile number']")).sendKeys("madhusudhan");
		
		//driver2.findElement(By.xpath("//button")).click();
		//String s = driver2.findElement(By.xpath("//input[@placeholder='Email address or mobile number']")).getAttribute("placeholder");
       //  System.out.println(s);*//
		
		
	}
	/*@Test(priority=0)
	public static void madhuc() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.goibibo.com/");
		
		
	}
	@Test(priority=2)
	public static void madhud() 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.amazon.in/");*/
		
		
	}




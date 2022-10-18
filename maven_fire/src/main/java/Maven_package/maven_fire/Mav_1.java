package Maven_package.maven_fire;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mav_1 
{
	@Test
	public static void maven_fire()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver1 = new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://in.bookmyshow.com/");
	}

}

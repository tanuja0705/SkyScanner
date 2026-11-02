package flightBooking.SkyScanner.scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Case1_Test {
	@Test
	public void cheapFlight_Test() throws Exception {
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.skyscanner.co.in/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h1[text()='Are you a person or a robot?']")).sendKeys(Keys.TAB,Keys.ENTER);

		driver.findElement(By.id("originInput-input")).clear();
		driver.findElement(By.id("originInput-input")).sendKeys("Mumbai (BOM)");
		
		driver.findElement(By.id("destinationInput-input")).clear();
		driver.findElement(By.id("destinationInput-input")).sendKeys("Delhi");
		
	}
}

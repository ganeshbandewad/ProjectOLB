package admin_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tc004_Delet_Service {

	 public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Driver\\chromedriver.exe" );

	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://183.82.103.245:8888/BankingProject/LoginFormBuild1.jsp");
	  driver.findElement(By.name("username")).sendKeys("nareshit");
	  driver.findElement(By.name("password")).sendKeys("nareshit");
	  driver.findElement(By.name("Submit")).click();
	  
	  Actions ac = new Actions(driver);
	  WebElement we =driver.findElement(By.linkText("Services"));
	  ac.moveToElement(we).moveByOffset(50, 50).click().build().perform();
	  System.out.println("mouseover Done");
	  System.out.println("Clicked On view services");
	  Thread.sleep(3000);
	    



	  driver.findElement(By.name("TypeId")).click();
	  driver.findElement(By.name("Delete")).click();

	  Thread.sleep(5000);
	  driver.close();
	 
	  System.out.println("done");
	 }
}

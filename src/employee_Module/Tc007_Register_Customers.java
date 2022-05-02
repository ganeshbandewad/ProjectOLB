package employee_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tc007_Register_Customers {
	 public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Driver\\chromedriver.exe" );

	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("http://183.82.103.245:8888/BankingProject/LoginFormBuild1.jsp");
	  driver.findElement(By.name("username")).sendKeys("7uy");
	  driver.findElement(By.name("password")).sendKeys("7i");
	  driver.findElement(By.name("Submit")).click();
	  Actions ac = new Actions(driver);
	  WebElement we =driver.findElement(By.linkText("Customers"));

ac.moveToElement(driver.findElement(By.linkText("Customers"))).perform();

ac.moveToElement(we).moveByOffset(20, 20).click().build().perform();
driver.findElement(By.name("accountInitialBalance")).sendKeys("7i");
driver.findElement(By.name("firstname")).sendKeys("abcd");
driver.findElement(By.name("lastname")).sendKeys("xyz");
driver.findElement(By.name("hno")).sendKeys("752");
driver.findElement(By.name("street")).sendKeys("2");
driver.findElement(By.name("pincode")).sendKeys("153248");
driver.findElement(By.name("phoneNo")).sendKeys("45632178996");
driver.findElement(By.name("email")).sendKeys("1254@gmail.com");
driver.findElement(By.name("loginID")).sendKeys("abde");
driver.findElement(By.name("password")).sendKeys("12345");
driver.findElement(By.name("secretqans")).sendKeys("jadhfhh");
driver.findElement(By.name("Input")).click();
Thread.sleep(3000);
driver.close();
	 }}    

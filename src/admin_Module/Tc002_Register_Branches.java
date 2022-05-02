package admin_Module;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc002_Register_Branches {

 public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Driver\\chromedriver.exe" );

  //WebDriverManager.chromedriver().setup();
  WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get("http://183.82.103.245:8888/BankingProject/LoginFormBuild1.jsp");
  driver.findElement(By.name("username")).sendKeys("nareshit");
  driver.findElement(By.name("password")).sendKeys("nareshit");
  driver.findElement(By.name("Submit")).click();
  
  Actions ac = new Actions(driver);
  WebElement we =driver.findElement(By.linkText("Branches"));
  ac.moveToElement(we).moveByOffset(20, 20).click().build().perform();
  System.out.println("mouseover Done");
  System.out.println("Clicked On Register Branches");
  Thread.sleep(3000);
    
  
  driver.findElement(By.xpath("//textarea[@name='branchAddr']")).sendKeys("Bengalore");
  driver.findElement(By.name("branchEmailId")).sendKeys("abc@gmail.com");
  driver.findElement(By.name("branchPhNo1")).sendKeys("51426789");
  driver.findElement(By.name("branchPhNo2")).sendKeys("51426789");
  driver.findElement(By.name("branchPhNo3")).sendKeys("71426789");
  driver.findElement(By.name("Register")).click();
  Thread.sleep(3000);
  Thread.sleep(5000);
  driver.findElement(By.linkText("Logout")).click();
  Thread.sleep(2000);
  driver.close();
  System.out.println("done");
 }
}
package admin_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
public class TC001_Register_Employee {
	public static void main(String args[]) throws Exception{

	System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Driver\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://183.82.103.245:8888/BankingProject/LoginForm.jsp");
	
	driver.findElement(By.name("username")).sendKeys("nareshit");
	driver.findElement(By.name("password")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
     System.out.println("login completed");
     Actions ac = new Actions (driver);
      ac.moveToElement(driver.findElement(By.linkText("Employees"))).perform();
      // driver.findElement(By.xpath("//td[@align='center'][@height='314']")).click();
      //driver.findElement(By.xpath("//td[@align='center'][@height='314']")).click();
     //ac.moveToElement(driver.findElement(By.linkText("Register Employees"))).perform();
     driver.findElement(By.linkText("Register Employees")).click();
      System.out.println("mouseover completed");
      //driver.findElement(By.linkText("br")).click();

     //ac.moveToElement(driver.findElement(By.xpath("//td[@height='314'][@align='center']"))).click().perform();
      System.out.println("2nd mouseover completed");
     // driver.findElement(By.xpath("//td[@height='314'][@align='center']")).click();
Thread.sleep(3000);
//WebElement registerEmployee = driver.findElement(By.xpath("//td[@height='314'][@align='center']"));
//Select st = new Select(driver.findElement(By.linkText("Employees")));
//registerEmployee.click();
//st.selectByVisibleText("Register Employees");
       System.out.println(" completed");


}
	
}

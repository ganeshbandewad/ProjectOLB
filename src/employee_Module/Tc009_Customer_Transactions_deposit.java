package employee_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tc009_Customer_Transactions_deposit {
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

ac.moveToElement(we).moveByOffset(70, 70).click().build().perform();
Thread.sleep(2000);
Select st = new Select(driver.findElement(By.name("transactiontype")));
st.selectByVisibleText("Depoist");


driver.findElement(By.name("accountno")).sendKeys("548962545865");
driver.findElement(By.name("amount")).sendKeys("15000");
driver.findElement(By.name("Send")).click();
Thread.sleep(2000);

driver.close();

	 
}
}

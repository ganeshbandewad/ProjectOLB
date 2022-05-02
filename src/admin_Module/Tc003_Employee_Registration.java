package admin_Module;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Tc003_Employee_Registration {

 public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Driver\\chromedriver.exe" );


  WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get("http://183.82.103.245:8888/BankingProject/LoginForm.jsp");
  driver.findElement(By.name("username")).sendKeys("nareshit");
  driver.findElement(By.name("password")).sendKeys("nareshit");
  driver.findElement(By.name("Submit")).click();
  //MouseOver
  Actions ac = new Actions(driver);
  WebElement employees =driver.findElement(By.linkText("Employees"));
 
  ac.moveToElement(employees).moveByOffset(40, 40).click().build().perform();
  System.out.println("mouseover Done");
  System.out.println("Clicked On Register Emp");
  Thread.sleep(3000);
  //DropDown
 
  Select st = new Select(driver.findElement(By.xpath("//select[@name='branchaddress']")));
  st.selectByVisibleText("ABC");
  //driver.switchTo().defaultContent();
  driver.findElement(By.name("accountInitialBalance")).sendKeys("5000");
  driver.findElement(By.name("firstname")).sendKeys("pushpa");
  driver.findElement(By.name("lastname")).sendKeys("pushparaj");
  WebElement child = driver.findElement(By.xpath("//img[@alt='a']"));
  //Windows Handle
  
  // parent window
  String parent = driver.getWindowHandle();
  System.out.println("parent Windo: "+parent);
  //child Window
  child.click(); 
  Set<String>kids = driver.getWindowHandles();
  for(String kid : kids ) {
   System.out.println(kid);
   if(!kid.equals(parent)) {
    driver.switchTo().window(kid);
    WebElement time = driver.findElement(By.name("time"));
    time.clear();
    time.sendKeys("1996");
    driver.findElement(By.xpath("//input[@value='Get']")).click();
    driver.findElement(By.xpath("//img[@alt='next month']")).click(); 
    driver.findElement(By.xpath("//img[@alt='next month']")).click();
    driver.findElement(By.xpath("//img[@alt='next month']")).click();
    driver.findElement(By.xpath("//font[normalize-space()='15']")).click();

   }
  }

  //default Window
  driver.switchTo().window(parent);
  /*
  ArrayList<String> windinfo = new ArrayList<>(driver.getWindowHandles());
  driver.switchTo().window(windinfo.get(1));
  System.out.println("switched to new wind");
  driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[4]/a/font")).click();
  System.out.println("clicked on get btn");
  */
  
  
  
  driver.findElement(By.name("hno")).sendKeys("2/89");
  driver.findElement(By.name("street")).sendKeys("pakka Street");
  Select slc =new Select(driver.findElement(By.name("city")));
  slc.selectByVisibleText("Mumbai");
  driver.switchTo().defaultContent();
  driver.findElement(By.name("pincode")).sendKeys("460037");
  driver.findElement(By.name("phoneNo")).sendKeys("8794561230");
  driver.findElement(By.name("email")).sendKeys("xyz@gmail.com");
  driver.findElement(By.name("loginID")).sendKeys("abc123");
  driver.findElement(By.name("password")).sendKeys("abc123");
  WebElement que =driver.findElement(By.name("secretqid"));
  Select Q =new Select(que);
  Q.selectByVisibleText("Who your childhood hero?");
  driver.findElement(By.name("secretqans")).sendKeys("Ganu");
  Thread.sleep(4000);
  driver.findElement(By.name("Input")).click();
  Thread.sleep(5000);
  driver.findElement(By.linkText("Logout")).click();
  Thread.sleep(5000);

  driver.close();
  
 }
}
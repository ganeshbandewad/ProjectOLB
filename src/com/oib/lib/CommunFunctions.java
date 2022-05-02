package com.oib.lib;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.oib.utility.Log;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommunFunctions extends GlobalData{

	 public  void openApplication() throws Exception {
			System.setProperty("webdriver.chrome.driver","D://Softwares//Driver//chromedriver.exe" );
			  driver = new ChromeDriver();
			 driver.navigate().to(url);
			 driver.manage().window().maximize();
			System.out.println("Applicaton Opened");
			Log.info("application opened");
	 }
	 public  void login() throws Exception {
		  driver.findElement(By.name(txtusrnm)).sendKeys(admnusrnm);
		  driver.findElement(By.name(txtpswrd)).sendKeys(admnpswrd);
		  driver.findElement(By.name(btnlgin)).click();
			System.out.println("login completed");	
			Log.info(" login completed");


	 }
	 

	 public  void logout() throws Exception {
		  driver.findElement(By.linkText(lnklgout)).click();
	 }
	 
			 public  void closeApplication() throws Exception {
				 driver.close();
			 }
			 
			 
			 public  void branchRegister() throws Exception {
				 Actions ac = new Actions(driver);
				  WebElement we =driver.findElement(By.linkText(brnch));
				  ac.moveToElement(we).moveByOffset(20, 20).click().build().perform();
				  System.out.println("mouseover Done");
				  System.out.println("Clicked On Register Branches");
				  Thread.sleep(3000);
				    
				  
				  driver.findElement(By.xpath(txtbrnchaddrss)).sendKeys(adrs);
				  driver.findElement(By.name(txtbrnchemlid)).sendKeys(emailid);
				  driver.findElement(By.name(txtbrnchphnnmbr)).sendKeys(phone1);
				  driver.findElement(By.name(txtbrnchphnnmbr2)).sendKeys(phone2);
				  driver.findElement(By.name(txtbrnchphnnmbr3)).sendKeys(phone3);
				  driver.findElement(By.name(btnrgstr)).click();
				  Thread.sleep(3000);

				  driver.findElement(By.linkText(lnklgout)).click();
				  Thread.sleep(2000);
			 }
	
			 public  void registerEmployee() throws Exception {
				  Actions ac = new Actions(driver);
				  WebElement employees =driver.findElement(By.linkText(btnemply));
				 
				  ac.moveToElement(employees).moveByOffset(40, 40).click().build().perform();
				  System.out.println("mouseover Done");

				  Thread.sleep(3000);
				
				  Select st = new Select(driver.findElement(By.xpath("//select[@name='branchaddress']")));
				  st.selectByVisibleText("ABC");
				  driver.findElement(By.name(txtacntintlblnc)).sendKeys("5000");
				  driver.findElement(By.name(txtfrstnm)).sendKeys("pushpa");
				  driver.findElement(By.name(txtlstnm)).sendKeys("pushparaj");
				  WebElement child = driver.findElement(By.xpath("//img[@alt='a']"));
				  String parent = driver.getWindowHandle();
				  System.out.println("parent Windo: "+parent);
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

				   }}
				  driver.switchTo().window(parent);
				  driver.findElement(By.name(txthsno)).sendKeys("2/89");
				  driver.findElement(By.name(txtstrt)).sendKeys("pakka Street");
				  Select slc =new Select(driver.findElement(By.name("city")));
				  slc.selectByVisibleText("Mumbai");
				  driver.switchTo().defaultContent();
				  driver.findElement(By.name(txtpncd)).sendKeys("460037");
				  driver.findElement(By.name(txtphnno)).sendKeys("8794561230");
				  driver.findElement(By.name(txteml)).sendKeys("xyz@gmail.com");
				  driver.findElement(By.name(txtlgnid)).sendKeys("abc123");
				  driver.findElement(By.name(txtpswd)).sendKeys("abc123");
				  WebElement que =driver.findElement(By.name("secretqid"));
				  Select Q =new Select(que);
				  Q.selectByVisibleText("Who your childhood hero?");
				  driver.findElement(By.name(scrtqstn)).sendKeys("Ganu");
				  Thread.sleep(4000);
				  driver.findElement(By.name(btnrgstr1)).click();
					Log.info(" registered employee");

				 
				 
			 }
				 
			
			 public  void deletservice() throws Exception {
				 
				  Actions ac = new Actions(driver);
				  WebElement we =driver.findElement(By.linkText(lnksrvcs));
				  ac.moveToElement(we).moveByOffset(50, 50).click().build().perform();
				  System.out.println("mouseover Done");
				  System.out.println("Clicked On view services");
				  Thread.sleep(3000);
				    



				  driver.findElement(By.name(clckchckbx)).click();
				  driver.findElement(By.name(btndlt)).click();
				  System.out.println("mouseover Done");

				  Thread.sleep(5000);
				  System.out.println("Deleted ");

					Log.info(" delet services  ");

					 
			 }
				 
				 
			 public  void registerservice() throws Exception {
	 
				 Actions ac = new Actions(driver);
				  WebElement we =driver.findElement(By.linkText(lnksrvcs));
				  ac.moveToElement(we).moveByOffset(20, 20).click().build().perform();
				  System.out.println("mouseover Done");

				  Thread.sleep(3000);
				    
				  driver.findElement(By.name(txtsrvcnm)).sendKeys("nareshit");
				  driver.findElement(By.name(txtsrcdscptn)).sendKeys("nareshit");
				  driver.findElement(By.name(txtsrcactvstt)).sendKeys("nareshit");
				  driver.findElement(By.name(btnrgstr)).click();
				  System.out.println("registration completed ");
					Log.info(" services registers ");


			 }
		 
}

package com.obj.Browser;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.obj.Bubble_Login.Bubble_Login;
import com.obj.LoginPage.LoginPage;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;

@SuppressWarnings("unused")
public class Browser_Init_Grid
{
   public WebDriver driver;
   public String URL, Node;
   protected ThreadLocal<RemoteWebDriver> threadDriver = null;
   
   @Parameters("browser")
   @BeforeTest
   public void launchapp(String browser) throws MalformedURLException
   {
      String URL = "https://159.182.18.93/index.jhtml?redirecturl=https://testoddworld.wallstreetenglish.com/";
      
      if (browser.equalsIgnoreCase("chrome"))
      {
         System.out.println(" Executing on Chrome");
         String Node = "http://10.98.5.176:5557/wd/hub";
         DesiredCapabilities cap = DesiredCapabilities.chrome();
         cap.setBrowserName("chrome");
         
         driver = new RemoteWebDriver(new URL(Node), cap);
         // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         // Launch website
         driver.navigate().to(URL);
         driver.manage().window().maximize();
         
         //Login Features
         
         try {
 			
 			Bubble_Login bl = new Bubble_Login(driver);
 			
 			bl.Is_Bubble_Login_Page_Enabled();
 			
 			bl.Is_Bubble_Login_Page_Displayed();
 			
 			bl.Get_Bubble_Login();
 			
 			bl.Is_User_Name_Field_Enabled();
 			
 			bl.Is_User_Name_Field_Displayed();
 			
 			bl.Insert_User_Name();
 			
 			bl.Is_Password_Field_Enabled();
 			
 			bl.Is_Password_Field_Displayed();
 			
 			bl.Insert_Password();
 			
 			bl.Is_Login_Button_Enabled();
 			
 			bl.Is_Login_Button_Displayed();
 			
 			bl.Click_Login_Button();
 			
 			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
 			
 			/*LoginPage lp = new LoginPage(driver);

 			lp.LoginTextIsdisplayed();

 			lp.UserNameFieldDidplayed();

 			lp.UserNamePlaceHoldeIsDisplayed();

 			lp.PasswordFieldDidplayed();

 			lp.PasswordPlaceHoldeIsDisplayed();

 			lp.selectUserToggle();*/
 			
 			WebDriverWait wait = new WebDriverWait(driver,200);
 			
 			WebElement We = driver.findElement(By.cssSelector("span.glyphicon.glyphicon-remove"));
 			
 			wait.until(ExpectedConditions.elementToBeClickable(We));
 			
 			We.click();
 			
 			Thread.sleep(3000);
 			
 		} 
 		catch (Exception e) 
 		{
 			System.out.println("Login Failed");
 		}
      }
      else if (browser.equalsIgnoreCase("firefox"))
      {
         System.out.println(" Executing on FireFOX");
         DesiredCapabilities cap = DesiredCapabilities.firefox();
         cap.setBrowserName("firefox");
         String Node = "http://10.98.5.176:5555/wd/hub";
         driver = new RemoteWebDriver(new URL(Node), cap);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         // Launch website
         driver.navigate().to(URL);
         driver.manage().window().maximize();
         
         //Login Features
         
         try {
 			
 			Bubble_Login bl = new Bubble_Login(driver);
 			
 			bl.Is_Bubble_Login_Page_Enabled();
 			
 			bl.Is_Bubble_Login_Page_Displayed();
 			
 			bl.Get_Bubble_Login();
 			
 			bl.Is_User_Name_Field_Enabled();
 			
 			bl.Is_User_Name_Field_Displayed();
 			
 			bl.Insert_User_Name();
 			
 			bl.Is_Password_Field_Enabled();
 			
 			bl.Is_Password_Field_Displayed();
 			
 			bl.Insert_Password();
 			
 			bl.Is_Login_Button_Enabled();
 			
 			bl.Is_Login_Button_Displayed();
 			
 			bl.Click_Login_Button();
 			
 			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
 			
 			/*LoginPage lp = new LoginPage(driver);

 			lp.LoginTextIsdisplayed();

 			lp.UserNameFieldDidplayed();

 			lp.UserNamePlaceHoldeIsDisplayed();

 			lp.PasswordFieldDidplayed();

 			lp.PasswordPlaceHoldeIsDisplayed();

 			lp.selectUserToggle();*/
 			
 			WebDriverWait wait = new WebDriverWait(driver,200);
 			
 			WebElement We = driver.findElement(By.cssSelector("span.glyphicon.glyphicon-remove"));
 			
 			wait.until(ExpectedConditions.elementToBeClickable(We));
 			
 			We.click();
 			
 			Thread.sleep(3000);
 			
 		} 
 		catch (Exception e) 
 		{
 			System.out.println("Login Failed");
 		}
      }
      else if (browser.equalsIgnoreCase("ie"))
      {
         System.out.println(" Executing on IE");
         DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
         cap.setBrowserName("ie");
         String Node = "http://10.98.5.176:5558/wd/hub";
         driver = new RemoteWebDriver(new URL(Node), cap);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         // Launch website
         driver.navigate().to(URL);
         driver.manage().window().maximize();
 		
 		String st1 = driver.getTitle();
 		
 		String st = "Certificate Error: Navigation Blocked";
 		
 		try
 		{
 		
 		if(st1.contains(st)==true)
 		{
 		
 		driver.navigate().to(
 				"javascript:document.getElementById('overridelink').click()"); 
 		
 		Assert.assertEquals(driver.getTitle(), "Wall Street English"); 
 		
 		}
 		}
 		catch(Exception e)
 		{
 			System.out.println(e);
 		}
         
         //Login features
         
         try {
 			
 			Bubble_Login bl = new Bubble_Login(driver);
 			
 			bl.Is_Bubble_Login_Page_Enabled();
 			
 			bl.Is_Bubble_Login_Page_Displayed();
 			
 			bl.Get_Bubble_Login();
 			
 			bl.Is_User_Name_Field_Enabled();
 			
 			bl.Is_User_Name_Field_Displayed();
 			
 			bl.Insert_User_Name();
 			
 			bl.Is_Password_Field_Enabled();
 			
 			bl.Is_Password_Field_Displayed();
 			
 			bl.Insert_Password();
 			
 			bl.Is_Login_Button_Enabled();
 			
 			bl.Is_Login_Button_Displayed();
 			
 			bl.Click_Login_Button();
 			
 			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
 			
 			LoginPage lp = new LoginPage(driver);

 			lp.LoginTextIsdisplayed();

 			lp.UserNameFieldDidplayed();

 			lp.UserNamePlaceHoldeIsDisplayed();

 			lp.PasswordFieldDidplayed();

 			lp.PasswordPlaceHoldeIsDisplayed();

 			lp.selectUserToggle();
 			
 			WebDriverWait wait = new WebDriverWait(driver,200);
 			
 			WebElement We = driver.findElement(By.cssSelector("span.glyphicon.glyphicon-remove"));
 			
 			wait.until(ExpectedConditions.elementToBeClickable(We));
 			
 			We.click();
 			
 			Thread.sleep(3000);
 			
 		} 
 		catch (Exception e) 
 		{
 			System.out.println("Login Failed");
 		}
      }
      else if (browser.equalsIgnoreCase("safari"))
      {
         System.out.println(" Executing on host B");
         DesiredCapabilities cap = DesiredCapabilities.chrome();
         cap.setBrowserName("chrome");
         String Node = "http://10.98.6.184:5558/wd/hub";
         driver = new RemoteWebDriver(new URL(Node), cap);
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         
         // Launch website
         driver.navigate().to(URL);
         driver.manage().window().maximize();
         
         //Login features
         
         try {
 			
 			Bubble_Login bl = new Bubble_Login(driver);
 			
 			bl.Is_Bubble_Login_Page_Enabled();
 			
 			bl.Is_Bubble_Login_Page_Displayed();
 			
 			bl.Get_Bubble_Login();
 			
 			bl.Is_User_Name_Field_Enabled();
 			
 			bl.Is_User_Name_Field_Displayed();
 			
 			bl.Insert_User_Name();
 			
 			bl.Is_Password_Field_Enabled();
 			
 			bl.Is_Password_Field_Displayed();
 			
 			bl.Insert_Password();
 			
 			bl.Is_Login_Button_Enabled();
 			
 			bl.Is_Login_Button_Displayed();
 			
 			bl.Click_Login_Button();
 			
 			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
 			
 			LoginPage lp = new LoginPage(driver);

 			lp.LoginTextIsdisplayed();

 			lp.UserNameFieldDidplayed();

 			lp.UserNamePlaceHoldeIsDisplayed();

 			lp.PasswordFieldDidplayed();

 			lp.PasswordPlaceHoldeIsDisplayed();

 			lp.selectUserToggle();
 			
 			WebDriverWait wait = new WebDriverWait(driver,200);
 			
 			WebElement We = driver.findElement(By.cssSelector("span.glyphicon.glyphicon-remove"));
 			
 			wait.until(ExpectedConditions.elementToBeClickable(We));
 			
 			We.click();
 			
 			Thread.sleep(3000);
 			
 		} 
 		catch (Exception e) 
 		{
 			System.out.println("Login Failed");
 		}
      }
      else
      {
         throw new IllegalArgumentException("The Browser Type is Undefined");
      }
   }
   
   
   
   @AfterTest
   public void closeBrowser()
   {
	   try{
			LoginPage lp = new LoginPage(driver);

			lp.LogoutIsDisplayed();

			lp.LogoutIsEnabled();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			lp.LogoutClick();
			
			driver.close();

			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
 }

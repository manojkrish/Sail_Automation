package com.obj.Browser;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.jsoup.nodes.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.obj.Bubble_Login.Bubble_Login;
import com.obj.LoginPage.LoginPage;

@SuppressWarnings("unused")
public class BrowserInit {

	public WebDriver driver;

	@BeforeTest
	public void OpenBrowser() throws InterruptedException 
	{
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.navigate().refresh();

		driver.get("https://stageworld.wallstreetenglish.com.cn/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		try 
		{

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
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.findElement(By.cssSelector(".glyphicon.glyphicon-remove")).click();
			
			Thread.sleep(9000);

		} 
		catch (Exception e) 
		{
			System.out.println("Login Failed");
		}

	}
	
	
	
	/* @AfterTest
	  public void CloseBrowser() 
	  { 
		  try
		  { 
			  LoginPage lp = new
	  
			  LoginPage(driver);
	  
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
	}*/
	 

}

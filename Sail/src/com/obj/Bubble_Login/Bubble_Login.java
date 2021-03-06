package com.obj.Bubble_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bubble_Login implements Bubble_Login_Inter {
	
	public WebDriver driver;
	
	By Login_Page = By.xpath("/html/body/div[1]/div/div[1]/h1");
	
	By User_Name_Field = By.id("username");
	
	By Password_Field = By.id("password");
	
	By Login_Button = By.className("loginButton");
	
	public Bubble_Login(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public boolean Is_Bubble_Login_Page_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Login_Page);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(Login_Page));
		
		return  We.isEnabled();
		
	}
	
	public boolean Is_Bubble_Login_Page_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Login_Page);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(Login_Page));
		
		return  We.isDisplayed();
	}
	
	public String Get_Bubble_Login() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Login_Page);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(Login_Page));
		
		return  We.getText();
	
	}
	
	public boolean Is_User_Name_Field_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(User_Name_Field);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(User_Name_Field));
		
		return  We.isEnabled();
	}
	
	public boolean Is_User_Name_Field_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(User_Name_Field);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(User_Name_Field));
		
		return  We.isDisplayed();
	}
	
	public void Insert_User_Name() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(User_Name_Field);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(User_Name_Field));
		
		We.sendKeys("tensz.31680.cn");
		
	}
	
	public boolean Is_Password_Field_Enabled() {
			
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Password_Field);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(Password_Field));
		
		return  We.isEnabled();
	}
	
	public boolean Is_Password_Field_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Password_Field);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(Password_Field));
		
		return  We.isDisplayed();
	}
	
	public void Insert_Password() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Password_Field);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(Password_Field));
		
		We.sendKeys("Password123$");
	}
	
	public boolean Is_Login_Button_Enabled() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Login_Button);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(Login_Button));
		
		return  We.isEnabled();
	}
	
	public boolean Is_Login_Button_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Login_Button);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(Login_Button));
		
		return  We.isDisplayed();
	}

	public void Click_Login_Button() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Login_Button);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(Login_Button));
		
		We.click();
		
	}
	

}

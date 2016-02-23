package com.obj.About;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class About implements About_inter{
	
		public WebDriver driver;
	
		By MyWse = By.linkText("MyWSE"); 
		
		By My_Profile = By.linkText("My Profile");

		By About = By.id("student-general-info-tab");
	 
	    By Edit_Button= By.id("edit-personal-data");
	    
	    By Student_Email_Id = By.id("student-profile-edit-email");
	    
	    By Student_Mobile_telephone =  By.id("student-profile-edit-mobile-telephone");  
	    
	    By Student_home_telephone = By.id("student-profile-edit-home-telephone");  
	      
	    By Student_work_telephone = By.id("student-profile-edit-work-telephone");
	   
	    By Social_Network_1 = By.id("student-profile-edit-social-network1");
	    
	    By Social_Network_2 = By.id("student-profile-edit-social-network2");
	    
	    By Social_Network_3 = By.id("student-profile-edit-social-network3");
	    
	    By Social_Network_4 = By.id("student-profile-edit-social-network4");
	    
	    By Preferred_Contact = By.id("student-profile-edit-preferred-contact");
	    
	    By Gender = By.id("student-profile-edit-gender");
	    
	    By Nationality = By.id("student-profile-edit-nationality");
	    
	    By Native_Language = By.id("student-profile-edit-native-language");
	    
	    By Secondary_Language = By.id("student-profile-edit-secondary-language");
	    
	    By Personal_motivation = By.id("student-profile-edit-personal-motivation");
	    
	    By Profession = By.id("student-profile-edit-profession");
	    
	    By Buisness = By.xpath("//input[@value='Business']");  
	    
	    By Career =  By.xpath("//input[@value='Career']");  
	    
	    By Fun = By.xpath("//input[@value='Fun']");
	     
	    By Studies = By.xpath("//input[@value='Studies']");  
	     
	    By Travel = By.xpath("//input[@value='Travel']");  
	    
	    By About_Me = By.xpath("/html/body/div[2]/div[2]/div[3]/div/main/div/div[2]/div/div/div/form/section[2]/div/div[1]/div/textarea"); 
	    
	    By Interests_and_hobbies = By.xpath("/html/body/div[2]/div[2]/div[3]/div/main/div/div[2]/div/div/div/form/section[2]/div/div[2]/div/textarea");  
	       
	    By Why_I_Study_English = By.xpath("/html/body/div[2]/div[2]/div[3]/div/main/div/div[2]/div/div/div/form/section[2]/div/div[4]/div/textarea");
	    
	    By Submit = By.id("student-profile-edit-submit");
	    
	    By Territory = By.id("student-profile-edit-nationality");

		
	    
	    public About(WebDriver driver)
	    {
	    	this.driver= driver;
	    }
	    
	    public boolean Is_MyWse_Displayed() {
	    	
	    	WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(MyWse);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
	    			 
			return We.isDisplayed();
	    	
		}

		
		public void click_MyWse() {
			
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(MyWse);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
	    			 
			We.click();
			 
		}

		
		public boolean My_Profile_Displayed() {
			
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(My_Profile);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
	    			 
			return We.isDisplayed();
			 
		}

		
		public void Click_My_Profile() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(My_Profile);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
	    			 
			We.click();
			
		}

		
		public boolean Is_About_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(About);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
	    			 
			return We.isDisplayed();
		}

		
		public void Click_About() {
			
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(About);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
	    			 
			We.click();
			
		}

		
		public boolean Is_Edit_Displayed() {
			
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Edit_Button);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Click_Edit() {
			
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Edit_Button);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			We.click();
			
		}

		
		public boolean Is_Email_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Student_Email_Id);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Insert_Email() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Student_Email_Id);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
	    	
	    	We.clear();
			
			We.sendKeys("Student@gmail.com");
			
		}

		
		public boolean Is_Mobile_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Student_Mobile_telephone);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Insert_Mobile() {
			
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Student_Mobile_telephone);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
	    	
	    	We.clear();
			
			We.sendKeys("044-789-6789");
			 
			
		}

		
		public boolean Is_Home_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Student_home_telephone);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Insert_Home() {
			
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Student_home_telephone);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
	    	
	    	We.clear();
			
			We.sendKeys("044-789-6789");
			 
			
		}

		
		public boolean Is_Work_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Student_work_telephone);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Insert_Work() {
			
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Student_work_telephone);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
	    	
	    	We.clear();
			
			We.sendKeys("044-789-6789"); 
			
		}

		
		public boolean Is_Social_Network_1_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Social_Network_1);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Social_Network_1() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Social_Network_1));
			
			sel.selectByIndex(1);
			
		}

		
		public boolean Is_Social_Network_2_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Social_Network_2);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Social_Network_2() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Social_Network_1));
			
			sel.selectByIndex(2);
			 
			
		}

		
		public boolean Is_Social_Network_3_Field_Displayed() {
			
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Social_Network_3);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
			 
			
		}

		
		public void Select_Social_Network_3() {
			 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Social_Network_3));
			
			sel.selectByIndex(3);
		}

		
		public boolean Is_Social_Network_4_Field_Displayed() {
			
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Social_Network_4);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
			 
			
		}

		
		public void Select_Social_Network_4() {
			 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Social_Network_4));
			
			sel.selectByIndex(4);
		}

		
		public boolean Is_Preferred_Contact_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Preferred_Contact);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Preferred_Contact() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Preferred_Contact));
			
			sel.selectByIndex(1);
			 
			
		}

		
		public boolean Is_Gender_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Gender);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Gender() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Gender));
			
			sel.selectByIndex(1);
			 
			
		}

		
		public boolean Is_Nationality_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Nationality);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Nationality() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Nationality));
			
			sel.selectByIndex(1);
			 	
		}

		
		public boolean Is_Native_Language_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Native_Language);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Native_Language() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Native_Language));
			
			sel.selectByIndex(3);
			
			 
			
		}

		
		public boolean Is_Secondary_Language_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Secondary_Language);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Secondary_Language() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Secondary_Language));
			
			sel.selectByIndex(1);
			 
			
		}

		
		public boolean Is_Personal_motivation_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Personal_motivation);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Personal_motivation() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Personal_motivation));
			
			sel.selectByIndex(1);
			 
			
		}

		
		public boolean Is_Profession_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Profession);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Profession() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Profession));
			
			sel.selectByIndex(1);
			 
			
		}

		
		public boolean Is_Buisness_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Buisness);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Buisness() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Buisness));
			
			sel.selectByIndex(1);
			 	
		}

		
		public boolean Is_Career_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Career);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Career() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Career));
			
			sel.selectByIndex(1);
			 
			
		}

		
		public boolean Is_Fun_Field_Displayed() {
			
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Fun);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
			 
			}

		
		public void Select_Fun() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Fun));
			
			sel.selectByIndex(1);
			 
			
		}

		
		public boolean Is_Studies_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Studies);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Studies() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Studies));
			
			sel.selectByIndex(1);
			 
			
		}

		
		public boolean Is_Travel_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Travel);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Travel() {
			 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Travel));
			
			sel.selectByIndex(1);
			
		}

		
		public boolean Is_About_Me_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(About_Me);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_About_Me() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(About_Me);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
	    	
	    	We.clear();
	    	
	    	We.sendKeys("Update the About me from Automation");
			
		}

		
		public boolean Is_Interests_and_hobbies_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Interests_and_hobbies);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Interests_and_hobbies() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(About_Me);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
	    	
	    	We.clear();
	    	
	    	We.sendKeys("Update the Interests_and_hobbies from Automation");
			
		}

		
		public boolean Is_Why_I_Study_English_Field_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Why_I_Study_English);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Why_I_Study_English() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(About_Me);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
	    	
	    	We.clear();
	    	
	    	We.sendKeys("Update the Why_I_Study_English from Automation");
		}

		
		public boolean Is_Submit_Displayed() {
			 
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Submit);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Submit() {
			
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Submit);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
	    	We.click();			
		}

	
		public boolean Is_Territory_Displayed() {
			
			WebDriverWait wait = new WebDriverWait(driver,10);
	    	
	    	WebElement We = driver.findElement(Territory);
	    	
	    	wait.until(ExpectedConditions.elementToBeClickable(We));
			
			return We.isDisplayed();
		}

		
		public void Select_Territory() {
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			Select sel = new Select(driver.findElement(Territory));
			
			sel.selectByValue("3");
				
		}
	    
	    }


package com.obj.Discussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Discussion implements Sail_Discussion_Interface{
	
	public WebDriver driver;
	
	By Connect = By.xpath("html/body/div[2]/div[1]/nav[2]/div/div[3]/ul[1]/li[3]/a");
	
	By Discussion = By.linkText("Discussions");//By.xpath("html/body/div[2]/div[1]/nav[2]/div/div[3]/ul[1]/li[3]/ul/li[3]/a");
	
	By All_Check_Box = By.xpath("html/body/div[2]/div[2]/div[3]/div/div/div/div[1]/div/accordion/div/div/div[2]/div/div[1]/label/input");
	
	By Result_Count = By.xpath("html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/div/div[1]/div/span[2]");

	By Discussion_Input_Box = By.xpath(".//*[@id='discussion-search']/div/div[1]/input");
	
	By Discussion_Result_Count = By.xpath("html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/div/div[1]/div/span");
	
	By Discussion_Result_title = By.xpath("html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/div");
	
	By No_More_Result_Found = By.xpath("html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/div/span");
	
	By Click_Result = By.xpath("html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/div/div[2]");
	
	By Discussion_Tile = By.xpath("html/body/div[2]/div[2]/div[3]/div/div/div/div[2]/div/div[2]/discussion/div/h2");
	
	By Discussion_Replies_Text_box = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[1]/div/div/discuss-widget/section/div[1]/section/div/div/div[1]");
	
	By Discussion_Replies_Post_Button = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[1]/div/div/discuss-widget/section/div[2]/ul/li[2]/button");
	
	By Discussion_Replies_OPtion_Button = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[1]/div/div/section/ul/li[1]/dc-preview/section/section/div[1]/div[2]/div/button");
	
	By Discussion_Replies_Edit_Button = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[1]/div/div/section/ul/li[1]/dc-preview/section/section/div[1]/div[2]/div/ul/li[1]/a");
	
	By Discussion_Replies_Edit = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[1]/div/div/section/ul/li[1]/dc-preview/section/section/div[3]/div[1]/div/div");
	
	By Discussion_Replies_Edit_Done_Button = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[1]/div/div/section/ul/li[1]/dc-preview/section/section/div[3]/div[2]/button[1]");
	
	By Discussion_Replies_Delete_Button = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[1]/div/div/section/ul/li[1]/dc-preview/section/section/div[1]/div[2]/div/ul/li[2]/a");
	
	By Discussion_Delete_Popup = By.xpath("/html/body/div[4]/div/div/div[1]");
	
	By Discussion_Delte_Popup_Delete_Button = By.xpath("/html/body/div[4]/div/div/div[3]/button[2]");
	
	public Discussion(WebDriver driver)
	{
		
		this.driver = driver;
		
	}

	public boolean Is_Connect_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Connect);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	
	}

	public void Click_Connect() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Connect);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	public boolean Is_Discussions_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void Click_Discussions() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}



	
	public boolean Is_All_Category_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(All_Check_Box);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
		 
	}



	
	public void Click_All_Category() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(All_Check_Box);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	public boolean Is_All_Result_displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Result_Count);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public String Get_All_result_Count() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Result_Count);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		String st = We.getText();
		
		return st;
	}

	public void Unclick_All_Category() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(All_Check_Box);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}

	public boolean Is_Search_Input_Box_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Input_Box);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
		
	}
	
	public void Enter_The_Search() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Input_Box);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.sendKeys("What");
		
	}

	
	public boolean Is_Discussion_Tile_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Tile);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	
	public void Click_Discussion_Page() {
	
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Tile);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	
	public boolean Is_Discussion_Reply_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Replies_Text_box);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
		
	}


	public void Enter_Discussion_Reply() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Replies_Text_box);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.sendKeys("HI would you like to follow the Discussion");
	}


	public void click_Discussion_Reply_Post_Btn() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Replies_Post_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
	}

	public boolean Is_Discussion_Btn_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Replies_OPtion_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
		 
	}

	public void Click_Discussion_Btn() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Replies_OPtion_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
		
		
	}

	public boolean Is_Edit_Option_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		WebElement We = driver.findElement(Discussion_Replies_Edit_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void Click_Edit_Option() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Replies_Edit_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}


	public boolean Is_Edit_Text_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Replies_Edit);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void Insert_Text_Edit() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Replies_Edit);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.sendKeys("HI This Replies is Edited");
		
	}

	public boolean Edit_Done_Button_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Replies_Edit_Done_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
		
		
	}
	
	public void Click_Edit_Done_Button() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Replies_Edit_Done_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}


	public boolean Is_Delete_Option_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Replies_Delete_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}


	public void Click_Delete_Option() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Replies_Delete_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		We.click();
	}

	public boolean Is_Delete_Popup_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Delete_Popup);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public boolean Is_Delete_popup_Delete_Button_Displayed() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Delte_Popup_Delete_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
		
		return We.isDisplayed();
	}

	public void Click_Delete_Popup_Delete_Button() {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement We = driver.findElement(Discussion_Delte_Popup_Delete_Button);
		
		wait.until(ExpectedConditions.elementToBeClickable(We));
	
		We.click();
		
	}
	
	
	
	
	
}

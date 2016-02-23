package com.obj.Practice_Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Practice_Activity {
	
	public WebDriver driver;
	
	By Learn = By.xpath("/html/body/div[2]/div[1]/nav[2]/div/div[3]/ul[1]/li[2]/a");

	By Practice = By.xpath("/html/body/div[2]/div[1]/nav[2]/div/div[3]/ul[1]/li[2]/ul/li[4]/a");

	By Page_Name = By.xpath("/html/body/div[2]/div[2]/div[4]/section/div/div/section");

	By Practice_Content = By.xpath("/html/body/div[2]/div[2]/div[4]/div");


	public Practice_Activity(WebDriver driver)
	{
		this.driver = driver;
	}

	
}

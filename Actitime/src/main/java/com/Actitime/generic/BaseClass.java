package com.Actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class BaseClass{
@BeforeTest
	public void OpenBrowser(){
	Reporter.log("Succuesfully open",true);}
@BeforeMethod
public void login() {
	Reporter.log("Login is sucuessful",true);
}
@AfterMethod
public void logout() {
	Reporter.log("Logout SUccuss",true);
}
@AfterTest
public void CloseBrowser() {
	Reporter.log("Succuessfully Closed",true);

	
}
}

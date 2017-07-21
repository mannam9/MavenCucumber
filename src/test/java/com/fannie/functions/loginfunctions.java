package com.fannie.functions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginfunctions {
	public static WebDriver driver;
	static String baseURL = "https://github.com/";

	public static void driverIntitilization() {

		System.setProperty("webdriver.chrome.driver", "C:\\071717\\ALLJars\\chromedriver.exe");
		
		//driver = new ChromeDriver();
		driver = (WebDriver) new ChromeDriver();

	}

	public static void OpenUrl() {
		driverIntitilization();
		driver.get(baseURL);
		driver.getCurrentUrl();
		String openedURL = driver.getCurrentUrl();
		System.out.println("Opend URL is : " + openedURL);

	}
	
	public void SignIn(){
		
		driver.findElement(By.xpath("html/body/div[1]/header/div/div/div/a[1]")).click();
		System.out.println("User clicked on Signin Link");
		
		
	}
	
	public static void UserName(String Uname){
		
		driver.findElement(By.id("login_field")).sendKeys(Uname);
		System.out.println("User entered user name!");
	}
	
	public static void PassWord(String Pwrd){
		
		driver.findElement(By.id("password")).sendKeys(Pwrd);
		System.out.println("User entered Password!");
		
	}
	
	public static void GetIn(){
		
		driver.findElement(By.name("commit")).click();
		System.out.println("user Clicked in Sign!");
		
	}
	
	public static void VerifyLogin(){
		// Write code here that turns the phrase above into concrete actions
		// throw new PendingException();
		String vExpected = "Start a project";
		String vActual = "";

		vActual = driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/div/div/a[2]")).getText();

		// Assert.assertEquals(vExpected, vActual);
		System.out.println(vExpected);
		System.out.println(vActual);
		// System.out.println("Passed!!!");

		if (vExpected.equals(vActual)) {

			System.out.println("Test Passed!!!");
		} else {
			System.out.println("Test Failed!!!");
		}

		driver.quit();
	}
	
	public static void invalidUnPw(){
	  
	  String InvalidUserOrPassword = driver.findElement(By.xpath("//*[@id='js-flash-container']/div/div")).getText();
	   
	  if (InvalidUserOrPassword.equals("Incorrect username or password.")){
		System.out.println("Login Failed due to: Incorrect User id or Password");
		System.out.println("Scenario 2 Message: " + InvalidUserOrPassword);
	  }
	  driver.quit();
			
	}
}

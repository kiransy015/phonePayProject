package com.GenericMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommonMethods {
	public void transferAmt(String sender,String receiver,String amount){
		System.setProperty("webdriver.chrome.driver","G:\\Kiran\\Java\\eclipseWorkSpace\\paypalProject\\Drivers\\chromedriver.exe");
		ChromeOptions chromeOptions= new ChromeOptions();
		chromeOptions.setBinary("C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		System.out.println("Transfering amt from "+sender+" to "+receiver+" of amount "+amount);
	}
}

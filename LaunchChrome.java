package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\nicep\\Aug2020_Selenium\\FirstSeleniumProject\\driver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.close();
       
    
       
	}

}

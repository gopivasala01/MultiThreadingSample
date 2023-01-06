package mainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RunnerClass implements Runnable
{

   public static void main(String[] args) 
   {
	   for(int i=0;i<5;i++)
	   {
		   RunnerClass r = new RunnerClass();
		   Thread t = new Thread(r);
            t.start();
	   }
	   
   }
   

public void run() 
{
	   WebDriverManager.chromedriver().setup();
	   
	   ChromeOptions options = new ChromeOptions();
	   
	 // options.setExperimentalOption("prefs", chromePrefs);
	//options.addArguments("--no-sandbox");
	//options.addArguments("--headless");
	//options.addArguments("window-size=1400,1500");
	//options.addArguments("--disable-gpu");
	
	//options.addArguments("start-maximized");
	//options.addArguments("enable-automation");
	//options.addArguments("--disable-infobars");
	//options.addArguments("--disable-dev-shm-usage");

	ChromeDriver driver = new ChromeDriver(options);	   
	   driver.get("https://app.propertyware.com/pw/login.jsp");
	   driver.findElement(By.name("email")).sendKeys("mds0418@gmail.com");
	   driver.findElement(By.name("password")).sendKeys("HomeRiver1#");
	   driver.findElement(By.xpath("//*[@value='Sign Me In']")).click();
}
	
}

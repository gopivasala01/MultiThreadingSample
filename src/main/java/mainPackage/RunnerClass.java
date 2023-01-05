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
	   ChromeDriver driver = new ChromeDriver(options);
	 // options.setExperimentalOption("prefs", chromePrefs);
	
	options.add_argument("--headless");
options.add_argument("window-size=1400,1500");
options.add_argument("--disable-gpu");
options.add_argument("--no-sandbox");
options.add_argument("start-maximized");
options.add_argument("enable-automation");
options.add_argument("--disable-infobars");
options.add_argument("--disable-dev-shm-usage");

	   
	   driver.get("https://app.propertyware.com/pw/login.jsp");
	   driver.findElement(By.name("email")).sendKeys("mds0418@gmail.com");
	   driver.findElement(By.name("password")).sendKeys("HomeRiver1#");
	   driver.findElement(By.xpath("//*[@value='Sign Me In']")).click();	
}
	
}

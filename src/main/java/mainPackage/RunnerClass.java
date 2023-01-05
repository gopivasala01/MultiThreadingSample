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
	options.addArguments("--no-sandbox");
	options.addArguments("--headless"); //!!!should be enabled for Jenkins
	options.addArguments("--disable-dev-shm-usage"); //!!!should be enabled for Jenkins
	//options.addArguments(--window-size=1920x1080); //!!!should be enabled for Jenkins
	
	

	
	   
	   driver.get("https://app.propertyware.com/pw/login.jsp");
	   driver.findElement(By.name("email")).sendKeys("mds0418@gmail.com");
	   driver.findElement(By.name("password")).sendKeys("HomeRiver1#");
	   driver.findElement(By.xpath("//*[@value='Sign Me In']")).click();	
}
	
}

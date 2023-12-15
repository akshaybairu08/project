package FirstProject.FirstProject;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrolldown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Browsers\\chromedriver.exe")   ;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      
  
  driver.get("https://formy-project.herokuapp.com/scroll");
 WebElement name = driver.findElement(By.id("name"));
  Actions action = new  Actions(driver);
  action.moveToElement(name);
  name.sendKeys("AKSHAY BAIRU");
   WebElement date = driver.findElement(By.id("date"));
   date.sendKeys("04/08/1995");
	}

}

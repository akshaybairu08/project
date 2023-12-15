package FirstProject.FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
      
    	System.setProperty("webdriver.chrome.driver","D:\\Browsers\\chromedriver.exe")   ;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/keypress");
  WebElement name = driver.findElement(By.id("name"));
  name.click();
  name.sendKeys("AKSHAY BAIRU");
  WebElement button = driver.findElement(By.id("button"));
  button.click();
  Thread.sleep(2000);
  driver.get("https://formy-project.herokuapp.com/autocomplete");
  Thread.sleep(2000);
driver.get("https://formy-project.herokuapp.com/scroll");

        
        
        }
}

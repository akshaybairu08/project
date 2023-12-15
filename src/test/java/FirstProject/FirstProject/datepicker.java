package FirstProject.FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Browsers\\chromedriver.exe")   ;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
     driver.get("https://formy-project.herokuapp.com/datepicker");
     WebElement date = driver.findElement(By.id("datepicker"));
     date.sendKeys("04/08/1995");
     date.sendKeys(Keys.RETURN);
     
     
     
     
	}
	

}

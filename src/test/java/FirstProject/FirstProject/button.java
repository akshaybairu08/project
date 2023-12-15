package FirstProject.FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Browsers\\chromedriver.exe")   ;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/checkbox");
         WebElement button = driver.findElement(By.id("checkbox-1"));
          WebElement button1 = driver.findElement(By.id("checkbox-2"));
          WebElement button2 = driver.findElement(By.id("checkbox-3"));
          
          button1.click();
          
          
	}

}

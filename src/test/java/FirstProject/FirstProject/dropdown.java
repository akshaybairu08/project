package FirstProject.FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Browsers\\chromedriver.exe")   ;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
   driver.get("https://formy-project.herokuapp.com/dropdown");
   
    WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
    dropdown.click();
    
    WebElement element =  driver.findElement(By.id("autocomplete"));
    Thread.sleep(2000);
    element.click();
    
	}
	}
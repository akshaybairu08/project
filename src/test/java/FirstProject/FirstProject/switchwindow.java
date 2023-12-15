package FirstProject.FirstProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class switchwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Browsers\\chromedriver.exe")   ;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/switch-window");
     WebElement alerts = driver.findElement(By.id("alert-button"));
     alerts.click();
    
     
      Alert alert = driver.switchTo().alert();
      alert.accept();
}
}
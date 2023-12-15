package FirstProject.FirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class completeform {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Browsers\\chromedriver.exe")   ;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/form");
        WebElement form = driver.findElement(By.id("first-name"));
        form.sendKeys("akshay");
        driver.findElement(By.id("last-name")).sendKeys("bairu");
        driver.findElement(By.id("job-title")).sendKeys("automation tester");
        driver.findElement(By.id("radio-button-1")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.id("select-menu")).click();
        driver.findElement(By.cssSelector("option[value='2']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("04/08/1995");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='btn btn-lg btn-primary']")).click();
       // driver.findElement(By.linkText("btn btn-lg btn-primary")).click();
      //  driver.findElement(By.className("btn btn-lg btn-primary")).click();
  //     driver.findElement(By.cssSelector(".btn btn-lg btn-primary")).click();

	}

}

package my001.datadriven;



import java.nio.channels.SelectableChannel;
import java.time.Duration;

import javax.swing.text.DefaultEditorKit.InsertContentAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class webdriver {

	public static void main(String[] args) throws InterruptedException {

		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.orangehrm.com/");
		 
		 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(0));
		 
		 WebElement acception = wait.until(ExpectedConditions.elementToBeClickable(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowallSelection")));
		 acception.click();
		 
		 WebElement contact= driver.findElement(By.linkText("Contact Sales"));
		 contact.click();
		 
		 WebElement name = driver.findElement(By.id("Form_getForm_FullName"));
		 name.sendKeys("Gopal Hnade");
		 
		 WebElement id = driver.findElement(By.id("Form_getForm_Email"));
		 
		 id.sendKeys("gopalhande97@gmail.com");
		 
		 WebElement phone = driver.findElement(By.id("Form_getForm_Contact"));
		 
		 phone.sendKeys("9322860076");
		 
		 
		 WebElement country  =  driver.findElement(By.id("Form_getForm_Country"));
		 
		 
		 Select select = new Select(country);
		 
		 select.selectByContainsVisibleText("India");
		 
		 
		 WebElement company = driver.findElement(By.id("Form_getForm_CompanyName"));
		 
		 company.sendKeys("mindscript technology");
		 
		 WebElement job = driver.findElement(By.id("Form_getForm_JobTitle"));
		 
		 job.sendKeys("QA Tester");
		 
		 
		  Select selectSize = new Select(driver.findElement(By.id("Form_getForm_NoOfEmployees")));
	        selectSize.selectByVisibleText("11 - 50");
		 
		 
		 WebElement text = driver.findElement(By.id("Form_getForm_Comment"));
		 
		 text.sendKeys("sucessfukky submit");
		 
		 
		// WebElement captacha = driver.findElement(By.id("recaptcha-anchor-label"));
		 
		 // captacha.click();
		 
		 Thread.sleep(3000);
		 
		 WebElement submit = driver.findElement(By.name("action_submitForm"));
		 
		 submit.click();

	}

}


package ArunTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
 
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
 
public class PackageInfoTest {
	 @BeforeMethod
	   public void setUp() {
	        // Set up ChromeDriver (make sure chromedriver is in your PATH)
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      
	        
	    }
	  private WebDriver driver;
	   private WebDriverWait wait;
  @Test
	  public void testFlySmileRegistration() throws InterruptedException {
	        
	        // Step 1: Navigate to registration page and assert title/URL
	        driver.get("https://www.flysmiles.com/flysmiles/user-login");
	        Thread.sleep(2000); // Wait for page navigation
	        
	        String loginUrl = driver.getCurrentUrl();
	        String loginPageTitle = driver.getTitle();
	        
	        System.out.println("Login Page URL: " + loginUrl);
	        System.out.println("Login Page Title: " + loginPageTitle);
	        
	        // Assert login page URL
	        Assert.assertTrue(loginUrl.contains("login") || loginUrl.contains("signin"),
	                         "Expected to navigate to login page, but current URL is: " + loginUrl);
	        
	        // Assert login page title
	        Assert.assertFalse(loginPageTitle.isEmpty(), "Login page title should not be empty");
	        
	        // Step 4: Manual email verification step
	       // System.out.println("\n" + "=".repeat(60));
	        System.out.println("MANUAL STEP REQUIRED:");
	        System.out.println("1. Check your email inbox for verification link");
	        System.out.println("2. Click the verification link in your email");
	        System.out.println("3. Set your password as prompted");
	        System.out.println("4. Press Enter here to continue or close the browser...");
	       // System.out.println("=".repeat(60));
	       
	        System.out.println("Test completed successfully!");
	    
	   // private void fillRegistrationForm() {
	        try {
	        	WebElement register= driver.findElement(By.xpath("//a[text()='Register Now']"));
	        	register.click();
	        	Thread.sleep(3000);
	        	WebElement iframe = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));new Actions(driver).scrollToElement(iframe).perform();
	        	Thread.sleep(5000);
				WebElement titleDropdown =driver.findElement(
		               By.xpath("//*[@id=\"mat-select-0\"]"));
	        	titleDropdown.click();
	        	Thread.sleep(3000);
				
	        	//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	        	//wait.until(ExpectedConditions.elementToBeClickable(titleDropdown));
	        	WebElement mrOption = driver.findElement(By.xpath("//*[@id=\"mat-option-4\"]/span/small"));
	        	mrOption.click();
	            // Fill First Name
	            WebElement firstName = driver.findElement(By.xpath("//input[@id='mat-input-2']"));
	            firstName.sendKeys("Arun");
	            // Fill Last Name
	            WebElement familyName = driver.findElement(
	                By.xpath("//input[@id='mat-input-3']"));
	            familyName.sendKeys("NV");
	            
	            // Fill Email
	            WebElement email = driver.findElement(
	                By.xpath("//input[@id='mat-input-4']"));
	            email.sendKeys("narayanasamy.arun@gmail.com");
	            
		            WebElement countryCode = driver.findElement(
			                By.xpath("//input[@id='mat-input-8']"));
		            countryCode.sendKeys("+91");
		        
	            
	            // Fill Phone Number
	            WebElement phone = driver.findElement(
	                By.xpath("//input[@id='mat-input-9']"));
	            phone.sendKeys("7502098294");
	            
	            // Fill Date of Birth (if present)
	            
	                WebElement dob = driver.findElement(
	                    By.xpath("//input[@placeholder='MM/DD/YYYY']"));
	                dob.click();
	                
	                //Thread.sleep(5000);
	                
	                WebElement year = driver.findElement(
		                    By.xpath("(//span[@class='mdc-button__label'])[1]"));
	                year.click();
					
					WebElement arrow = driver.findElement(
		                    By.xpath("(//button[@type='button'])[5]"));
					arrow.click();
					WebElement year1 = driver.findElement(
		                    By.xpath("//span[text()=' 1995 ']"));
					year1.click();
					
					WebElement month = driver.findElement(
		                    By.xpath("//span[text()=' SEP ']"));
					month.click();
					WebElement day = driver.findElement(
		                    By.xpath("//span[text()=' 20 ']"));
					day.click();
					
					   WebElement country = driver.findElement(
			                    By.xpath("//input[@id='mat-input-6']"));
			                if (country.getTagName().equals("select")) {
			                    Select countrySelect = new Select(country);
			                    countrySelect.selectByVisibleText("India");
			                } else {
			                   
			                    country.sendKeys("India");
			                }
			                Thread.sleep(10000);
			                WebElement country1 = driver.findElement(
				                    By.xpath("//mat-option[@id='mat-option-118']"));
							country1.click();
							
							 WebElement city = driver.findElement(
						                By.xpath("//input[@id='mat-input-7']"));
							 city.sendKeys("Chen");
				           
				     Thread.sleep(10000);
						WebElement city1 = driver.findElement(
				            By.xpath("(//span[@class='mdc-list-item__primary-text'])[28]"));
						city1.click();
						
						
				            
				           Thread.sleep(5000);
				            
						Robot robot = new Robot();  
						
						robot.keyPress(KeyEvent.VK_DOWN);  // Presses the 'B' key  
			             
			            robot.keyRelease(KeyEvent.VK_DOWN);
//			            
			            robot.keyPress(KeyEvent.VK_ENTER);  // Presses the 'B' key  
			             
		            robot.keyRelease(KeyEvent.VK_ENTER);
		            
		            Thread.sleep(10000);
		            
		            WebElement selectCity = driver.findElement(
				            By.xpath("//mat-option[@role='option']"));
						selectCity.click();
				WebElement iframe1 = driver.findElement(By.xpath("//button[@type='submit']"));new Actions(driver).scrollToElement(iframe1).perform();
	                
	                
	               	            // Accept Privacy Policy
	            
	                WebElement privacyCheckbox = driver.findElement(
	                    By.xpath("(//div[@class='mdc-checkbox'])[5]"));
	                privacyCheckbox.click();
	                
	                WebElement joinNow = driver.findElement(
		                    By.xpath("//span[text()='Join Now']"));
	                joinNow.click();
	              
	           
	            System.out.println("Registration form filled successfully!");
	            
	        } catch (Exception e) {
	            System.out.println("Error filling registration form: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }
  }

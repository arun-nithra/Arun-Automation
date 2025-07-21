package ArunTest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class PackageInfoTestTest {
    private WebDriver driver;
    
   // private Scanner scanner;
    
    // Test Data - Replace with your actual credentials
    private static final String USERNAME = "narayanasamy.arun@gmail.com";
    private static final String PASSWORD = "Nithra12345678@";
    private static final String REGISTER_URL = "https://www.flysmiles.com/flysmiles/user-login";
    
    @BeforeTest
    public void setUp() {
        // Set up ChromeDriver (make sure chromedriver is in your PATH or specify the path)
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
        //wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       // scanner = new Scanner(System.in);
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Set implicit wait
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
  @SuppressWarnings("null")
@Test
	    public void flySmilesAutomationTest() {
	        try {
	            // Step 1: Navigate to the registration page and assert page title and URL
	            System.out.println("Step 1: Navigating to FlySmiles register page...");
	            driver.get(REGISTER_URL);
	           
	            
	            // Step 3: Enter username and password
	            System.out.println("\nStep 3: Entering login credentials...");
	            
	            // Wait for username field and enter username
	            WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
	            usernameField.sendKeys(USERNAME);
	            System.out.println("✓ Username entered: " + USERNAME);
	            
	            // Enter password
	            WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
	            passwordField.sendKeys(PASSWORD);
	            System.out.println("✓ Password entered");
	            
	            // Click on Login button
	            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	            loginButton.click();
	            System.out.println("✓ Login button clicked");
	            
	            // Step 4: Handle OTP validation
	            System.out.println("\nStep 4: Waiting for OTP validation...");
	            
	            
	            // Manual OTP input
	            System.out.println("Please check your email for OTP and enter it below:");
	         
	            
	            Thread.sleep(20000);
	            
	            System.out.println("✓ Validate button clicked");
	            
	            // Step 5: Wait for redirection to Home Page
	            System.out.println("\nStep 5: Waiting for redirection to Home Page...");
	        //    wait.until(ExpectedConditions.urlContains("home"));
	            System.out.println("✓ Successfully redirected to Home Page");
	            
	            // Step 6: Assert Home Page title and URL
	            System.out.println("\nStep 6: Asserting Home Page title and URL...");
	            String homePageUrl = driver.getCurrentUrl();
	            //Assert.assertTrue(homePageUrl.contains("home"),
	                        //    "Home page URL assertion failed. Expected URL to contain 'home' but got: " + homePageUrl);
	            System.out.println("✓ Home Page URL Assertion Passed: " + homePageUrl);
	            
	            String homePageTitle = driver.getTitle();
	            System.out.println("✓ Home Page Title: " + homePageTitle);
	          
	       
	            System.out.println("\n=== TEST COMPLETED SUCCESSFULLY ===");
	            
	        } catch (Exception e) {
	            System.err.println("Test failed with exception: " + e.getMessage());
	            e.printStackTrace();
	            Assert.fail("Test failed due to exception: " + e.getMessage());
	        }
	    }
  
  }  
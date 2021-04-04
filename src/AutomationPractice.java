import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AutomationPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Page successfully loaded");
		
		driver.findElement(By.className("login")).click();
		System.out.println("Login successfully done");
		
		driver.findElement(By.id("email_create")).sendKeys("15203060@iubat.edu");
		System.out.println("Entering email successfully done");
		
		driver.findElement(By.id("SubmitCreate")).click();
		System.out.println("Account create successfully done");
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender2")));
		
		driver.findElement(By.id("id_gender2")).click();
		System.out.println("Gender Seelction done");
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Samia");
		System.out.println("First name typed");
		
		driver.findElement(By.id("customer_lastname")).sendKeys("Rahman");
		System.out.println("last name typed");
		
		driver.findElement(By.id("passwd")).sendKeys("12345");
		System.out.println("password typed");
		
		Select days = new Select(driver.findElement(By.id("days")));
		days.selectByValue("10");
		System.out.println("days selected");
		
		Select months = new Select(driver.findElement(By.id("months")));
		months.selectByValue("8");
		System.out.println("months selected");
		
		Select years = new Select(driver.findElement(By.id("years")));
		years.selectByValue("1985");
		System.out.println("years selected");
		
		driver.findElement(By.id("newsletter")).click();
		System.out.println("newsletter checkbox selected");
		
		driver.findElement(By.id("company")).sendKeys("Brain station");
		System.out.println("company name typed");
		
		driver.findElement(By.id("address1")).sendKeys("Wapda road, Ashish lane");
		System.out.println("Address typed");
		
		driver.findElement(By.id("address2")).sendKeys("6C, 162/1A, Ashish Lane");
		System.out.println("Address2 typed");
		
		driver.findElement(By.id("city")).sendKeys("Rampura");
		System.out.println("City typed");
		
		Select state = new Select(driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Arizona");
		System.out.println("State selected");
		
		driver.findElement(By.id("postcode")).sendKeys("1219");
		System.out.println("postcode typed");
		
		driver.findElement(By.id("other")).sendKeys("N/A");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("+8801722336655");
		System.out.println("Phone number typed");
		
		driver.findElement(By.id("alias")).sendKeys("Same as above");
		
		driver.findElement(By.id("submitAccount")).submit();
		System.out.println("Submit successfully");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		String email = driver.findElement(By.id("email")).getAttribute("value");
		if(email.equals("15203060@iubat.edu")) {
			System.out.println("Registration Ok");
		}
	}

}

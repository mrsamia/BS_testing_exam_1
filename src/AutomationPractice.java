import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	}

}

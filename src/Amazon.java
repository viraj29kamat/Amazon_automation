import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver,5);
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wrist watches");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//li[@id='p_n_feature_seven_browse-bin/1480900031']//label")).click();
		driver.findElement(By.xpath("//li[@id='p_n_material_browse/1480907031']//i[@class='a-icon a-icon-checkbox']")).click();
		driver.findElement(By.className("a-expander-prompt")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@id='p_89/Titan']//i[@class='a-icon a-icon-checkbox']")));
		driver.findElement(By.xpath("//li[@id='p_89/Titan']//i[@class='a-icon a-icon-checkbox']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'25% Off or more')]")));
		driver.findElement(By.xpath("//span[contains(text(),'25% Off or more')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\"Titan Analog Blue Dial Men's Watch-1864SL10\"]")));
		driver.findElement(By.xpath("//img[@alt=\"Titan Analog Blue Dial Men's Watch-1864SL10\"]")).click();
		driver.close();

	}

}

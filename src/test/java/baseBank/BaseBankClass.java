package baseBank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilityBank.TimeUtilisBank;

public class BaseBankClass {

	public static Properties prop=new Properties();
	public static WebDriver driver;
	
	public BaseBankClass() {
		
		try {
			
		FileInputStream file=new FileInputStream("C:\\Users\\harma\\eclipse-workspace\\ParaBankSite\\src\\test\\java\\environmentBank\\ConfigBank.properties");
	         prop.load(file);
		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException a) {
			a.printStackTrace();
		}
	}
	public static void initiate() {
		String browsername= prop.getProperty("browser");
		if (browsername.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			
			driver= new FirefoxDriver();}
			else if(browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "chrome.exe");
                driver= new ChromeDriver();
			}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TimeUtilisBank.timepage, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		}}
	


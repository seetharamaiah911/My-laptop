package selGCO;

import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class VerifyLogin {

	public static void VerifyLogin1() throws InterruptedException {
		
		System.setProperty("webdriver.ie.driver", "d:/LocalData/z010793/Desktop/Test leaf/IE driver/IE32/IEDriverServer.exe");
		InternetExplorerDriver driver =new InternetExplorerDriver();
		
		String baseUrl1 = "http://su416ars.mc2.renault.fr:20051/gco/ctrl/login";
		
		
		try 
		{
			driver.navigate().refresh();
			driver.get(baseUrl1);
			Runtime.getRuntime().exec("d:\\LocalData\\z010793\\Desktop\\Test leaf\\login.exe");
			Thread.sleep(500);				
		} 
		catch (UnhandledAlertException uae) 
		{
			driver.navigate().refresh();
			uae.printStackTrace();
			System.out.println("Failed in Unhandled Exception");			
		} 
		catch (Exception e) 
		{
			System.out.println("Failed on exeception");
		}
		System.out.println("Step 1 Passed");
		Thread.sleep(5000);
		
		
		driver.switchTo().frame("Data");


	}

}

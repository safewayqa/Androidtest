package Mobileauto;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Durations;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class realDevice {
public static AppiumDriver driver;
	
	@Test
	public static void lunchbrowser() throws MalformedURLException, Exception {
		
		
		/*
		 * AppiumDriverLocalService service=new AppiumServiceBuilder().withArgument(()
		 * -> "--base-path", "/wd/hub").withAppiumJS(new File(
		 * "C:\\Users\\nasee\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"
		 * )) .usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
		 * .withIPAddress("127.0.0.1").usingPort(4723).build(); service.start();
		 */
		
		AppiumDriverLocalService service;
		service = new AppiumServiceBuilder()
		       .withIPAddress("127.0.0.1")
		       .usingPort(4723)
		       .build();
		service.start();
		UiAutomator2Options op = new UiAutomator2Options();
		
		  op.setDeviceName("Rafi");
		  op.setUdid("emulator-5554");
		  op.setPlatformName("Android");
		  op.setPlatformVersion("5.0");
		  op.setAutomationName("UiAutomator2");
	      op.setCapability("autoAcceptAlerts", true);
	      op.setCapability("unicodeKeyboard", false); 
	      op.setCapability("resetKeyboard", false);
	      op.setCapability("no-reset"," false");
		  op.setAppPackage("com.meesho.supply");
		  op.setAppActivity("com.meesho.supply.main.MainActivity");
		  
	
		  
			System.out.println("Raif");
			driver= new AppiumDriver(new URL("http://127.0.0.1:4723"), op);
			Thread.sleep(5000);
		//	driver.get("https://google.com");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElements(By.className("android.widget.FrameLayout")).get(1).click();
		Thread.sleep(3000);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.meesho.supply:id/tvMale"))).click();
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//android.widget.TextView[@text='Men']")).click();
	//	Thread.sleep(3000);
    //    driver.findElement(By.xpath("//android.widget.TextView[1][contains(@resource-id,'com.meesho.supply:id/modal_text')and @text='Men']")).click();
		try {
		//	Thread.sleep(5000);
		//	driver.findElements(By.xpath("//android.view.View[@resource-id='com.meesho.supply:id/item_widget_high_level']")).get(2).click();
		//	Thread.sleep(5000);
		//  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text, 'Men')]")));
					
			
			driver.findElement(By.xpath("//*[contains(@text, 'Men')]")).click();
			
			System.out.println("Ram");
		}catch(Exception e) {
			System.out.println("Ram2");
			driver.findElement(By.xpath("//*[contains(@text, 'Men')]")).click();
			/*
			 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
			 * "//android.view.View[2][@resource-id='com.meesho.supply:id/modal_view']")));
			 * driver.findElement(By.xpath(
			 * "//android.view.View[2][@resource-id='com.meesho.supply:id/modal_view']")).
			 * click(); System.out.println("Ram3");
			 */
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[contains(@text, 'T Shirt')]")).click();
		
		Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.meesho.supply:id/catalog_cover']")).click();
        
        Thread.sleep(3000);
        driver.findElement(By.id("com.meesho.supply:id/primary_cta")).click();
        Thread.sleep(1000);
     //   driver.findElements(By.xpath("//android.widget.CompoundButton[@resource-id='com.meesho.supply:id/radio_variation']")).get(4).click();
       try {
        driver.findElements(By.className("android.widget.CompoundButton")).get(1).click();
        Thread.sleep(1000);
       }catch(Exception e) {
    	   driver.findElements(By.className("android.widget.CompoundButton")).get(0).click();
           Thread.sleep(1000);
       }
        driver.findElement(By.id("com.meesho.supply:id/primary_cta")).click();
        
        Thread.sleep(6000);
        driver.findElement(By.id("com.meesho.supply:id/phone_edit_text")).sendKeys("9962577522");
        Thread.sleep(2000);
        driver.findElement(By.id("com.meesho.supply:id/next_button")).click();
        Thread.sleep(25000);
        driver.findElement(By.id("com.meesho.supply:id/otp_continue_button")).click();
        Thread.sleep(9000);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.meesho.supply:id/address_cta")));
       Thread.sleep(1000);
        driver.findElement(By.id("com.meesho.supply:id/address_cta")).click();
        Thread.sleep(12000);
        Actions action = new Actions(driver);
    //    action.sendKeys(Keys.ESCAPE).perform();
    //    Thread.sleep(12000);
  //      driver.findElement(By.xpath("//android.view.View[@text='House no./ Building Name']")).click();
    try {
    	
    	driver.findElement(By.xpath("//android.view.View/android.widget.EditText[@resource-id='name']")).click();
    	driver.findElement(By.xpath("//android.view.View/android.widget.EditText[@resource-id='name']")).sendKeys("Rafi");
    	driver.findElement(By.xpath("//android.widget.EditText[@resource-id='name']")).sendKeys("Rafi");
    	driver.findElement(By.xpath("//android.view.View/android.widget.EditText[@resource-id='mobile']")).sendKeys("9962577522");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.view.View/android.widget.EditText[@resource-id='addressLine1']")).click();
    }catch(Exception e) {
    	driver.findElement(By.xpath("//android.view.View[2]/android.view.View[1]/android.widget.EditText")).sendKeys("Ram");
    	driver.findElement(By.xpath("//android.view.View/android.widget.EditText[@resource-id='mobile']")).sendKeys("9962577522");
    }
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='addressLine1']")).sendKeys("NEW TNHB");
        
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='addressLine2']")).sendKeys("Sholinganallur");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='pincode']")).sendKeys("600119");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='city']")).sendKeys("Chennai");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.EditText[@resource-id='state']")).click();
        Thread.sleep(3000);
      //  WebElement TN=driver.findElement(By.xpath("//android.widget.TextView[contains(@text,  'Tamil Nadu')]"));
  
        scrollForMobile(By.xpath("//android.widget.TextView[contains(@text, 'Tamil Nadu')]"));
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[contains(@text, 'Tamil Nadu')]")).click();
         driver.findElement(By.xpath("//android.widget.TextView[contains(@text,  'Tamil Nadu')]")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//android.widget.Button[@text='Save Address and Continue']")).click();
         System.out.println("Testing");
      
         
         Thread.sleep(3000);
   //      driver.findElement(By.id("com.meesho.supply:id/multi_cta_info_primary_cta")).click();
         
         Thread.sleep(6000);
     //    driver.findElement(By.id("com.meesho.supply:id/multi_cta_info_primary_cta")).click();
		/*
		 * WebElement phone=driver.findElement(By.xpath(
		 * "//android.widget.TextView[@resource-id='com.meesho.supply:id/textinput_placeholder']"
		 * )); Thread.sleep(3000); Actions action=new Actions(driver);
		 * action.sendKeys(phone).perform(); phone.sendKeys("9962577522");
		 * phone.click(); Thread.sleep(9000); phone.sendKeys("9962577522");
		 */
        /*
		 * driver.findElement(By.xpath(
		 * "//android.view.View[@resource-id='sidebar-right']")).click();
		 * Thread.sleep(8000);
		 * driver.findElement(By.xpath("//android.widget.TextView[@text='Categories']"))
		 * .click(); Thread.sleep(4000); driver.findElement(By.
		 * xpath("//android.view.View[@content-desc='Western Wear ']/android.widget.Image"
		 * )).click(); Thread.sleep(3000);
		 * 
		 * driver.findElement(By.
		 * xpath("//android.widget.TextView[@text='THE BEAR HOUSE']")).click(); //
		 * driver.get("https://google.com"); Thread.sleep(9000); String ss=
		 * driver.getPageSource(); System.out.println(ss);
		 * 
		 * WebElement
		 * gg=driver.findElement(By.xpath("//android.widget.Button[@text='L']"));
		 * scrollForMobile(By.xpath("//android.widget.Button[@text='XL']")); gg.click();
		 */
	}
	
	
	
	
	
	
	public static void scrollForMobile(By by) {
		
		String previousPageSource= "";
		while(isElementNotEnabled(by)&& isNotEndOfPage(previousPageSource)) {
			previousPageSource=driver.getPageSource();
			performScroll();
		}
	}
	
	private static boolean isNotEndOfPage(String previousPageSource) {
		
		return!previousPageSource.equalsIgnoreCase(driver.getPageSource());
	}
	
		private static boolean isElementNotEnabled(By by) {
			List<WebElement> elements=driver.findElements(by);
			
			
			if(elements.isEmpty()){
				return elements.isEmpty();
				
			}
			
			  if (!elements.isEmpty()) {
				  System.out.println(elements.size());
				 
			      return elements.get(0).getAttribute("enabled").equalsIgnoreCase("false");
				  
			    }
			    return true;
		}
		
		private static void performScroll() {
			Dimension size=driver.manage().window().getSize();
			int startX = size.getWidth()/2;
			int endX =size.getWidth()/2;
			
			int startY =size.getHeight()/2;
			int endY =(int)(size.getHeight() * 0.25);
			
			performSrollingSequence(startX,startY,endX,endY);
		}
		
		private static void performSrollingSequence(int startX, int startY, int endX, int endY) {
			PointerInput fingure=	new PointerInput(PointerInput.Kind.TOUCH, "first-Finger");
			Sequence sequence=		new Sequence(fingure,0)
			.addAction(fingure.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(),startX,startY))
			.addAction(fingure.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()))
			.addAction(fingure.createPointerMove(Duration.ofMillis(300), PointerInput.Origin.viewport(),endX,endY))
			.addAction(fingure.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
				driver.perform(Collections.singletonList(sequence));	
		}
		

}

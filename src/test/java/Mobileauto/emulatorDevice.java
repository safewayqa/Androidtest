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
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class emulatorDevice {
	public static AndroidDriver driver;
	
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
		
		
		op.setPlatformName("Android");
		 
		   op.setAutomationName("UiAutomator2");
		  op.setUdid("emulator-5554");
		  op.setDeviceName("pixel_6");
		  /*op.setDeviceName("Rafi");
		  op.setUdid("emulator-5554");
		  op.setPlatformName("Android");
		  op.setPlatformVersion("5.0");
		  op.setAutomationName("UiAutomator2");
	      op.setCapability("autoAcceptAlerts", true);
	      op.setCapability("unicodeKeyboard", false); 
	      op.setCapability("resetKeyboard", false);
	      op.setCapability("no-reset"," false");
		  op.setAppPackage("com.meesho.supply");
		  op.setAppActivity("com.meesho.supply.main.MainActivity");*/
		  op.setAvd("Pixel_6");
		//  op.setAvd("avd");
		  op.setAvdLaunchTimeout(Duration.ofMinutes(2));
		 op.setAvdReadyTimeout(Duration.ofMinutes(1));
		  // op.setDeviceName("pixel_6");
	//	  op.setCapability("avdLaunchTimeout", 180000);
		  String appurl= System.getProperty("user.dir") + File.separator + "resurce" +File.separator + "android_apis_v0.4.apk";
		 
				  
		  op.setApp(appurl);
		  
		  
		  op.setPlatformVersion("28");
		  
	      op.setCapability("autoAcceptAlerts", true);
	      op.setCapability("unicodeKeyboard", false); 
	      op.setCapability("resetKeyboard", false);
	      op.setCapability("no-reset"," false");
	//	  op.setAppPackage("com.meesho.supply");
	//	  op.setAppActivity("com.meesho.supply.main.MainActivity");
			  
			System.out.println("Raif");
			driver= new AndroidDriver(new URL("http://127.0.0.1:4723"), op);
			Thread.sleep(5000);
		//	driver.get("https://google.com");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}	

}

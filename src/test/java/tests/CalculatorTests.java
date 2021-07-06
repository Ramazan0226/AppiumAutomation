package tests;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Platform;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorTests {

    @Before
    public void setup(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //which framework to use for automation
        desiredCapabilities.setCapability(MobileCapabilityType.APPLICATION_NAME,"UiAutomator2");
        //platform of device under test
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform.ANDROID);
        //specify android version
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.0");
        //specify device name
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");
        //app or appActivity and appPackage name
        //appActivity - path to the Main class that runs program (com.google.calculator.Main)
        //appPackage - path that leads to the main class (com.google.calculator)
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.calculator2.Calculator");










}






}

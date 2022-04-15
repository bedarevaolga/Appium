import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class EmulatorTest {


    private AndroidDriver driver;

    @Before
    public void SetUp() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testPlusEmul() {
        MobileElement buttonOne = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_9");
        buttonOne.click();

        driver.findElementById("com.android.calculator2:id/op_div").click();
        driver.findElementById("com.android.calculator2:id/digit_3").click();
        driver.findElementById("com.android.calculator2:id/eq").click();
        Assert.assertEquals("3",driver.findElementById("com.android.calculator2:id/result").getText());
    }
    @After
    public void tearDown() {
       driver.quit();
    }
}

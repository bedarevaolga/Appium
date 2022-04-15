//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//public class RealDeviceTest {
//
//
//    private AndroidDriver driver;
//
//    @Before
//    public void SetUp() {
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A50");
//        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
//        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\frosj\\IdeaProjects\\Appium3\\src\\test\\resources\\Calculator_v8.1 (403424005)_apkpure.com.apk");
//
//
//        try {
//            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void testPlus() {
//        MobileElement buttonOne = (MobileElement) driver.findElementById("com.google.android.calculator:id/digit_9");
//        buttonOne.click();
//
//        driver.findElementById("com.google.android.calculator:id/op_div").click();
//        driver.findElementById("com.google.android.calculator:id/digit_3").click();
//        Assert.assertEquals("3",driver.findElementById("com.google.android.calculator:id/result_preview").getText());
//    }
//    @After
//    public void tearDown() {
//        driver.quit();
//    }
//}

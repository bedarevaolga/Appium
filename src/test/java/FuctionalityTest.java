import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class FuctionalityTest {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.121.101:5555");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");

        cap.setCapability("appPackage", "com.android.dialer");
        cap.setCapability("appActivity", "com.android.dialer.DialtactsActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        TouchAction touchAction = new TouchAction(driver);

        touchAction.tap(TapOptions.tapOptions()
                        .withElement(ElementOption.element(driver.findElement(By
                                .id("com.android.dialer:id/floating_action_button")))))
                .perform();

        String[] numpad = {
                "com.android.dialer:id/zero",
                "com.android.dialer:id/one",
                "com.android.dialer:id/two",
                "com.android.dialer:id/three",
                "com.android.dialer:id/four",
                "com.android.dialer:id/five",
                "com.android.dialer:id/six",
                "com.android.dialer:id/seven",
                "com.android.dialer:id/eight",
                "com.android.dialer:id/nine"};

        for (String num : numpad) {
            touchAction.tap(TapOptions.tapOptions()
                            .withElement(ElementOption.element(driver.findElement(By
                                    .id(num)))))
                    .perform();
        }
    }
}

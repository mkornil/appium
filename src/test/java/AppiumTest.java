import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.junit.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest {

@Test


    public void firstTestAppium()throws MalformedURLException {


   AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("/Applications/Appium Server GUI.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"))
            .withArgument(GeneralServerFlag.BASEPATH, "/wd/hub")
            .withIPAddress("127.0.0.1").usingPort(4723).build();
    service.start();


    UiAutomator2Options options = new UiAutomator2Options();
    options.setDeviceName("Pixel3a");
    options.setApp("/Users/marek/IdeaProjects/Appium/src/test/java/resources/ApiDemos-debug.apk");
    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
    driver.quit();
    service.stop();
}


}
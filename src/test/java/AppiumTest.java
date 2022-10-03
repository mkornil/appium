import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest {

@Test
    public void firstTestAppium()throws MalformedURLException {

    UiAutomator2Options options = new UiAutomator2Options();
    options.setDeviceName("Pixel3a");
    options.setApp("/Users/marek/IdeaProjects/Appium/src/test/java/resources/ApiDemos-debug.apk");
    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);

}


}
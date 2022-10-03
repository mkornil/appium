import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class testing {
    WebDriver driver;
    @BeforeClass
    public static void before() {
        System.setProperty("webdriver.chrome.driver", "/Users/Marek/IdeaProjects/AllegroTest/src/test/java/resources/chromedriver");
    }

    @Before
    public void setup() {
        this.driver = new ChromeDriver();
    }
}

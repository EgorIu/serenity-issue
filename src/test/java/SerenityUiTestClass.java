import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.WithTag;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SerenityUiTestClass {

    @Managed
    WebDriver driver;

    @Test
    @WithTag("TEST_TAG")
    public void openGooglePage() {
        driver.get("https://www.google.com");
    }

    @Test
    public void openNotGooglePage() {
        driver.get("https://www.bing.com");
    }
}

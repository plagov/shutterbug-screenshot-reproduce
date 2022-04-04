import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class ScreenshotTest {

    @Test
    void modalTest() {
        Selenide.open("https://mdbootstrap.com/docs/b5/react/components/modal/");
        $(Selectors.byText("Launch demo modal")).click();
        Selenide.sleep(3_000);

        var driver = WebDriverRunner.getWebDriver();

        Shutterbug.shootPage(driver, Capture.FULL).withName("modal-full").save();
        Shutterbug.shootPage(driver, Capture.FULL_SCROLL).withName("modal-full-scroll").save();
    }
}

import com.UserOperations;
import com.codeborne.selenide.Configuration;
import com.model.User;
import com.pages.HomePage;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class MainTests {

    HomePage homePage;
    UserOperations userOperations = new UserOperations();
    User user;

    @Before
    public void init() {
        user = userOperations.register();
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/yandexdriver.exe");
        Configuration.startMaximized = true;
        this.homePage =
                open("https://stellarburgers.nomoreparties.site",
                        HomePage.class);
    }

    @After
    public void tearDown() {
        userOperations.delete();
        closeWebDriver();
    }
}

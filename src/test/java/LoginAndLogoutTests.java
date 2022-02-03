import com.model.User;
import com.pages.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.page;

public class LoginAndLogoutTests extends MainTests {

    LoginPage loginPage = page(LoginPage.class);

    @Test
    @DisplayName("Login home page correct test")
    @Description("Basic success test")
    public void loginInHomePageTest(){

        homePage.clickToEnterButton();
        checkAndLoginUser();
    }

    @Test
    @DisplayName("Login personal office page correct test")
    @Description("Basic success test")
    public void loginInPersonalOfficeTest(){

        homePage.clickToProfileLink();
        checkAndLoginUser();
    }

    @Test
    @DisplayName("Login registration page correct test")
    @Description("Basic success test")
    public void loginInRegistrationPageTest(){

        homePage.clickToProfileLink();
        loginPage.clickToRegistrationLink();
        loginPage.clickToEnterLink();
        checkAndLoginUser();
    }

    @Test
    @DisplayName("Login forgot password page correct test")
    @Description("Basic success test")
    public void loginInForgotPasswordPageTest(){

        homePage.clickToProfileLink();
        loginPage.clickToForgotPasswordLink();
        loginPage.clickToEnterLink();
        checkAndLoginUser();
    }

    private void checkAndLoginUser() {
        User newUser = user;
        loginPage.setLoginAndEnter(newUser);
        Assert.assertTrue("Кнопка Оформить заказ не отображается", homePage.isVisibleOrderButton());
    }
}
import com.pages.LoginPage;
import com.pages.ProfilePage;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;


import static com.codeborne.selenide.Selenide.page;

public class NavigationTests extends MainTests {

    LoginPage loginPage = page(LoginPage.class);
    ProfilePage profilePage = page(ProfilePage.class);

    @Test
    @DisplayName("NavigationSection profile link correct test")
    @Description("Basic success test")
    public void navigationSectionProfileLinkTest(){
        homePage.clickToProfileLink();
        Assert.assertTrue("Ожидаем переход на страницу Входа", loginPage.checkVisibleEnterText());
        loginPage.setLoginAndEnter(user);
        Assert.assertTrue("Кнопка Оформить заказ не отображается", homePage.isVisibleOrderButton());
        homePage.clickToProfileLink();
        Assert.assertTrue("Ожидаем переход на страницу профиля", profilePage.isDisplayedExitButton());
    }

    @Test
    @DisplayName("NavigationSection constuctor link correct test")
    @Description("Basic success test")
    public void navigationSectionConstructorTest(){
        homePage.clickToProfileLink();
        Assert.assertTrue("Ожидаем переход на страницу Входа", loginPage.checkVisibleEnterText());
        homePage.clickToConstructorLink();
        Assert.assertFalse("Кнопка Оформить заказ отображается", homePage.isVisibleOrderButton());

        homePage.clickToProfileLink();
        loginPage.setLoginAndEnter(user);
        homePage.clickToConstructorLink();
        Assert.assertTrue("Кнопка Оформить заказ не отображается", homePage.isVisibleOrderButton());
    }

    @Test
    @DisplayName("NavigationSection logo link correct test")
    @Description("Basic success test")
    public void navigationSectionLogoTest(){
        homePage.clickToProfileLink();
        Assert.assertTrue("Ожидаем переход на страницу Входа", loginPage.checkVisibleEnterText());
        homePage.clickToLogoHome();
        Assert.assertFalse("Кнопка Оформить заказ отображается", homePage.isVisibleOrderButton());

        homePage.clickToProfileLink();
        loginPage.setLoginAndEnter(user);
        homePage.clickToLogoHome();
        Assert.assertTrue("Кнопка Оформить заказ не отображается", homePage.isVisibleOrderButton());
    }

    @Test
    @DisplayName("NavigationSection section Bun And Filling And Sauces link correct test")
    @Description("Basic success test")
    public void navigationSectionBunAndFillingAndSaucesTest(){

        Assert.assertTrue("Секция начинки раздел не выбран", homePage.clickToFillingsSection());
        Assert.assertTrue("Секция булки раздел не выбран", homePage.clickToBunSection());
        Assert.assertTrue("Секция соусы раздел не выбран", homePage.clickToSaucesSection());

        homePage.clickToProfileLink();
        loginPage.setLoginAndEnter(user);
        homePage.clickToLogoHome();

        Assert.assertTrue("Секция начинки раздел не выбран", homePage.clickToFillingsSection());
        Assert.assertTrue("Секция булки раздел не выбран", homePage.clickToBunSection());
        Assert.assertTrue("Секция соусы раздел не выбран", homePage.clickToSaucesSection());

    }
}
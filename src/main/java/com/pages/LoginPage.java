package com.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.model.User;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends HomePage {

    @FindBy(how = How.XPATH, using = "//label[text()='Имя']/../input")
    protected SelenideElement name;

    @FindBy(how = How.XPATH, using = "//label[text()='Email']/../input")
    protected SelenideElement email;

    @FindBy(how = How.CSS, using = "[name='Пароль']")
    protected SelenideElement password;

    @FindBy(how = How.XPATH, using = "//button[text()='Войти']")
    private SelenideElement enterButton;

    @FindBy(how = How.XPATH, using = "//a[text()='Войти']")
    private SelenideElement enterLink;

    @FindBy(how = How.XPATH, using = "//a[text()='Зарегистрироваться']")
    private SelenideElement registrationLink;

    @FindBy(how = How.XPATH, using = "//h2[text()='Вход']")
    protected SelenideElement enterText;

    @FindBy(how = How.XPATH, using = "//a[text()='Восстановить пароль']")
    private SelenideElement forgotPasswordLink;

    public void clickToRegistrationLink() {
        this.registrationLink.click();
    }

    @Step
    public void setLoginAndEnter(User user) {
        this.email.setValue(user.getEmail());
        this.password.setValue(user.getPassword());
        this.enterButton.shouldBe(Condition.exist, Condition.enabled).doubleClick();
        generalText.shouldBe(Condition.exist);
    }

    @Step
    public boolean checkVisibleEnterText() {
        enterText.shouldBe(Condition.exist);
        return this.enterText.exists();
    }

    @Step
    public void clickToEnterLink() {
        this.enterLink.click();
    }

    @Step
    public void clickToForgotPasswordLink() {
        this.forgotPasswordLink.click();
    }
}
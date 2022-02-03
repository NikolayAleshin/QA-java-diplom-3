package com.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.model.User;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage extends LoginPage {

    @FindBy(how = How.XPATH, using = "//button[text()='Зарегистрироваться']")
    private SelenideElement registrationButton;

    @FindBy(how = How.XPATH, using = "//p[text()='Некорректный пароль']")
    private SelenideElement errorPasswordText;


    @Step
    public void setRegistrationUser(User user) {
        this.name.setValue(user.getName());
        this.email.setValue(user.getEmail());
        this.password.setValue(user.getPassword());
        this.registrationButton.click();
    }

    @Step
    public boolean isVisibleErrorPasswordText() {
        return this.errorPasswordText.isDisplayed();
    }
}

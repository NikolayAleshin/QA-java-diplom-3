package com.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.model.User;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfilePage extends LoginPage {

    @FindBy(how = How.XPATH, using = "//label[text()='Логин']/../input")
    private SelenideElement email;

    @FindBy(how = How.CSS, using = "[type='password']")
    private SelenideElement password;

    @FindBy(how = How.XPATH, using = "//button[text()='Выход']")
    private SelenideElement exitButton;

    @Step
    public User getUserAuthorization() {
        return new User(this.email.getValue(),
                this.password.getValue(),
                this.name.getValue());
    }

    @Step
    public boolean isDisplayedExitButton() {
        return this.exitButton.shouldBe(Condition.exist).exists();
    }

    @Step
    public void clickToExitButton() {
        this.exitButton.click();
    }
}
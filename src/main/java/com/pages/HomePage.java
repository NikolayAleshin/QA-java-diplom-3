package com.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how = How.XPATH, using = "//p[text()='Личный Кабинет']")
    private SelenideElement profileLink;

    @FindBy(how = How.XPATH, using = "//h1[text()='Соберите бургер']")
    protected SelenideElement generalText;

    @FindBy(how = How.XPATH, using = "//button[text()='Войти в аккаунт']")
    protected SelenideElement enterButton;

    @FindBy(how = How.XPATH, using = "//button[text()='Оформить заказ']")
    protected SelenideElement orderButton;

    @Step
    public void clickToProfileLink(){
        this.profileLink.click();
    }

    @Step
    public void clickToEnterButton(){
        this.enterButton.click();
    }

    @Step
    public boolean isVisibleOrderButton() {
        return this.orderButton.isDisplayed();
    }
}

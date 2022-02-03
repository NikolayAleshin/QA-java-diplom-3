package com.pages;

import com.codeborne.selenide.Condition;
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

    @FindBy(how = How.XPATH, using = "//p[text()='Конструктор']")
    protected SelenideElement constructorLink;

    @FindBy(how = How.XPATH, using = "//div[@class='AppHeader_header__logo__2D0X2']")
    protected SelenideElement logoHome;

    @FindBy(how = How.XPATH, using = "//span[text()='Булки']")
    private SelenideElement bunSection;

    @FindBy(how = How.XPATH, using = "//h2[text()='Булки']")
    private SelenideElement bunSectionText;

    @FindBy(how = How.XPATH, using = "//span[text()='Соусы']")
    private SelenideElement saucesSection;

    @FindBy(how = How.XPATH, using = "//h2[text()='Соусы']")
    private SelenideElement saucesSectionText;

    @FindBy(how = How.XPATH, using = "//span[text()='Начинки']")
    private SelenideElement fillingsSection;

    @FindBy(how = How.XPATH, using = "//h2[text()='Начинки']")
    private SelenideElement fillingsSectionText;

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

    @Step
    public void clickToConstructorLink() {
        this.constructorLink.click();
    }

    @Step
    public void clickToLogoHome() {
        this.logoHome.click();
    }

    @Step
    public boolean clickToBunSection() {
        this.bunSection.click();
        return this.bunSectionText.shouldBe(Condition.visible).is(Condition.visible);
    }

    @Step
    public boolean clickToSaucesSection() {
        this.saucesSection.click();
        return this.saucesSectionText.shouldBe(Condition.visible).is(Condition.visible);
    }

    @Step
    public boolean clickToFillingsSection() {
        this.fillingsSection.click();
        return this.fillingsSectionText.shouldBe(Condition.visible).is(Condition.visible);
    }
}
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

    @FindBy(how = How.XPATH, using = "//p[text()='Конструктор']")
    protected SelenideElement constructorLink;

    @FindBy(how = How.XPATH, using = "//div[@class='AppHeader_header__logo__2D0X2']")
    protected SelenideElement logoHome;

    @FindBy(how = How.XPATH, using = "//span[text()='Булки']")
    private SelenideElement bunSection;

    @FindBy(how = How.XPATH, using = "//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Булки']")
    private SelenideElement bunSectionCurrentText;

    @FindBy(how = How.XPATH, using = "//span[text()='Соусы']")
    private SelenideElement saucesSection;

    @FindBy(how = How.XPATH, using = "//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Соусы']")
    private SelenideElement saucesSectionCurrentText;

    @FindBy(how = How.XPATH, using = "//span[text()='Начинки']")
    private SelenideElement fillingsSection;

    @FindBy(how = How.XPATH, using = "//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span[text()='Начинки']")
    private SelenideElement fillingsSectionCurrentText;

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
        return this.bunSectionCurrentText.exists();
    }

    @Step
    public boolean clickToSaucesSection() {
        this.saucesSection.click();
        return this.saucesSectionCurrentText.exists();
    }

    @Step
    public boolean clickToFillingsSection() {
        this.fillingsSection.click();
        return this.fillingsSectionCurrentText.exists();
    }
}
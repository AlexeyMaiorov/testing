package ru.qa.stepdefs;

import io.cucumber.java.ru.*;

import static ru.qa.stepdefs.MainPage.page;

public class AutomatedBankingSystemsPage {
    @И("я вижу название страницы 'Автоматизированные банковские системы АБС'")
    public void assertPageABS() {
        page.locator("xpath=//h1[@class='product-top__title' and contains(text(),'банковские системы АБС')]");
    }
    @Когда("я кликаю по плашке 'RS-Bank V.6'")
    public void clickRSbankV6() {
        page.click("xpath=//a[@href='/products/rs-bank-v-6/' and @class='card']");
    }
}

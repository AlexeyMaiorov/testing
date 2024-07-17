package ru.qa.softLabPages;

import io.cucumber.java.ru.*;

import static org.junit.Assert.assertEquals;
import static ru.qa.softLabPages.MainPage.page;

public class SubstitutionsPage {
    @И("я проверяю, что шапка страницы присутствует")
    public void assertSubstPageHat() {
        page.locator("xpath=//div[@class='header__wrapper']").isVisible();
    }
    @И("я проверяю, что меню категории 'Все производители' присутствует")
    public void assertVendors() {
        page.locator("xpath=//a[@class='current' and @href='/import-substitution/vendors/']").isVisible();
    }
    @И("я проверяю, что меню категории 'Программное обеспечение' присутствует")
    public void assertSoftware() {
        page.locator("xpath=//a[@href='/import-substitution/software/']").isVisible();
    }
    @И("я проверяю, что меню категории 'Оборудование' присутствует")
    public void assertTechnicalEquipment() {
        page.locator("xpath=//a[@href='/import-substitution/technical-equipment/']").isVisible();
    }
    @И("я проверяю, что блок «Все производители» с плашками ПО присутствует")
    public void assertVendorsBlock() {
        page.locator("xpath=//article[@class='js-pager-container']").isVisible();
    }
    @И("я проверяю, что блок 'Почему стоит доверить проект по импортозамещению R-Style Softlab' присутствует")
    public void assertAdvantages() {
        page.locator("xpath=//section[@class='advantages']").isVisible();
    }
    @И("я проверяю, что блок 'Наши клиенты' присутствует")
    public void assertOurClients() {
        page.locator("xpath=//section[@class='our-clients']").isVisible();
    }
    @И("я проверяю, что 'подвал' со ссылками присутствует")
    public void assertFooter() {
        page.locator("xpath=//div[@class='footer__wrapper']").isVisible();
    }
    @Когда("я кликаю на меню 'RS-Bank' в разделе 'Продукты'")
    public void clickSubstitutions() {
        page.click("xpath=//a[@href=('/products/rs-bank/') and @class=('footer-submenu__item-link')]");
    }

}

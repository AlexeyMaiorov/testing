package ru.qa.softLabPages;

import com.microsoft.playwright.*;
import io.cucumber.java.ru.*;

import static org.junit.Assert.assertEquals;

public class MainPage {
    private static Playwright playwright;
    private static Browser browser;
    static Page page;

    @Дано("я открываю сайт {string}")
    public void openSite(String url) {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        page.navigate(url);
    }
    @И("я проверяю, что логотип компании присутствует")
    public void assertLogo() {
        page.locator("xpath=//span[@class='header__logotype']").isVisible();
    }

    @И("я проверяю, что меню присутствует")
    public void assertMenu() {
        page.locator("xpath=//div[@class='menu__list']").isVisible();
    }

    @И("я проверяю, что пункт 'Продукты' присутствует")
    public void assertProducts() {
        page.locator("xpath=//a[@class='menu__item menu__item_link' and @href='/products/']").isVisible();
    }

    @И("я проверяю, что пункт 'Услуги' присутствует")
    public void assertServices() {
        page.locator("xpath=//a[@class='menu__item menu__item_link' and @href='/services/']").isVisible();
    }

    @И("я проверяю, что пункт 'Решения' присутствует")
    public void assertSolutions() {
        page.locator("xpath=//span[@class='menu__item' and contains(text(), 'Решения')]").isVisible();
    }

    @И("я проверяю, что пункт 'Поддержка' присутствует")
    public void assertSupport() {
        page.locator("xpath=//a[@class='menu__item menu__item_link menu__item_single' and @target=\"_blank\"]").isVisible();
    }

    @И("я проверяю, что пункт 'Медиа' присутствует")
    public void assertMedia() {
        page.locator("xpath=//span[@class='menu__item' and contains(text(), 'Медиа')]").isVisible();
    }

    @И("я проверяю, что пункт 'Компания' присутствует")
    public void assertCompany() {
        page.locator("xpath=//span[@class='menu__item' and contains(text(), 'Компания')]").isVisible();
    }

    @И("я проверяю, что поиск присутствует")
    public void assertSearch() {
        page.locator("xpath=//div[@class='js-menu-search menu__search menu__search_tablet']").isVisible();
    }
    @Когда("я навожу курсор на пункт 'Решения'")
    public void pointingOnSolutions() {
        page.hover("xpath=//span[@class='menu__item' and contains(text(), 'Решения')]");
    }
    @Тогда("я вижу выпадающее меню")
    public void assertSubMenuSolutions() {
        page.locator("xpath=//ul[@class=('js-submenu-list menu__item-submenu menu__item-submenu_solutions submenu submenu_solutions')]").isVisible();
    }
    @И("я проверяю, что подпункт 'Банкам и МФО' присутствует")
    public void assertBanksAndSolutions() {
        page.locator("xpath=//a[@href=('/banks-solutions/') and @class=('submenu__item-link')]").isVisible();
    }
    @И("я проверяю, что подпункт 'Страховым компаниям' присутствует")
    public void assertInsurance() {
        page.locator("xpath=//a[@href=('/insurance/') and @class=('submenu__item-link')]").isVisible();
    }
    @И("я проверяю, что подпункт 'Цифровизация учебных заведений' присутствует")
    public void assertSolutionsEDU() {
        page.locator("xpath=//a[@href=('/solutions-for-edu/') and @class=('submenu__item-link')]").isVisible();
    }
    @И("я проверяю, что подпункт 'Импортозамещение' присутствует")
    public void assertImportSubstitution() {
        page.locator("xpath=//a[@href=('/import-substitution/') and @class=('submenu__item-link')]").isVisible();
    }
    @И("я проверяю, что подпункт 'Решения для АПК-предприятий' присутствует")
    public void assertAPK() {
        page.locator("xpath=//a[@href=('/apk/') and @class=('submenu__item-link')]").isVisible();
    }
    @И("я проверяю, что подпункт 'HR-автоматизация' присутствует")
    public void assertHRtech() {
        page.locator("xpath=//a[@href=('/hrtech/') and @class=('submenu__item-link')]").isVisible();
    }
    @Когда("я кликаю на меню 'Импортозамещение'")
    public void clickSubstitutions() {
        page.click("xpath=//a[@href=('/import-substitution/') and @class=('submenu__item-link')]");
    }

    @Тогда("я нахожусь на странице {string}")
    public void assertPage(String url) {
        assertEquals(page.url(), url);
    }
    @И("я закрываю текущую вкладку")
    public void closeCurrentPage() {
        page.close();
    }
    @И("я проверяю, что 'шапка' страницы присутствует")
    public void assertMainPageHat() {
        page.locator("xpath=//div[@class='site-header__wrapper index-page ']").isVisible();
    }
    @И("я проверяю, что кнопка 'Заказать консультацию' присутствует")
    public void assertCallBackButton() {
        page.locator("xpath=//a[@href='#callback-block']").isVisible();
    }
    @И("я жду 3 секунд")
    public void waitForThreeSeconds() {
        page.waitForTimeout(3000);
    }
}
package ru.qa.stepdefs;

import com.microsoft.playwright.*;
import io.cucumber.java.ru.*;

import static ru.qa.stepdefs.MainPage.page;

public class RSBankV6Page {
    @И("я вижу название страницы 'Автоматизированная банковская система для многофилиальных банков RS‑Bank V.6'")
    public void assertABSv6Page() {
        page.locator("xpath=//h1[contains(text(),'система для многофилиальных банков RS‑Bank V.6')]");
    }

    @Когда("я кликаю по техническим требованиям")
    public void clickTechRequirementsBox() {
        page.click("xpath=//a[@href='/upload/iblock/50a/r0mzrqu3s53j04u8d31le4knzdc8nczw/PlatformRequirements_V6.pdf']");
    }
    @Когда("я кликаю в шапке на логотип компании")
    public void clickLogo() {
        page.click("xpath=//a[@class='header__logotype']");
    }

}

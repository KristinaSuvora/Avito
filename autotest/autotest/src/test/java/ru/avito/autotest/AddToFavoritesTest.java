package ru.avito.autotest;

import com.codeborne.selenide.Condition;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static ru.avito.autotest.Utils.*;

public class AddToFavoritesTest {
    @BeforeClass
    public static void init() {
        baseUrl = AVITO;
    }
    @Test
    public void userCanAddToFavoritesAds() {
        open(ADS_ID.toString());
        $(By.xpath(ADD_TO_FAVORITES)).click();
        $(By.cssSelector(LINK_TO_FAVORITES)).shouldHave(Condition.text(EXPECTED_TEXT_TO_FAVORITES));
        $(By.cssSelector(LINK_TO_FAVORITES)).click();
        $(By.cssSelector(EXPECTED_LINK)).should(Condition.visible);
    }
}

package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Nedra")
    void generatedTest() {
        step("Open https://nedra.digital", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить есть ли в заголовке слово nedra", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить наличие пунктов главного меню \"Стажировка\", \"Блог\", \"О компании\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Нажать \"Стажировка\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить наличие слов \"NEDRA STREAM\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Перейти по ссылке \"hh.ru\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Убедиться, что открылась страница с вакансиями \"Nedra - New Digital Resources for Assets\"", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://nedra.digital'", () ->
            open("https://nedra.digital"));

        step("Page title should have text 'Nedra - New Digital Resources for Assets'", () -> {
            String expectedTitle = "Nedra - New Digital Resources for Assets";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://nedra.digital'", () ->
            open("https://nedra.digital"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;

public class Positive {
    private String login="fominaelena";
    private String pass="1P73BP4Z";
    private String email="efomina@company.ru";

    @Test
    void login(){
        open("https://lmslite47vr.demo.mirapolis.ru/mira");
        $(byName("user")).setValue(login);
        $(byName("password")).setValue(pass);
        $("#button_submit_login_form").click();
        $(".avatar-full-name").shouldBe(enabled);
        $(".avatar-full-name").click();
        $("#DropDownContainer28-DD").shouldBe(visible);
        $(byXpath("//*[@id=\"DropDownContainer28-DD\"]/div/div/div[3]/a/span[2]")).click();
    }
//Проверка кнопки видимости пароля
    @Test
    void passVisible(){
        open("https://lmslite47vr.demo.mirapolis.ru/mira");
        $(byName("user")).setValue(login);
        $(byName("password")).setValue(pass);
        $("#show_password").click();
        $(byName("password")).shouldBe(type("text"));
    }
//Проверка запроса на восстановление пароля через ввод никнейма
    @Test
    void forgotPass(){
        open("https://lmslite47vr.demo.mirapolis.ru/mira");
        $(".links-container").find("a").click();
        $(byName("loginOrEmail")).append(login);
        $(".mira-page-forgot-password-button").click();
        $(".success").shouldBe(visible);
        $(".mira-page-forgot-password-link").click();
    }
    //Проверка запроса на восстановление пароля через ввод email
    @Test
    void forgotPassEmail(){
        open("https://lmslite47vr.demo.mirapolis.ru/mira");
        $(".links-container").find("a").click();
        $(byName("loginOrEmail")).append(email);
        $(".mira-page-forgot-password-button").click();
        $(".success").shouldBe(visible);
        $(".mira-page-forgot-password-link").click();
    }
}

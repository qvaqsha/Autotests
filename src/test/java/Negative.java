import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.Selenide.*;


public class Negative {
    protected String login="fominaelena";
    protected String emptyPass="";
    protected String downCasePass="1p73bp4z";


    @Test
    void empty(){
        open("https://lmslite47vr.demo.mirapolis.ru/mira");
        $("#button_submit_login_form").click();
        getWebDriver().switchTo().alert().accept();
    }
    //Проверка валидного логина с пустым паролем
    @Test
    void passClr(){
        open("https://lmslite47vr.demo.mirapolis.ru/mira");
        $(byName("user")).setValue(login);
        $(byName("password")).setValue(emptyPass).pressEnter();
        getWebDriver().switchTo().alert().accept();
    }
    //Проверка пароля в нижнем регистре
    @Test
    void passDown(){
        open("https://lmslite47vr.demo.mirapolis.ru/mira");
        $(byName("user")).setValue(login);
        $(byName("password")).setValue(downCasePass).pressEnter();
        getWebDriver().switchTo().alert().accept();
    }
}

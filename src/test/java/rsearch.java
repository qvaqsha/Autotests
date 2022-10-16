import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.WebDriverConditions.*;
import org.junit.jupiter.api.Order;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class rsearch {

    @BeforeEach
    public void setUp(){
        Configuration.browser = "chrome";
    }

    @AfterAll
    public static void end(){
        Selenide.closeWebDriver();
    }
    @Test
    @Order(1)
    void search(){
        open("https://r0.ru");
        $(byName("query")).val("rambler").pressEnter();
        Selenide.back();
        sleep(500);
    }
    @Test
    void mail(){
        $(byAttribute("data-cerber","topline::search_r0::menu::mail")).click();
        switchTo().window(1);
        webdriver().shouldHave(urlStartingWith("https://mail.rambler.ru/"));
        Selenide.closeWindow();
        switchTo().window(0);
    }
    @Test
    void news(){
        $(byAttribute("data-cerber","topline::search_r0::menu::news")).click();
        switchTo().window(1);
        webdriver().shouldHave(urlStartingWith("https://news.rambler.ru/"));
        Selenide.closeWindow();
        switchTo().window(0);
    }
    @Test
    void kino(){
        $(byAttribute("data-cerber","topline::search_r0::menu::kino")).click();
        switchTo().window(1);
        webdriver().shouldHave(urlStartingWith("https://kino.rambler.ru/"));
        Selenide.closeWindow();
        switchTo().window(0);
    }
    @Test
    void sport(){
        $(byAttribute("data-cerber","topline::search_r0::menu::sport")).click();
        switchTo().window(1);
        webdriver().shouldHave(urlStartingWith("https://sport.rambler.ru/"));
        Selenide.closeWindow();
        switchTo().window(0);
    }
    @Test
    void auto(){
        $(byAttribute("data-cerber","topline::search_r0::menu::auto")).click();
        switchTo().window(1);
        webdriver().shouldHave(urlStartingWith("https://auto.rambler.ru/"));
        Selenide.closeWindow();
        switchTo().window(0);
    }
    @Test
    void showbis(){
        $(byAttribute("data-cerber","topline::search_r0::menu::starlife")).click();
        switchTo().window(1);
        webdriver().shouldHave(urlStartingWith("https://news.rambler.ru/"));
        Selenide.closeWindow();
        switchTo().window(0);
    }
    @Test
    void horoscopes(){
        $(byAttribute("data-cerber","topline::search_r0::menu::horoscopes")).click();
        switchTo().window(1);
        webdriver().shouldHave(urlStartingWith("https://horoscopes.rambler.ru/"));
        Selenide.closeWindow();
        switchTo().window(0);
    }
    @Test
    void finance(){
        $(byAttribute("data-cerber","topline::search_r0::menu::finance")).click();
        switchTo().window(1);
        webdriver().shouldHave(urlStartingWith("https://finance.rambler.ru/"));
        Selenide.closeWindow();
        switchTo().window(0);
    }
    @Test
    void more(){
        $(byAttribute("data-cerber","topline::search_r0::menu::more_button::open")).click();
        $(byAttribute("data-cerber","topline::search_r0::menu::more_button::close")).click();
    }
}
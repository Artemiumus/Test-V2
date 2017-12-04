import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by Art on 03.12.2017.
 */
public class Test2 {
    @Test
    public void mainTest()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.manage().window().maximize();
        driver.get("https://yandex.ru/");
        WebElement Finder = driver.findElement(By.id("text"));
        Finder.sendKeys("voentec.com", Keys.ENTER);

//        List <WebElement> aList = driver.findElements(By.cssSelector("a.link.link_outer_yes.link_theme_outer path__item.i-bem link_js_inited"));
//        WebElement aElement = driver.findElement(By.xpath("a[.,'voentec.com']")); //.link.link_outer_yes.link_theme_outer path__item.i-bem link_js_inite
//        WebElement FindResults = driver.findElement(By.cssSelector("ul.serp-list.serp-list_left_yes"));
//        List <WebElement> ListResults = FindResults.findElements(By.xpath("//*[contains(.,'voentec.com')]"));
        WebElement aElement;
        aElement = driver.findElement(By.xpath("//*[@aria-label='Результаты поиска'] /*[contains(.,'voentec.com')]"));
        System.out.println(aElement.getTagName());
//        WebElement aElement2 = aElement.findElement(By.xpath("/../"));
        System.out.println(aElement.getAttribute("data-cid"));



    }






}


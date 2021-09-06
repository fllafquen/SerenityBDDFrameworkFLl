package testcases;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.lwawt.macosx.CThreading;

@RunWith(SerenityRunner.class)
public class LoginTest extends PageObject {

    @Managed(driver = "chrome")
    WebDriver driver;

    @FindBy(name="q")
    WebElement googlesearch;


    @Title("Default Web URL loading from webdriver.base.url set in serenity.properties file.")
    @Test
    public void doLogin(){

        open();
        //driver.get("http://google.com");
        //driver.findElement(By.name("q")).sendKeys("Hello Sereniti!!!");
        //$(By.name("q")).sendKeys("Hello Sereniti!!!");
        //typeInto(googlesearch, "Hello Sereniti!!!");
        WebElementFacade textbox = find(By.name("q"));
        textbox.shouldBePresent();
        textbox.typeAndEnter("Hello Sereniti!!!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

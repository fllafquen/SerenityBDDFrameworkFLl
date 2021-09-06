package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://gmail.com");
        driver.findElement(By.id("yDmH0d")).sendKeys("francisco.llafquen“gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("sdfsdf");
    }
}
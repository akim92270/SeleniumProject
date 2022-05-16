package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abrah\\IdeaProjects\\SeleniumProject\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        driver.quit();
    }
}

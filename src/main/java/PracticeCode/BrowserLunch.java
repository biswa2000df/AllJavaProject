package PracticeCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLunch {

    public static void main(String[] args) throws InterruptedException {

    /*    WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.quit();*/

        String s = "kanha";
       String y =  s.concat("sahoo");
        System.out.println(s);

        y.concat("mama");
        System.out.println(y);



    }
}

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Element;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class ApiDemo {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "Andro");
        desiredCapabilities.setCapability("platformVersion","9");
        desiredCapabilities.setCapability("app", new File("/Users/nataliarybalko/IdeaProjects/apiDemoAutomation/src/APP/ApiDemos-debug.apk"));

        new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
        AppiumDriver driver = null;

        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        System.out.println(driver.getPageSource());

        driver.findElement(MobileBy.AccessibilityId("Accessibility")).click();
        driver.findElement(MobileBy.AccessibilityId("Accessibility Node Querying")).click();

        List<MobileElement> list =  driver.findElements(By.className("android.widget.CheckBox"));

        new WebDriverWait(driver,10);

        Boolean ifTrue = list.get(0).isSelected();
        System.out.println(ifTrue);
        list.get(0).click();

        driver.navigate().back();

        driver.findElement(MobileBy.AccessibilityId("Accessibility Node Querying")).click();

        if (ifTrue != list.get(0).isSelected()){
            System.out.println(" state of check-box is the same");
        }else{
            System.out.println("BAG! state of check-box is not the same");
        }

        // HOME WORK explicit wait

        driver.navigate().back();
        driver.navigate().back();


        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();

        new WebDriverWait(driver,30);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Auto Complete\"]")).click();

        new WebDriverWait(driver,30);
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"4. Contacts\"]")).click();

        new WebDriverWait(driver,30);
        driver.findElement(By.id("io.appium.android.apis:id/edit")).click();

       // new WebDriverWait(driver,10);
        ((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.KEYCODE_A);

        Wait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@content-desc=\"You must have contacts in your address book. Typing * will show all of your contacts.\"]")));
        if(driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"You must have contacts in your address book. Typing * will show all of your contacts.\"]")).isDisplayed()) {
            System.out.println("system works correct");
        }else{
            System.out.println("BUG");
        }


    }
}

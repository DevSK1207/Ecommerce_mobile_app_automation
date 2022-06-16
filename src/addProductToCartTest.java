import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidMobileCommandHelper;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;\
import java.net.URL;


public class addProductToCartTest {
    public static void main(String args[]) throws MalformedURLException, InterruptedException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2 API 29");
        dc.setCapability("platformName", "Android");
        dc.setCapability("app", "/Users/khairunnaharnowrin/Downloads/App/nopstationCart_4.40.apk");

        AndroidDriver ad = new AndroidDriver(new
                URL("http://127.0.0.1:4723/wd/hub"),dc);

        WebElement p1 = (WebElement) ad.findElement(By.id("com.nopstation.nopcommerce.nopstationcart.main.MainActivity:id/prod1"));
        p1.click();
        WebElement p2 = (WebElement) ad.findElement(By.id("com.nopstation.nopcommerce.nopstationcart.main.MainActivity:id/prod2"));
        p2.click();
        WebElement p3 = (WebElement) ad.findElement(By.id("com.nopstation.nopcommerce.nopstationcart.main.MainActivity:id/prod3"));
        p3.click();

    }
}

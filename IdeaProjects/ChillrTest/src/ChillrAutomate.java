import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.reporters.XMLConstants;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by joshanekelsy on 02/06/16.
 */
public class ChillrAutomate {

    AppiumDriver driver;

    /* We set the capabilities here  required by the appium driver
    * We have manually specified most of these through the Appium Interface
    * (path,device,sdk , apk) */

    @Test

    public void SetUp() throws MalformedURLException{

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "AndroidTestDevice");

        AppiumDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);


        /* Walkthrough Buttons*/

        WebElement nextButton1= driver.findElement(By.id("in.chillr:id/button_next"));
        nextButton1.click();
        WebElement nextButton2= driver.findElement(By.id("in.chillr:id/button_next"));
        nextButton2.click();
        WebElement nextButton3= driver.findElement(By.id("in.chillr:id/button_next"));
        nextButton3.click();

        /* Code to test registration flow  */


        WebElement PhoneNumberEntry= driver.findElement(By.id("in.chillr:id/phone_number"));
        PhoneNumberEntry.sendKeys("9742817318");
        WebElement getStartedButton= driver.findElement(By.id("in.chillr:id/button_get_started"));
        getStartedButton.click();


        /* Handling error if encurred */

       //WebElement InternetErrorBox = driver.findElementByName("Your network connection seems to be slow/not working. Try turning off your WiFi to see if things get better");

        //driver.findElement(By.id("android:id/button1")).click();

        /* Testing Registration Flow */

        WebElement UserName = driver.findElement(By.id("in.chillr:id/user_name"));
        UserName.sendKeys("Joshane Kelsy");
        WebElement eMail = driver.findElement(By.id("in.chillr:id/user_email"));
        eMail.sendKeys("joshane.kelsy@chillr.in");

        eMail.click();



        WebElement RefCode = driver.findElement(By.id("in.chillr:id/referral_code"));
        RefCode.sendKeys("Josha99");

        driver.findElement(By.id("in.chillr:id/button_continue")).click();



        /*  Test case for OTP page   */


        WebElement otpArea = driver.findElement(By.id("in.chillr:id/otp"));

        Dimension a =  otpArea.getSize();



            if (a == null) {

                System.out.print("OTP Delayed : Server needs a check");

            }


        else {


                WebElement continueButton = driver.findElement(By.id("in.chillr:id/button_continue"));
                continueButton.click();

            }

        /* making driver wait for 2 secs */

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {

            WebElement hdfcBank = driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.GridView[1]/android.widget.RelativeLayout[6]"));

            hdfcBank.click();

            e.printStackTrace();
        }

        /*  Bank Logo selection  */





        //List<WebElement> b=driver.findElementsByXPath("")

        //System.out.println(b.size());

        //System.out.println(b.get(8).getText());
















    }



}

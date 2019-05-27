package Steps;

import Setups.Capabilities;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;

public class MyStepHomePage extends Capabilities {
    @Before({"@GoJek"})
    public void setup() throws Exception {
        preparation();
    }

    @Given("^User launch Gojek$")
    public void userLaunchGojek() throws Throwable {
        //driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
        driver.findElement(By.id("com.gojek.app:id/button_login")).click();
        driver.findElement(By.id("com.gojek.app:id/btn_login")).click();
        driver.findElement(By.id("com.gojek.app:id/auth_back_button")).click();
        driver.findElement(By.id("com.gojek.app:id/btn_signup")).click();
        driver.findElement(By.id("com.gojek.app:id/input_name")).sendKeys("Rangga Deputra");
        driver.findElement(By.id("com.gojek.app:id/input_email")).sendKeys("Rangga.Depoetra@Gmail.com");
        driver.findElement(By.id("com.gojek.app:id/input_phone")).sendKeys("82134503856");
        //driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
    }

    @After({"@GoJek"})
    public void stop(){
        stopServer();
    }
}

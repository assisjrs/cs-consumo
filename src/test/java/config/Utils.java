package config;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

/**
 * Created by Diego Malafaia on 23/03/2017.
 */


public class Utils {

    public static void captureScreenshot (WebDriver driver, String screenshotName){
        try
        {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./target/screenshots/" + screenshotName + ".png"));
            System.out.println("Screenshot criado");
        }
        catch(Exception e)
        {
            System.out.println("Exceção durante a captura do screenshot"+e.getMessage());

        }
    }
}

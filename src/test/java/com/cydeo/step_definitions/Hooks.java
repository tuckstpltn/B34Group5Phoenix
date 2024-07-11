package com.cydeo.step_definitions;

/*
In this class we will be able to create "pre" and "post" condition
for ALL the SCENARIOS and even STEPS.
 */


import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Hooks {


    @Before
    public void setUp(){

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @After
    public void teardow(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
/*
            To create local screenshot
            try (FileOutputStream fos = new FileOutputStream(new File("screenshots/" + scenario.getName() + ".png"))) {
                fos.write(screenshot);
            } catch (IOException e) {
                e.printStackTrace();
            }

 */
        }
        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }



}

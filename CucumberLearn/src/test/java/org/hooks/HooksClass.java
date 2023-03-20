package org.hooks;

import org.core.CommonMethods;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.*;

public class HooksClass extends CommonMethods {

	@Before
	public void before() {
		browserLaunch("chrome");
		timeWait(2);
		System.out.println("browser launched");
		driver.manage().window().maximize();
	}

	@After
	public void after(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotAs, "image/png", "screenshot");
		}
		browserClose();
		System.out.println("browser Closed");
	}

}

package com.yunxun.moxian.common;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AndroidConnect {
	private AndroidDriver<WebElement> driver;

	public AndroidDriver<WebElement> getDriver() {
		
		return driver;
	}

	public void setDriver(AndroidDriver<WebElement> driver) {
		this.driver = driver;
	}

	public AndroidConnect() {
		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, "/app/");
		File app = new File(appDir, "moxian.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "224dc6ef");
		capabilities.setCapability("platformVersion", "4.4.4");
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.yunxun.moxian");
		capabilities.setCapability("appActivity", "com.mopal.startpage.StartPageActivity");
		try {
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

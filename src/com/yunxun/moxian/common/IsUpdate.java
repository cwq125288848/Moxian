package com.yunxun.moxian.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class IsUpdate {
	boolean isUpdate;

	public boolean getIsUpdate() {
		return isUpdate;
	}

	public void setIsUpdate(boolean isUpdate) {
		this.isUpdate = isUpdate;
	}

	public IsUpdate(AndroidDriver<WebElement> driver, boolean flag) {
		WebElement element = driver.findElement(By.name("新版本升级"));
		if (element.isEnabled() && flag) {
			driver.findElementByName("取消").click();
			isUpdate=true;
		} else {
			driver.findElementByName("立即更新").click();
			isUpdate=false;
		}
		
	}
}

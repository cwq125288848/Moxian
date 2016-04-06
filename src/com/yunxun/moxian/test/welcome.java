package com.yunxun.moxian.test;

import org.testng.annotations.Test;
import com.yunxun.moxian.common.AndroidConnect;
import com.yunxun.moxian.common.LOG;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class welcome {
	AndroidDriver<WebElement> driver;
	
	@Test
	public void isAppInstalled() {

		// ����жϽ��
		LOG.INFO("��������isAppInstalled");

		// �ж��Ƿ�װ�ɹ�
		Assert.assertEquals(driver.isAppInstalled("com.yunxun.moxian"), true, "��װʧ��");
	}

	@BeforeTest
	public void beforeTest() {

		AndroidConnect connect = new AndroidConnect();
		driver = connect.getDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}

package com.edusol.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusol.base.CommonMethods;
import com.edusol.utils.PropertyReader;

public class ComposeEmail extends CommonMethods{
	
	public static void mailCompose() {
		
	     WebElement composeEmail= driver.findElement(By.xpath(PropertyReader.getPropValue("composeBtn_xpath")));
	     composeEmail.click();
	     hardwait(2000);
	     WebElement toTextBox= driver.findElement(By.xpath(PropertyReader.getPropValue("toTextBox_containsxpath")));
	     toTextBox.sendKeys("pradipsukate@gmail.com");
	     hardwait(2000);
	     WebElement ccBtn_xpath= driver.findElement(By.xpath(PropertyReader.getPropValue("ccBtn_xpath")));
	     ccBtn_xpath.click();
	     hardwait(2000);
	     WebElement CcTextBox_xpath= driver.findElement(By.xpath(PropertyReader.getPropValue("CcTextBox_xpath")));
	     CcTextBox_xpath.sendKeys("priyalawande@gmail.com");
	     hardwait(2000);
	     WebElement Subject_xpath= driver.findElement(By.xpath(PropertyReader.getPropValue("Subject_xpath")));
	     Subject_xpath.sendKeys("Test Email");
	     hardwait(2000);
	     WebElement sendBtn_xpath= driver.findElement(By.xpath(PropertyReader.getPropValue("sendBtn_xpath")));
	     sendBtn_xpath.click();
	    }
	
		public void sentMailVerify() {
			hardwait(2000);
			WebElement sent = driver.findElement(By.xpath(PropertyReader.getPropValue("sent_xpath")));
			sent.click();
			hardwait(2000);
			String text = driver.findElements(By.xpath(PropertyReader.getPropValue("latestMail_xpath"))).get(1)
					.getText();
			System.out.println(text);
		}

}


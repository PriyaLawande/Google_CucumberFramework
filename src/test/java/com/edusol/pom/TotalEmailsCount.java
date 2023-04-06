package com.edusol.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.edusol.base.CommonMethods;
import com.edusol.utils.PropertyReader;

public class TotalEmailsCount extends CommonMethods {

	public void totalMailsTraverse() {
		hardwait(2000);
		WebElement moreBtn = driver.findElement(By.xpath(PropertyReader.getPropValue("moreBtn_xpath")));
		moreBtn.click();
		hardwait(2000);
		WebElement allMail = driver.findElement(By.xpath(PropertyReader.getPropValue("allMail_xpath")));
		allMail.click();
		hardwait(2000);
		List<WebElement> nextBtn = driver.findElements(By.xpath(PropertyReader.getPropValue("next_xpath")));
		nextBtn.get(1).click();
		hardwait(2000);
		List<WebElement> nextBtn1 = driver.findElements(By.xpath(PropertyReader.getPropValue("next_xpath")));
		nextBtn1.get(2).click();
		hardwait(2000);
		List<WebElement> nextBtn2 = driver.findElements(By.xpath(PropertyReader.getPropValue("next_xpath")));
		nextBtn2.get(2).click();
		

	}

	public void countTotalMails() {
		hardwait(2000);
		List<WebElement> totalMailcount = driver.findElements(By.xpath(PropertyReader.getPropValue("totalMailcount_xpath")));
		System.out.println("Total Mails : "+totalMailcount.get(5).getText());
	}

	
}

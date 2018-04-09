package e2epack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testcase5 {
	@Test
	public void Testcase1(){
	WebDriver d2=new FirefoxDriver();
	d2.get("http:\\www.google.com");
	d2.get("http:\\www.facebook.com");
	d2.findElement(By.id("email")).sendKeys("supreme@gmail.com");
	d2.findElement(By.id("pass")).sendKeys("123456");
	d2.quit();
	}
}

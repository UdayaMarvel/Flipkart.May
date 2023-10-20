package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Update {
    public static void main(String[] args) {
		
	}WebDriverManager.edgedriver().setup();
	   WebDriver driver =new EdgeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	   
	   driver.switchTo().frame(3);
WebElement name= driver.findElement(By.xpath("//input[@type='text']"));
name.sendKeys("maari");  

}
}
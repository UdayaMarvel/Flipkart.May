package org.selenium;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Update2 {
    public static void main(String[] args) {
    	 WebDriverManager.edgedriver().setup();
 		  WebDriver driver =new EdgeDriver();
 		  driver.manage().window().maximize();
// 		  driver.get("https://www.flipkart.com/");
 		  driver.get("https://nxtgenaiacademy.com/multiplewindows/");
 		  Thread.sleep(1000);
 		  WebElement btn = driver.findElement(By.xpath("//button[@name='145newbrowsertab234']"));
 		  for (int i = 1; i <5; i++) {
 			btn.click();
		}
 		  
 		  
 		  String pw = driver.getWindowHandle();
 		  
 		  Set<String> allwin = driver.getWindowHandles();
 		 
// 		 for (String eachwin : allwin) {
// 			 if (!eachwin.equals(pw)) {
// 				 Thread.sleep(3000);
//				driver.switchTo().window(pw);
//			}
			List<String> list = new LinkedList<String>(allwin);
			Thread.sleep(3000);
			driver.switchTo().window(list.get(2));
		}
 		 
	}

	}
}

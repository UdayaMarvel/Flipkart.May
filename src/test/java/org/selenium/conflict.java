package org.selenium;

public class conflict {
      public static void main(String[] args) {
    	  package org.selenium;

    	  import org.openqa.selenium.Alert;
    	  import org.openqa.selenium.By;
    	  import org.openqa.selenium.WebDriver;
    	  import org.openqa.selenium.WebElement;
    	  import org.openqa.selenium.edge.EdgeDriver;

    	  import io.github.bonigarcia.wdm.WebDriverManager;

    	  public class Alert1 {
    	     public static void main(String[] args) throws Throwable {
    	  	  
    	  	  WebDriverManager.edgedriver().setup();
    	  		WebDriver driver =new EdgeDriver();
    	  		 driver.manage().window().maximize();
    	  		 driver.get("https://nxtgenaiacademy.com/alertandpopup/");
    	  		 
    	  		 WebElement alertbox = driver.findElement(By.xpath("//button[@name=\"alertbox\"]"));
    	  		 alertbox.click();
    	  		 Alert alert = driver.switchTo().alert();
    	  		 Thread.sleep(3000);
    	  		 alert.accept();
    	  		 
    	  		 WebElement confirmbox =driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
    	  		 confirmbox.click();
    	  		 Alert confirm =driver.switchTo().alert();
    	  		 Thread.sleep(1000);
    	  		 confirm.dismiss();
    	  		 
    	  		 WebElement promptalert=driver.findElement(By.xpath("//button[@name='promptalertbox1234'] "));
    	  		 promptalert.click();
    	  		 Alert prompt=driver.switchTo().alert();
    	  		 Thread.sleep(3000);
    	  		 prompt.sendKeys("Yes");
    	  		 
    	  		 
    	  		 
    	  		 
    	  		 
    	  		 
    	  		 
    	  		 
    	  }
    	  }

	}
}

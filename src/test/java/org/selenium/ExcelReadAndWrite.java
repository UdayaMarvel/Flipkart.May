package org.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelReadAndWrite {
static int[] a= {1,2,3};
	
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup");
		options.addArguments("--disable-notification");
		options.addArguments("start-maximized");
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.flipkart.com");
		WebElement we = driver.findElement(By.xpath("//button[text()='✕']"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Selenium_Feb\\src\\test\\resources\\excel.xlsx");
		FileOutputStream f1 = new FileOutputStream(f);
		Workbook book = new HSSFWorkbook();
		Sheet sheet = book.createSheet("tools");
		List<WebElement> div = driver.findElements(By.className("eFQ30H"));
		System.out.println("updated");
		
		for(int i =0;i<div.size();i++) {
			WebElement ele = div.get(i);
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(ele.getText());
			System.out.println("updated");
			System.out.println("new updated");
		}
		
		
//		
		book.write(f1);
		book.close();
		System.out.println("test");
		
		FileInputStream f2 = new FileInputStream(f);
		Workbook book1 = new HSSFWorkbook(f2);
		Sheet sheet2 = book.getSheet("tools");
		for (int i = 0; i < div.size(); i++) {
		Row row = sheet.getRow(i);
		
		Cell cell = row.getCell(0);
		
		try {
//			double cellvalue = cell.getNumericCellValue();
//			System.out.println(cellvalue);
			System.out.println(a[1]);
			System.exit(0);
		}
		catch(Exception e){
			System.out.println(a[0]);
//			String cellvalue = cell.getStringCellValue();
//			System.out.println(cellvalue);
		}
		finally {
			System.out.println("this is finally block");
			System.out.println("newly updated");
		}
		}
	}
}

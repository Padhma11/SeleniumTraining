package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver d;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
	}
	public static void windowMax() {
		d.manage().window().maximize();
	}
	public static void launchUrl(String url) {
		d.get(url);
	}
	public static void pageTitle() {
		String title = d.getTitle();
		System.out.println(title);		
	}
	public static void pageUrl() {
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void passText(String txt, WebElement e) {
		e.sendKeys(txt);
	}
	public static void closeBrowser() {
		d.quit();
	}
	public static void clickBtn(WebElement e) {
		e.click();
	}
	public static void screenShot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)d;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location + imgName.png");
		FileUtils.copyFile(image, f);
	}
	public static Actions a;
	
	public static void mouseHover(WebElement targetWebElement) {
		a = new Actions(d);
		a.moveToElement(targetWebElement).perform();
	}
	public static void dragDrop(WebElement dragElement, WebElement dropElement) {
		a = new Actions(d);
		a.dragAndDrop(dragElement, dropElement).perform();
	}
	public static JavascriptExecutor js;
	
	public static void scrollPageDown(WebElement tarWebFile) {
		js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView(true)", tarWebFile);
	}
	public static void scrollPageUp(WebElement tarWeb) {
		js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView(false)", tarWeb);
	}
	public static void excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
		File f = new File("excellocation.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet(sheetName);
		Row r = mysheet.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		int cellType = c.getCellType();
		
		String value = " ";
		if (cellType==1) {
			String value2 = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			SimpleDateFormat sd = new SimpleDateFormat();
			String value3 = sd.format(dd);
		}
		else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			String valueOf = String.valueOf(l);
		}
	}
	public static void createNewExcel(int rowNum, int cellNum, String writeData) throws IOException {
		File f = new File("C:\\Users\\padhm\\eclipse-workspace\\MavenProject\\Excels\\challenge.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet newsheet = wb.createSheet("Data");
		Row newrow = newsheet.createRow(rowNum);
		Cell newcell = newrow.createCell(cellNum);
		newcell.setCellValue(writeData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	public static void createRow(int crerow, int crecell, String newData) throws IOException {
		File f = new File("C:\\Users\\padhm\\eclipse-workspace\\MavenProject\\Excels\\challenge.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Data");
		Row r = s.createRow(crerow);
		Cell c = r.createCell(crecell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	public static void createCell(int getrow, int crecell, String newData) throws IOException {
		File f = new File("C:\\Users\\padhm\\eclipse-workspace\\MavenProject\\Excels\\challenge.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Data");
		Row r = s.getRow(getrow);
		Cell c = r.createCell(crecell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	public static void updateParticularCell(int getRow, int getCell, String existValue, String newValue) throws IOException {
		File f = new File("C:\\Users\\padhm\\eclipse-workspace\\MavenProject\\Excels\\challenge.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Data");
		Row r = s.getRow(getRow);
		Cell c = r.getCell(getCell);
		String str = c.getStringCellValue();
		if (str.equals(existValue)) {
			c.setCellValue(newValue);
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
}

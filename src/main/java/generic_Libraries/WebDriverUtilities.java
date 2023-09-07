package generic_Libraries;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
//handling drop down
public void dropdown(String text,WebElement ele) {
	Select s=new Select(ele);
	s.selectByVisibleText(text);
	
}
//handling mouse over
public void mouseover(WebElement ele,WebDriver driver) {
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	
}
//handling right click
public void rightclick(WebElement ele,WebDriver driver) {
	Actions a=new Actions(driver);
	a.contextClick(ele).perform();
	
}
//handling double click
public void doubleclick(WebElement ele,WebDriver driver) {
	Actions a=new Actions(driver);
	a.doubleClick(ele).perform();
	
}
//handling drag and drop
public void dragndrop(WebElement ele1,WebElement ele2,WebDriver driver) {
	Actions a=new Actions(driver);
	a.dragAndDrop(ele1,ele2).perform();
	
}
//Shifting control to frames
public void switchFrame(WebDriver driver) {
	driver.switchTo().frame(0);
	
}
//Shifting control back to default page
public void switchbackFrame(WebDriver driver) {
	driver.switchTo().defaultContent();
	
}
//handling alter pop up
public void alterPopup(WebDriver driver) {
	driver.switchTo().alert().accept();
	
}
//shifting control to child window
public void switchTabs(WebDriver driver) {
	Set<String> child = driver.getWindowHandles();
	for(String b:child) {
		driver.switchTo().window(b);
	}
//handling scroll bar
/*public void scrollBar(WebDriver driver,int x,int y) 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("windows.scrollBy("+x+","+y+")");
	}*/

}























	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

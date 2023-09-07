package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary_Login {
	//Declaration
	//address of gears
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearbtn;
	
	//address of Skillrary demo app
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;

	//address of search
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchtb;
	
	//address of search button
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	//initialization
	public Skillrary_Login (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public void gearsbutton() {
		gearbtn.click();
	}
	
	public void skillraryDemoApp() {
		demoapp.click();
	}
	
	public void searchTextBox(String name) {
		searchtb.sendKeys(name);
	}
	
	public void goButton() {
		searchbtn.click();
	}
	
	
	
}

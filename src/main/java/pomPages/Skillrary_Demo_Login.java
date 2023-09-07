package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary_Demo_Login {
	//Declaration
	//address of course tab
	@FindBy(id="course")
	private WebElement coursetab;
		
	//address of selenium training
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	//address of drop down
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	//initialization
	public Skillrary_Demo_Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public WebElement getCourseTab() {
		return coursetab;
	}
	
	public void seleniumtrainingtab() {
		seleniumtraining.click();
	}
	
	public WebElement getCoursedd() {
		return coursedd;
	}
	
}

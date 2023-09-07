package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary_dragndrop_page {
	//Declaration
	//address of selenium logo
	@FindBy(xpath="//img[@id='Selenium Training']")
	private WebElement seleniumlogo;
	
	//address of blank spot of my cart
	@FindBy(xpath="//div[@id='cartArea']")
	private WebElement mycart;
	
	//address of blank facebook logo
		@FindBy(xpath="(//a[@href='https://bit.ly/FSKILLRARY'])[2]")
		private WebElement fblogo;
	
	//initialization
	public Skillrary_dragndrop_page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getSeleniumlogo() {
		return seleniumlogo;
	}
	
	public WebElement getMycart() {
		return mycart;
	}
	
	public void facebooklogo() {
		fblogo.click();
	}

}

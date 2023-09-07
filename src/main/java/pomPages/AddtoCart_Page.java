package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart_Page {
	//Declaration
	//address of + button
	@FindBy(id="add")
	private WebElement addbtn;
	
	//address of add to cart
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement cartbtn;
	
	//initialization
	public AddtoCart_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Utilization
	public WebElement getAddbtn() {
		return addbtn;
	}
	
	public void cartButton() {
		cartbtn.click();
	}

	
	
	
	
	
}

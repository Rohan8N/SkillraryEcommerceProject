package Scripts;

import org.testng.annotations.Test;

import generic_Libraries.BaseClass;
import pomPages.Skillrary_Demo_Login;
import pomPages.Skillrary_Login;
import pomPages.Skillrary_dragndrop_page;

public class TestCase2 extends BaseClass{
@Test
public void tc2() {
	Skillrary_Login s=new Skillrary_Login(driver);
	s.gearsbutton();
	s.skillraryDemoApp();
	
	utilities.switchTabs(driver);
	
	Skillrary_Demo_Login sd=new Skillrary_Demo_Login(driver);
	utilities.dropdown("Testing", sd.getCoursedd());
	
	Skillrary_dragndrop_page sd1=new Skillrary_dragndrop_page(driver);
	utilities.dragndrop(sd1.getSeleniumlogo(), sd1.getMycart(), driver);
	
	
}
}

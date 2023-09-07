package Scripts;

import org.testng.annotations.Test;

import generic_Libraries.BaseClass;
import pomPages.AddtoCart_Page;
import pomPages.Skillrary_Demo_Login;
import pomPages.Skillrary_Login;

public class Test_Case1 extends BaseClass{
@Test
public void tc1() {
	Skillrary_Login s=new Skillrary_Login(driver);
	s.gearsbutton();
	s.skillraryDemoApp();
	
	utilities.switchTabs(driver);
	Skillrary_Demo_Login sd=new Skillrary_Demo_Login(driver);
	utilities.mouseover(sd.getCourseTab(), driver);
	sd.seleniumtrainingtab();
	
	AddtoCart_Page ac=new AddtoCart_Page(driver);
	utilities.doubleclick(ac.getAddbtn(), driver);
	ac.cartButton();
	
	utilities.alterPopup(driver);
}
}

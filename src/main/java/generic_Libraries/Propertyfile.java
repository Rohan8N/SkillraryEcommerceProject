package generic_Libraries;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;


public class Propertyfile {
	public String pfile(String key) throws Throwable {

	Properties p=new Properties();
	FileInputStream fis=new FileInputStream(IPathConstant.propertyFilePath);
	p.load(fis);
	return p.getProperty(key);
	
	}
	
	
	
	
	
	
	
	
	
	
	
}

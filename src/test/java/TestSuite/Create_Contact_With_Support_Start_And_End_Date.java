package TestSuite;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.BaseClass.RandomNum;
import com.crm.FileUtility.FileUtility1;
import com.crm.Pom.WebElements;

@Listeners(com.crm.Listeners.Contact_details.class)
public class Create_Contact_With_Support_Start_And_End_Date extends BaseClass{
	@Test
	
	public void create() throws IOException
	{
		preCondition();
		login();
		WebElements w=new WebElements(driver);
	    w.contact.click();
	    w.addContact.click();
	    FileUtility1 org=new FileUtility1();
	     String organ = org. excel("sheet1", 0, 0);
	    w.lname.sendKeys(organ+RandomNum.random());
	   
	    w.save.click();
	    w.logout.click();
	    
	    
	    
	    
	    
	    
	}
	

}

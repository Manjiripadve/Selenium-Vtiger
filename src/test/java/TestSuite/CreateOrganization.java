package TestSuite;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.BaseClass.RandomNum;
import com.crm.FileUtility.FileUtility1;
import com.crm.Pom.WebElements;
@Listeners(com.crm.Listeners.Create_org.class)

public class CreateOrganization extends BaseClass{
	
	@Test
	public void create_org() throws IOException
	{
	    preCondition();
	    login();
       WebElements w=new WebElements(driver);
	    w.org.click();
	    w.create_org.click();
	    FileUtility1 org=new FileUtility1();
	     String organ = org. excel("sheet1", 0, 0);
	      w.org_name.sendKeys(organ+RandomNum.random());
	    w.save.click();
	   assertTrue(w.verify.getText().contains(organ),"It is verify");
	}

}

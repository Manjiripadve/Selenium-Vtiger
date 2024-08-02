package TestSuite;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.BaseClass.RandomNum;
import com.crm.FileUtility.FileUtility1;
import com.crm.Pom.WebElements;
@Listeners(com.crm.Listeners.Create_org_withIndusty.class)

public class CreateOrganizationwithIndustry extends BaseClass
{
	@Test
        public void create_org_with_industry() throws IOException
        {
        	preCondition();
        	login();
        	WebElements w=new WebElements(driver);
        	w.org.click();
        	w.create_org.click();
        	FileUtility1 org=new FileUtility1();
   	     String organ = org. excel("sheet1", 0, 0);
   	    w.org_name.sendKeys(organ+RandomNum.random());
        	Select s=new Select(w.industry);
        	s.selectByValue("Banking");
        	w.save.click();
        	w.profile.click();
        	w.logout.click();
        	
        }
}

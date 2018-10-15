package businesslib;


import genericlib.Constants;
import genericlib.Driver;
import pagefactory.Login;

public class Common 
{
	public static void login() throws InterruptedException
	{
		Driver.dr=Driver.getbrowser();
		Driver.dr.get(Constants.url);
	    Driver.dr.manage().window().maximize();
		Thread.sleep(2000);
		Driver.dr.findElement(Login.un).sendKeys(Constants.userid);
		Driver.dr.findElement(Login.pwd).sendKeys(Constants.password);
		Driver.dr.findElement(Login.lgnbtn).click();
		Thread.sleep(2000);
	}
	

}

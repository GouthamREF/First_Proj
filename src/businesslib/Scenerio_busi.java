package businesslib;

import genericlib.Driver;
import pagefactory.Scenerio;

public class Scenerio_busi 
{
	public static void Scenerio1()
	{
		Driver.dr.findElement(Scenerio.electronics).click();
		Driver.dr.findElement(Scenerio.laptop).click();
		Driver.dr.findElement(Scenerio.mac).click();
	    Driver.dr.findElement(Scenerio.order).click();
	}


}

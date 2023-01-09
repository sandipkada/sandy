package seleniumWebelement;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class screnshotwithdateandtime {

	FileUtils.copyFile(scrnsh= new File("C:\\Users\\Admin\\Desktop\\Screenshot\\facebooko1.jpeg"+datetime));

Calendar calendar = Calendar.getInstance();
SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
private Object screenShotPath;
String destFileName = ((File) screenShotPath).getAbsoluteFile()+File.separator+"failure_screenshots_"+formater.format(calendar.getTime())+".png";



}

package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Read_propertyFiles 
{
	
	static FileInputStream fi;
	static String ifilepath="src\\datadriven\\PropertyFiles\\Input.properties";
	static String ofilepath="src\\datadriven\\PropertyFiles\\Output.properties";
	static Properties prop;
	
	public static void Load_PropertyFile()
	{
		try {
			fi=new FileInputStream(ifilepath);
			prop=new Properties();
			prop.load(fi);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void Store_PropertyFile()
	{
		try {
			prop.store(new FileOutputStream(ofilepath), "");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//Reusable metod to read propery using keyname
	public static String  getProperty(String Keyname)
	{
		Load_PropertyFile();
		return prop.getProperty(Keyname);
	}
	
	public static void setProperty(String keyname,String value)
	{
		prop.setProperty(keyname, value);
	}
	
	public static void main(String[] args) 
	{
		  String Browsername=Read_propertyFiles.getProperty("BROWSER");
		  System.out.println(Browsername);
		
	}

}

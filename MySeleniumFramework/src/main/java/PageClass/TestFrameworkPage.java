package PageClass;
import MyLearningFramework.BaseClass;
import MyLearningFramework.LoggerClass;


public class TestFrameworkPage extends BaseClass{	
	
	// ..
	public static void main(String[] args) { 
	init("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
	
	LoggerClass.log("I", "Testing learning framework ...");
	
	end();
 } // main()
	
} // TestFrameworkPage

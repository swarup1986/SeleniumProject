package TestRunnerofFailedTestCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class testrunnerforfailedtests {

	public static void main(String[] args) {
		TestNG object1=new TestNG();
		List<String> listobject=new ArrayList<String>();
		listobject.add("C:\\Swarup\\workspace\\Test\\test-output\\TestSuite1\\testng-failed.xml");
		object1.setTestSuites(listobject);
		object1.run();	

	}

}

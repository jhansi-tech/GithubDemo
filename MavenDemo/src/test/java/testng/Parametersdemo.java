package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametersdemo {
  @Test
  @Parameters({"DCNO","Tester"})
  public void apply(String DCNO, String Tester ) {
	  System.out.println("Parameters are "+ DCNO);
	  System.out.println("Parameters are when "+ Tester);
  }
  
  public void applyforpayee(String DCNO, String Tester ) {
	  System.out.println("Parameters for another "+ DCNO);
	  System.out.println("Parameters for another"+ Tester
	  		+ " when "+ DCNO);
  }
}

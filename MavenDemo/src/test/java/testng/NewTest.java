package testng;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void Launch() {
	  
	  System.out.println("this code is for launch");
  }
  
  @Test(dependsOnMethods="activity")
  public void login() {
	  
	  System.out.println("this code is for login");
  }
  
  @Test(priority=3)
  public void activity() {
	  int a=19;
	  int b=0;
	  int c=a/b;
	    
	  System.out.println("this code is for activity"+c);
  }
}

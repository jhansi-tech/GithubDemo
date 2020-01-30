package testng;

import org.testng.annotations.Test;

public class groupingdemo {
  @Test(groups= {"Sanity","Smoke"})
  public void login() {
	  
	  System.out.println("code for login");
  }
  
  @Test(groups= {"regression"})
  public void addpayee() {
	  
	  System.out.println("code for addpayee");
  }
  
  @Test(groups= {"Sanity"})
  public void removepayee() {
	  
	  System.out.println("code for removepayee");
  }
}

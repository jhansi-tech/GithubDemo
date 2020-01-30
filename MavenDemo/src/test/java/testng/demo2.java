package testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class demo2 {
  @Test(dataProvider = "credentials")
  public void f(String Un, String Pw) {
	  System.out.println("username for iteration:"+Un);
	  System.out.println("password for iteration:"+Pw);
  }

  @DataProvider
  public Object[][] credentials() {
    return new Object[][] {
      new Object[] { "Demo", "Pass123" },
      new Object[] { "Mercury", "Pass123456" },
    };
  }
}

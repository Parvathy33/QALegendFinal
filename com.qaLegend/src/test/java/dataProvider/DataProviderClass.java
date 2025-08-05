package dataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderClass {

  @DataProvider(name="verifyUnSuccesfulLogin")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "admin", "1277" },
      new Object[] { "henry", "123456" },
      new Object[] { "Tom", "T996" }
    };
  }
}

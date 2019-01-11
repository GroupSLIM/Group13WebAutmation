package testHomePage;

import homePage.MainPage;
import homePage.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSignIn extends SignIn {

   SignIn sn;

   @BeforeMethod
    public void initElements(){
       sn = PageFactory.initElements(driver, SignIn.class);
   }

   @Test
    public void Test1()throws Exception{

      sn.SignInPage();
      sn.SignInPass();
      Thread.sleep(5000);

   }


}

package homePage;

import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;

public class SignIn extends BaseUtil {

    @FindBy(id= "email")
    WebElement UserEmail;

    @FindBy (id = "pass")
    WebElement Userpassword;

   public void SignInPage(){
       UserEmail.sendKeys("lobid.bd@gmail.com");
   }

   public void SignInPass(){
       Userpassword.sendKeys("lac7894561",Keys.ENTER);
   }
}

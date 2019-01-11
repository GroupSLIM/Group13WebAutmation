package homePage;

import base.BaseUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindFriends extends BaseUtil {


    @FindBy(id= "email")
    WebElement UserEmail;

    @FindBy (id = "pass")
    WebElement Userpassword;

    public void SignInPage(){
        UserEmail.sendKeys("lobid.bd@gmail.com");
    }

    public void SignInPass(){
        Userpassword.sendKeys("lac7894561", Keys.ENTER);
    }




    @FindBy (id = "u_e_2")
    WebElement SearchField;

    @FindBy (id = "js_o")
    WebElement Button;

    public void Search(){
        SearchField.sendKeys("mafi rahman");
    }

    public void Btn(){
        Button.click();
    }
}

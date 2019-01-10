package homePage;

import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BaseUtil {



    @FindBy(xpath ="//*[@id=\'pageTitle\']" )
    public static WebElement PageTitle;



    @FindBy (id= "email")
     WebElement UserEmail;

    @FindBy (id = "pass")
    WebElement Userpassword;


    public String validateMainPageTitle(){
        UserEmail.sendKeys("lobid.bd@gmail.com");
        Userpassword.sendKeys("lac7894561");

        return driver.getTitle();
    }

}

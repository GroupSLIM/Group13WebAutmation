package homePage;

import base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BaseUtil {



    @FindBy(xpath ="//*[@id=\'pageTitle\']" )
    public static WebElement PageTitle;

    @FindBy (id = "u_0_c")
    WebElement FirstName;

    @FindBy (id = "u_0_e")
    WebElement LastName;

    @FindBy (id="u_0_h")
    WebElement Email1;

    @FindBy(id="u_0_k")
    WebElement Email2;

    @FindBy (id="u_0_o")
    WebElement Password;

    @FindBy (id="month")
    WebElement Month;

    @FindBy (id="day")
    WebElement Day;

    @FindBy (id="year")
    WebElement Year;

    @FindBy (id="u_0_a")
    WebElement Button;

    @FindBy (id="u_0_u")
    WebElement SignUp;

    //public By Search = By.xpath("//*[@id=\'u_0_u\']");



    public String validateMainPageTitle() {
        FirstName.sendKeys("lobid");
        LastName.sendKeys("ahmed");
        Email1.sendKeys("dmg.lobid@ymail.com");
        Email2.sendKeys("dmg.lobid@ymail.com");
        Password.sendKeys("abcd123gdagdg4");
        Month.sendKeys("feb");
        Day.sendKeys("15");
        Year.sendKeys("1993");
        Button.click();
        SignUp.click();

        return driver.getTitle();

    }

   /* @FindBy (id= "email")
    WebElement UserEmail;

    @FindBy (id = "pass")
    WebElement Userpassword;

    public void signIn () {
        UserEmail.sendKeys("Lobid@gamil.com");
        Userpassword.sendKeys("abcd1234", Keys.ENTER);
    }
*/


    }




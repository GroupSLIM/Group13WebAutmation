package homePage;
import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {
    @FindBy(id = "warehouse-savings")//example need to fix
    public static WebElement viewWareHouseSavings;//example need to fix
     // You will copy and add more

    public void checkviewWareHouseSavings(){ //example need to fix
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewWareHouseSavings.click(); //example need to fix
    }












}

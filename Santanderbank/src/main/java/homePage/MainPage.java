package homePage;
import base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends BaseUtil {
    @FindBy(xpath = "//img[@alt = 'Santander Bank N.A.']")
    public static WebElement SantanderLogo;

    public void checkSantanderLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SantanderLogo.click();
    }
    @FindBy(xpath = "//input[@type ='text' and @id = '_P001_Header_WAR_P001_Headerportlet_search']")
    public static WebElement SearchBox;

    public void checkSearchBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SearchBox.click();
    }
    @FindBy(xpath = "//a[@class = 'txtOpts active' and @target = '_self']")
    public static WebElement Personal;

    public void checkPersonal() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Personal.click();
    }
    @FindBy(xpath = "//a[text()='Business' and @class='txtOpts ']")
    public static WebElement Business;

    public void checkBusiness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Business.click();
    }

    @FindBy(xpath = "//a[text()='Commercial']")
    public static WebElement Commercial;

    public void checkCommercial() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Commercial.click();
    }
    @FindBy(xpath = "//a[text()='About' and @class='txtOpts ']")
    public static WebElement About;

    public void checkAbout() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        About.click();
    }
    @FindBy(xpath = "//h1[@class='titpage alignC']")
    public static WebElement SantanderCommercialBanking;

    public void checkSantanderCommercialBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SantanderCommercialBanking.click();
    }
    @FindBy(xpath = "//span[text()='Banking']")
    public static WebElement Banking;

    public void checkBanking() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Banking.click();
    }
    @FindBy(xpath = " //span[text()='Borrowing']")
    public static WebElement Borrowing;

    public void checkBorrowing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Borrowing.click();
    }
    @FindBy(xpath = " //span[text()='Credit Cards']")
    public static WebElement CreditCards;

    public void checkCreditCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CreditCards.click();
    }



   /* @FindBy(id = "warehouse-savings")//example, need to fix
    public static WebElement viewWareHouseSavings;//example need to fix
    // You will copy and add more

    public void checkviewWareHouseSavings(){ //example need to fix
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewWareHouseSavings.click(); //example need to fix
    }
    public void checkviewWareHouseSings(){ //example need to fix
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewWareHouseSavings.click(); //example need to fix
    }
    public void checkviewWareHouSings(){ //example need to fix
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewWareHouseSavings.click(); //example need to fix
    }
    public void checkviewWareHoumanir(){ //example need to fix
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        viewWareHouseSavings.click(); //example need to fix
    }

*/










}

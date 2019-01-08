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
    @FindBy(xpath = "//span[text()='Prosper and Thrive']")
    public static WebElement ProsperAndThrive;

    public void checkProsperAndThrive() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ProsperAndThrive.click();
    }
    @FindBy(xpath = "//a[text() = 'ATM/Branch Locator']")
    public static WebElement ATMBranchLocator;

    public void checkATMBranchLocator() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ATMBranchLocator.click();
    }
    @FindBy(xpath = "//a[@class='button01 trk-btn']")
    public static WebElement FindALocationNearYou;

    public void checkFindALocationNearYou() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        FindALocationNearYou.click();
    }
    @FindBy(xpath = "//h4[text()='Contact Us']")
    public static WebElement ContactUs;

    public void checkContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ContactUs.click();
    }
    @FindBy(xpath = "//h4[text()='Privacy Policy']")
    public static WebElement PrivacyPolicy;

    public void checkPrivacyPolicy() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        PrivacyPolicy.click();
    }
    @FindBy(xpath = "//h4[text()='Terms of Use']")
    public static WebElement TermsOfUse;

    public void checkTermsOfUse() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        TermsOfUse.click();
    }
    @FindBy(xpath = "//h4[text()='Home']")
    public static WebElement Home;

    public void checkHome() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        Home.click();
    }

}

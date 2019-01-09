package testHomePage;
import base.BaseUtil;
import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
public class TestHomePageFB extends MainPage{
    MainPage mainPage;
    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage = PageFactory.initElements(driver, MainPage.class);
    }

    //You have to do from bellow line


    @Test
    public void testviewWareHouseSavings() { //need to fix its an example
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkviewWareHouseSavings(); //need to fix its an example
    }

    @Test
    public void testviewWareHouseS() { //need to fix its an example
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkviewWareHouseSavings(); //need to fix its an example
    }
    @Test
    public void testview() { //need to fix its an example
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkviewWareHouseSavings(); //need to fix its an example
    }
    @Test
    public void testviewjjjj() { //need to fix its an example
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkviewWareHouseSavings(); //need to fix its an example
    }

    public void testviejjj() { //need to fix its an example
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkviewWareHouseSavings(); //need to fix its an example
    }
    public void testviejjj() { //need to fix its an example
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainPage.checkviewWareHouseSavings(); //need to fix its an example
    }
















}

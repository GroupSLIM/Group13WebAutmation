package testHomePage;
import homePage.FindFriends;
import homePage.MainPage;
import homePage.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePageFB extends MainPage {

    MainPage mainPage;

    @BeforeMethod
    public void init() {
        mainPage = PageFactory.initElements(driver, MainPage.class);

        //You have to do from bellow line
    }

    @Test

    public void mainPageTitleTest() {
        String title = mainPage.validateMainPageTitle();
        System.out.println("this is my page title:" + title);
    }

    FindFriends FF;


    public void initElements(){
        FF = PageFactory.initElements(driver, FindFriends.class);
    }

    @Test
    public void test2(){
        FF.Search();
        FF.Btn();
    }


    @Test
    public void Test1(){
        sn.SignInPage();
        sn.SignInPass();
    }

   SignIn sn;


    public void init2(){
       sn = PageFactory.initElements(driver, SignIn.class);
   }


//
//
//
//
//
//
//
//
//
//
//
//
//    @Test
//    public void CreateAccount() {
//        String NewAcc = mainPage.CreateAccount();{
//            System.out.println(NewAcc);
//        }

    @AfterClass
    public void closeBrowser() throws InterruptedException {

        if (driver != null) {
            driver.manage().deleteAllCookies();
            Thread.sleep(10000);
            //driver.quit();

        }}

    }



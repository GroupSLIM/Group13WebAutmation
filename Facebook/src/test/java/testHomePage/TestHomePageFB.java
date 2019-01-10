package testHomePage;
import homePage.MainPage;
import org.openqa.selenium.support.PageFactory;
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

    public void mainPageTitleTest(){
        String title = mainPage.validateMainPageTitle();
        System.out.println("this is my page title:"+ title);
    }

}

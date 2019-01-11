package testHomePage;

import homePage.FindFriends;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSearch extends FindFriends {

    FindFriends FF;

    @BeforeMethod
    public void initElements(){
        FF = PageFactory.initElements(driver, FindFriends.class);
    }

    @Test
    public void test2(){
        FF.SignInPage();
        FF.SignInPass();

        FF.Search();
        FF.Btn();
    }

}

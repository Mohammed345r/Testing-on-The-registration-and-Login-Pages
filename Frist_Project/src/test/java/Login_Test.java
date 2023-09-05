import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import stsrucure.Login_page;

public class Login_Test {
WebDriver driver;
Login_page page1;
    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        page1= new Login_page(driver);
        page1.click_login_page();
    }
    @Test(priority = 1)
    public void login_vaild(){
        page1= new Login_page(driver);
        page1.vaild("Mohammed52292324444@gmail.com","Mohammed3333344444");
    }
    @Test(priority = 2)
    public void login_Invaild_password(){
        page1= new Login_page(driver);
        page1.invaild_password("Mohammed5222324444@gmail.com","Mohammed54443");
    }
    @Test(priority = 3)
    public void login_Invaild_mail(){
        page1= new Login_page(driver);
        page1.invaild_email("HHHHHHHHHHHH@gmail.com","Mohammed3333344444");
    }
@AfterMethod(enabled = false)
    public void quitall(){
        driver.quit();
}
}

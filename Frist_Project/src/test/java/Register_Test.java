import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
import stsrucure.Registression_page;

public class Register_Test {
WebDriver driver;
Registression_page page1;
    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        page1=new Registression_page(driver);
        page1.click_registression();

    }
    @Test(priority = 1)
    public void Register_male(){
        page1=new Registression_page(driver);
        page1.male_registresion("Mohammed","Mostafa","Mohammed52292324444@gmail.com",
                "Mohammed3333344444","Mohammed3333344444");
        page1.male_registresion("1","March","2000","Elmostafa");

        page1.click_register();
    }
    @Test(priority = 2)
    public void Register_female(){
        page1=new Registression_page(driver);
        page1.Fmale_registresion("mona","ahmed","mona4434454@gmail.com",
                "mona3333344444","mona3333344444");
        page1.Fmale_registresion("30","March","1999","Elmona");

        page1.click_register();
    }
}

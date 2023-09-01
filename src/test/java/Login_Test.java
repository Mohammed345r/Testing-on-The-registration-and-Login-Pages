import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Test {
WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F%3Ffbclid%3DIwAR3UGA7OS6mNHtJNcVYPIndtFMDuZ2TcYQDjng8FH4eHsiLxOZbuzxmWeZ4");
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void login_vaild(){
        WebElement email= driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        email.sendKeys("Mohammed5222324444@gmail.com");
        WebElement password= driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        password.sendKeys("Mohammed3333344444");
        WebElement check_box=driver.findElement(By.id("RememberMe"));
        check_box.click();
        WebElement btn= driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
        btn.click();
    }
    @Test(priority = 2)
    public void login_Invaild1(){
        WebElement email= driver.findElement(By.name("Email"));
        email.sendKeys("Mohammed5222324444@gmail.com");
        WebElement password= driver.findElement(By.name("Password"));
        password.sendKeys("Mohammed54443");
        WebElement btn= driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
        btn.click();
    }
    @Test(priority = 3)
    public void login_Invaild2(){
        WebElement email= driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        email.sendKeys("HHHHHHHHHHHH@gmail.com");
        WebElement password= driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        password.sendKeys("Mohammed3333344444");
        WebElement btn= driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
        btn.click();
    }

}

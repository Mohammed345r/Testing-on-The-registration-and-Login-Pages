import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class Register_Test {
WebDriver driver;
    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F%3Ffbclid%3DIwAR3UGA7OS6mNHtJNcVYPIndtFMDuZ2TcYQDjng8FH4eHsiLxOZbuzxmWeZ4");
        driver.manage().window().maximize();
        WebElement register=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button"));
        register.click();
    }
    @Test
    public void Register_valid(){
         WebElement male= driver.findElement(By.id("gender-male"));
         male.click();
         WebElement frist_Name= driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
        frist_Name.sendKeys("Mohammed");
        WebElement last_Name= driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
        last_Name.sendKeys("Mostafa");
        Select Day = new Select(driver.findElement(By.name("DateOfBirthDay")));
        Day.selectByVisibleText("1");
        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        month.selectByVisibleText("March");
        Select year = new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.selectByVisibleText("2000");
        WebElement email= driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        email.sendKeys("Mohammed5222324444@gmail.com");
        WebElement company= driver.findElement(By.xpath("//*[@id=\"Company\"]"));
        company.sendKeys("elmostafa.com");
        WebElement checkbox=driver.findElement(By.name("Newsletter"));
        checkbox.click();
        WebElement pass= driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        pass.sendKeys("Mohammed3333344444");
        WebElement conf_pass= driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]"));
        conf_pass.sendKeys("Mohammed3333344444");
        WebElement click_btn=driver.findElement(By.xpath("//*[@id=\"register-button\"]"));
        click_btn.submit();




    }
}

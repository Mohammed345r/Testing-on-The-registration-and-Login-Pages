package stsrucure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import javax.print.attribute.standard.JobHoldUntil;

public class Registression_page extends Home_Page {
 By male = By.id("gender-male");
 By Famale= By.xpath("//*[@id=\"gender-female\"]");
 By Frist_name= By.xpath("//*[@id=\"FirstName\"]");
 By Last_name= By.xpath("//*[@id=\"LastName\"]");
 By DateOfBirthDay =By.name("DateOfBirthDay");
 By DateOfBirthmonth=By.name("DateOfBirthMonth");
 By DateOfBirthyear=By.name("DateOfBirthYear");
 By email = By.xpath("//*[@id=\"Email\"]");
 By company = By.xpath("//*[@id=\"Company\"]");
 By check_box= By.name("Newsletter");
 By pass= By.xpath("//*[@id=\"Password\"]");
 By conf_pass=By.xpath("//*[@id=\"ConfirmPassword\"]");
 By regis_btn=By.xpath("//*[@id=\"register-button\"]");


    public Registression_page(WebDriver driver){
        super(driver);
    }

    @Override
    public void click_registression(){
        driver.findElement(register_botton).click();
    }


 public void male_registresion(String Day,String manth,String year,String Company){
     Select day = new Select(driver.findElement(DateOfBirthDay));
     day.selectByVisibleText(Day);
     Select M = new Select(driver.findElement(DateOfBirthmonth));
     M.selectByVisibleText(manth);
     Select Y = new Select(driver.findElement(DateOfBirthyear));
     Y.selectByVisibleText(year);
     driver.findElement(company).sendKeys(Company);
     driver.findElement(check_box).click();
 }
    public void male_registresion(String Frist_namee,String Last_namee,String emaile,String password,String confirm){
        driver.findElement(male).click();
        driver.findElement(Frist_name).sendKeys(Frist_namee);
        driver.findElement(Last_name).sendKeys(Last_namee);
        driver.findElement(email).sendKeys(emaile);
        driver.findElement(pass).sendKeys(password);
        driver.findElement(conf_pass).sendKeys(confirm);

    }
    public void Fmale_registresion(String Day,String manth,String year,String Company){
        Select day = new Select(driver.findElement(DateOfBirthDay));
        day.selectByVisibleText(Day);
        Select M = new Select(driver.findElement(DateOfBirthmonth));
        M.selectByVisibleText(manth);
        Select Y = new Select(driver.findElement(DateOfBirthyear));
        Y.selectByVisibleText(year);
        driver.findElement(company).sendKeys(Company);
    }
    public void Fmale_registresion(String Frist_namee,String Last_namee,String emaile,String password,String confirm){
        driver.findElement(Famale).click();
        driver.findElement(Frist_name).sendKeys(Frist_namee);
        driver.findElement(Last_name).sendKeys(Last_namee);
        driver.findElement(email).sendKeys(emaile);
        driver.findElement(pass).sendKeys(password);
        driver.findElement(conf_pass).sendKeys(confirm);

    }

    public void click_register(){
        driver.findElement(regis_btn).click();
    }

    }

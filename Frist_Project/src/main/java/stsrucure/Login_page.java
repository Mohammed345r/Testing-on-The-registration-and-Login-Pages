package stsrucure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_page extends Home_Page{
 By Email_Text=By.name("Email");
 By Pass= By.name("Password");
 By btn_click= By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    public Login_page(WebDriver driver){
        super(driver);
    }

    @Override
    public void click_login_page(){
        driver.findElement(login_botton).click();
    }

    public void vaild(String email,String passwrd){
        driver.findElement(Email_Text).sendKeys(email);
        driver.findElement(Pass).sendKeys(passwrd);
        driver.findElement(btn_click).click();
    }
    public void invaild_email(String email,String passwrd){
        driver.findElement(Email_Text).sendKeys(email);
        driver.findElement(Pass).sendKeys(passwrd);
        driver.findElement(btn_click).click();
    }
    public void invaild_password(String email,String passwrd){
        driver.findElement(Email_Text).sendKeys(email);
        driver.findElement(Pass).sendKeys(passwrd);
        driver.findElement(btn_click).click();
    }

}

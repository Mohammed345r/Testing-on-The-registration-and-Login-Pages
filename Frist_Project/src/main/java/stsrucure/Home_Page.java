package stsrucure;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home_Page {
    WebDriver driver;
    By login_botton= By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
    By register_botton= By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    By search_btn= By.xpath("//*[@id=\"small-search-box-form\"]/button");
    By search_text= By.xpath("//*[@id=\"small-searchterms\"]");

    public Home_Page(WebDriver driver){
        this.driver=driver;
    }
    public void click_login_page(){
        driver.findElement(login_botton).click();
    }
    public void serach(String text){
        driver.findElement(search_text).sendKeys(text);
        driver.findElement(search_btn).click();
    }
    public void click_registression(){
        driver.findElement(register_botton).click();
    }



}
